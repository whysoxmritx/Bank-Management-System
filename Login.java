import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Login {
    public static void main(String[] args){
        JFrame f=new JFrame("LOGIN");
        f.setSize(500,600);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.getContentPane().setBackground(new Color(30,30,60));
        ImageIcon ig=new ImageIcon("logo.jpg");
        Image img = ig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(img);
        JLabel logo = new JLabel(scaledIcon);
        logo.setBounds(200, 40, 80, 80);
        f.setIconImage(ig.getImage());
        f.add(logo);
        Font tf=new Font(Font.MONOSPACED,1,17);
        JLabel text=new JLabel("Welcome to FinSutra");
        text.setForeground(Color.white);
        text.setFont(tf);
        f.add(text);
        text.setBounds(150,130,300,50);
        JLabel user=new JLabel("User Name");
        JLabel pass=new JLabel("Password");
        JTextField userText=new JTextField();
        JPasswordField passText=new JPasswordField();
        JButton login=new JButton("Login");
        JButton sign=new JButton("Sign up");
        passText.setEchoChar('*');
        user.setFont(tf);
        user.setForeground(Color.white);
        pass.setFont(tf);
        pass.setForeground(Color.white);
        f.add(user);
        f.add(pass);
        f.add(userText);
        f.add(passText);
        f.add(login);
        f.add(sign);
        sign.setBounds(130,330,100,40);
        user.setBounds(100, 200, 100, 30);
        userText.setBounds(220, 200, 150, 30);
        pass.setBounds(100, 260, 100, 30);
        passText.setBounds(220, 260, 150, 30);
        login.setBounds(250, 330, 100, 40);
        JLabel forgot=new JLabel("Forgot Password?");
        f.add(forgot);
        forgot.setForeground(new Color(180,150,255));
        forgot.setBounds(270,295,150,20);
        forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgot.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JDialog reset=new JDialog(f,"Reset Password",true);
                reset.setSize(350,250);
                reset.setLayout(null);
                reset.setLocationRelativeTo(f);
                reset.getContentPane().setBackground(new Color(40,40,70));
                JLabel debit=new JLabel("Debit Card No.");
                reset.add(debit);
                debit.setForeground(Color.white);
                debit.setBounds(30,30,100,30);
                JLabel cvv=new JLabel("CVV*");
                reset.add(cvv);
                cvv.setForeground(Color.white);
                cvv.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                    JOptionPane.showMessageDialog(reset,"See at the back of the card.");
                    }
                });
                cvv.setBounds(30,70,120,30);
                JTextField email=new JTextField();
                reset.add(email);
                JLabel newPass=new JLabel("New Password");
                reset.add(newPass);
                newPass.setForeground(Color.white);
                newPass.setBounds(30,110,120,30);
                JTextField card=new JTextField();
                reset.add(card);
                card.setBounds(150,30,120,30);
                JTextField cvV=new JTextField();
                reset.add(cvV);
                cvV.setBounds(150,70,120,30);
                JPasswordField pas=new JPasswordField();
                reset.add(pas);
                pas.setBounds(150,110,120,30);
                JButton reSet=new JButton("RESET");
                reset.add(reSet);
                reSet.setBackground(new Color(102, 153, 255));
                reSet.setBounds(130,150,100,40);
                reSet.addActionListener(ev->{
                    String cardNo=card.getText().trim();
                    String newW=new String(pas.getPassword());
                    String c=cvV.getText().trim();
                    if (cardNo.isEmpty() || c.isEmpty() || newW.isEmpty()) {
                        JOptionPane.showMessageDialog(reset, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (!cardNo.matches("\\d{16}")) {
                        JOptionPane.showMessageDialog(reset, "Invalid card number. Must be 16 digits.");
                    } else if (!c.matches("\\d{3}")) {
                        JOptionPane.showMessageDialog(reset, "Invalid CVV. Must be 3 digits.");
                    } else if (!newW.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{6,}$")) {
                        JOptionPane.showMessageDialog(reset,
                                "<html>Password must contain:<br>- At least 6 characters<br>- 1 uppercase<br>- 1 lowercase<br>- 1 special character</html>",
                                "Weak Password",
                                JOptionPane.WARNING_MESSAGE
                        );
                    } else {
                        // Password reset successful
                        JOptionPane.showMessageDialog(reset, "Password reset successful!");
                        reset.dispose(); // close the dialog
                    }
                });
                reset.setVisible(true);
            }
        });
        JButton balance=new JButton("Balance Enquiry");
        f.add(balance);
        balance.setBounds(165,400,150,40);
        balance.addActionListener(e->{
            JDialog bal=new JDialog(f,"Balance Enquiry",true);
            bal.setSize(350,250);
            bal.setLayout(null);
            bal.setLocationRelativeTo(f);
            bal.getContentPane().setBackground(new Color(40,40,70));
            JLabel ac=new JLabel("A/C no.:");
            bal.add(ac);
            ac.setForeground(Color.lightGray);
            ac.setBounds(30,30,100,30);
            JTextField b=new JTextField();
            bal.add(b);
            b.setBounds(150,30,130,30);
            JLabel phn=new JLabel("Phone No.:");
            bal.add(phn);
            phn.setForeground(Color.lightGray);
            phn.setBounds(30,70,100,30);
            JTextField ph=new JTextField();
            bal.add(ph);
            ph.setBounds(150,70,130,30);
            JLabel branch=new JLabel("Branch:");
            bal.add(branch);
            branch.setForeground(Color.lightGray);
            branch.setBounds(30,110,100,30);
            JTextField brn=new JTextField();
            bal.add(brn);
            brn.setBounds(150,110,130,30);
            JButton chq=new JButton("Check Balance");
            bal.add(chq);
            chq.setBounds(110,155,120,30);
            chq.setBackground(new Color(102, 153, 255));
            chq.addActionListener(ev->{
                String account = b.getText();
                String phone = ph.getText();
                String branchName = brn.getText();
                if(account.isEmpty()||phone.isEmpty()||branchName.isEmpty())
                {
                    JOptionPane.showMessageDialog(bal,"All fields are mandatory","Error",JOptionPane.ERROR_MESSAGE);
                }
               else if(account.equals("10125889489") && phone.equals("7238579935") && branchName.equals("Ashok Nagar")) {
                    JOptionPane.showMessageDialog(bal,"Balance: 1,00,000.00");
                } else {
                    JOptionPane.showMessageDialog(bal,"Account not found!");
                }
            });
            bal.setVisible(true);
        });
        login.addActionListener(e -> {
            String uname = userText.getText();
            String pwd = passText.getText();

            if (uname.isEmpty() || pwd.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Please fill all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (uname.equals("Akshat") && pwd.equals("Ak$hat0")) {
                login.addActionListener(a->{
                    f.dispose();
                    new HomePage();
                });
            } else {
                JOptionPane.showMessageDialog(f, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        JLabel terms=new JLabel("By clicking on 'Login' you accept that you have read out");
        f.add(terms);
        terms.setForeground(Color.lightGray);
        terms.setFont(new Font(Font.SANS_SERIF,2,12));
        terms.setBounds(100,450,320,30);
        JLabel conditions=new JLabel("*Terms & conditions.");
        f.add(conditions);
        conditions.setForeground(Color.lightGray);
        conditions.setFont(new Font(Font.SANS_SERIF,2,12));
        conditions.setBounds(185,465,200,30);
        conditions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        conditions.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(f, "Terms and Conditions:\n1. Secure login\n2. Data privacy guaranteed.");
            }
        });
        sign.addActionListener(e->{
            f.dispose();
            new SignUp();
        });
        f.setVisible(true);
    }
}

