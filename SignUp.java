import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.Random;
public class SignUp {
    public SignUp(){
        JFrame s=new JFrame("Sign Up");
        s.setSize(500,600);
        s.setDefaultCloseOperation(s.EXIT_ON_CLOSE);
        s.setLayout(null);
        s.setLocationRelativeTo(null);
        s.getContentPane().setBackground(new Color(30,30,60));
        ImageIcon ig=new ImageIcon("logo.jpg");
        s.setIconImage(ig.getImage());
        JLabel welcome=new JLabel("Welcome New User");
        s.add(welcome);
        welcome.setForeground(new Color(102,153,255));
        welcome.setFont(new Font(Font.DIALOG_INPUT,1,20));
        welcome.setBounds(150,60,300,40);
        JLabel fName=new JLabel("Name");
        s.add(fName);
        fName.setForeground(Color.white);
        fName.setFont(new Font(Font.MONOSPACED,1,17));
        fName.setBounds(80,100,300,40);
        JLabel sName=new JLabel("Account Number");
        s.add(sName);
        sName.setForeground(Color.white);
        sName.setFont(new Font(Font.MONOSPACED,1,17));
        sName.setBounds(80,150,300,40);
        JLabel email=new JLabel("Email");
        s.add(email);
        email.setForeground(Color.white);
        email.setFont(new Font(Font.MONOSPACED,1,17));
        email.setBounds(80,200,300,40);
        // 1. Generate random CAPTCHA text
        String captchaStr = String.valueOf((int)(Math.random() * 9000 + 1000)); // 4-digit

// 2. Create CAPTCHA image
        int width = 150, height = 50;
        BufferedImage captchaImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = captchaImage.createGraphics();

// 3. Draw background with noise
        Random rand = new Random();
        g2d.setColor(new Color(220, 220, 255)); // Light color base
        g2d.fillRect(0, 0, width, height);

// Add random lines for noise
        for (int i = 0; i < 10; i++) {
            int x1 = rand.nextInt(width);
            int y1 = rand.nextInt(height);
            int x2 = rand.nextInt(width);
            int y2 = rand.nextInt(height);
            g2d.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
            g2d.drawLine(x1, y1, x2, y2);
        }

// 4. Draw CAPTCHA text
        g2d.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
        g2d.setColor(Color.BLACK);
        g2d.drawString(captchaStr, 30, 35);
        g2d.dispose();

// 5. Convert image to JLabel
        ImageIcon icon = new ImageIcon(captchaImage);
        JLabel captchaLabel = new JLabel(icon);
        captchaLabel.setBounds(80, 350, width, height);
        s.add(captchaLabel);

// 6. Add CAPTCHA input field
        JTextField captchaInput = new JTextField();
        captchaInput.setBounds(250, 355, 100, 30);
        s.add(captchaInput);

// 7. Submit button
        JButton submit = new JButton("Submit");
        submit.setBounds(180, 450, 100, 40);
        submit.setBackground(new Color(102, 153, 255));
        submit.setForeground(Color.WHITE);
        s.add(submit);

// 8. Validate CAPTCHA
        submit.addActionListener(e -> {
            String entered = captchaInput.getText().trim();
            if (entered.equals(captchaStr)) {
                JOptionPane.showMessageDialog(s, "Sign up successful!");
                // new Login(); or move forward
            } else {
                JOptionPane.showMessageDialog(s, "Invalid CAPTCHA. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        JTextField n1=new JTextField();
        s.add(n1);
        n1.setBounds(250,107,130,30);
        JTextField n2=new JTextField();
        s.add(n2);
        n2.setBounds(250,160,130,30);
        JTextField emailText=new JTextField();
        s.add(emailText);
        emailText.setBounds(250,210,200,30);
        JLabel enter=new JLabel("Enter Captcha:");
        s.add(enter);
        enter.setFont(new Font(Font.MONOSPACED,1,17));
        enter.setForeground(Color.white);
        enter.setBounds(80,310,200,40);
        JLabel pass = new JLabel("Password");
        pass.setForeground(Color.white);
        pass.setFont(new Font(Font.MONOSPACED, 1, 17));
        pass.setBounds(80, 255, 300, 40);
        s.add(pass);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(250, 260, 130, 30);
        s.add(passField);
        JCheckBox terms = new JCheckBox("I accept the Terms and Conditions.");
        terms.setBounds(120, 410, 300, 20);
        terms.setForeground(Color.WHITE);
        terms.setOpaque(false);
        s.add(terms);
        JCheckBox showPass = new JCheckBox("Show Password");
        showPass.setBounds(310, 300, 150, 20);
        showPass.setForeground(Color.WHITE);
        showPass.setOpaque(false);
        s.add(showPass);

        showPass.addActionListener(e -> {
            passField.setEchoChar(showPass.isSelected() ? (char) 0 : '*');
        });
        submit.addActionListener(e -> {
            String name = n1.getText().trim();
            String accNum = n2.getText().trim();
            String emailStr = emailText.getText().trim();
            String passStr = new String(passField.getPassword()).trim();
            String enteredCaptcha = captchaInput.getText().trim();

            if (name.isEmpty() || accNum.isEmpty() || emailStr.isEmpty() || passStr.isEmpty()) {
                JOptionPane.showMessageDialog(s, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!accNum.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(s, "Account number must be exactly 11 digits!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!emailStr.contains("@") || !emailStr.contains(".")) {
                JOptionPane.showMessageDialog(s, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!terms.isSelected()) {
                JOptionPane.showMessageDialog(s, "You must accept the Terms and Conditions.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!enteredCaptcha.equals(captchaStr)) {
                JOptionPane.showMessageDialog(s, "Invalid CAPTCHA. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!passStr.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{6,}$")) {
                JOptionPane.showMessageDialog(s,
                        "Password must:\n- Be at least 6 characters\n- Include a capital letter\n- Include a small letter\n- Include a special character",
                        "Weak Password", JOptionPane.WARNING_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(s, "Sign up successful!");
            s.dispose();
            new HomePage();
        });
            s.setVisible(true);
    }
    public static void main(String args[])
    {
        new SignUp();
    }
}