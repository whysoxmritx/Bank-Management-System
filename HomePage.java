import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class HomePage {
    public HomePage(){
        JFrame h=new JFrame("Home Page");
        h.setSize(500,600);
        h.setDefaultCloseOperation(h.EXIT_ON_CLOSE);
        h.setLayout(null);
        h.setLocationRelativeTo(null);
        h.setResizable(false);
        h.getContentPane().setBackground(new Color(30,30,60));
        ImageIcon ig=new ImageIcon("logo.jpg");
        h.setIconImage(ig.getImage());
        JLabel welcome=new JLabel("HELLO AKSHAT!");
        h.add(welcome);
        welcome.setForeground(new Color(180,150,225));
        welcome.setFont(new Font(Font.MONOSPACED,1,20));
        welcome.setBounds(160,60,200,40);
        JLabel text=new JLabel("Thank you for choosing FinSutra");
        h.add(text);
        text.setForeground(Color.white);
        text.setFont(new Font(Font.DIALOG_INPUT,1,15));
        text.setBounds(100,100,300,20);
        JPanel tabPanel=new JPanel();
        h.add(tabPanel);
        tabPanel.setBackground(new Color(75,110,130));
        tabPanel.setLayout(new FlowLayout(FlowLayout.LEFT,8,5));
        tabPanel.setBounds(0,0,500,38);
        String[] tabs={"Home","Transactions","Calculator","Logout","About us"};
        for(String t:tabs)
        {
            JButton button=new JButton(t);
            button.setFocusPainted(false);
            button.setForeground(Color.white);
            button.setBackground(new Color(75,110,130));
            button.setBorderPainted(false);
            button.setFont(new Font(Font.SANS_SERIF,1,13));
            if(t.equals("Home"))
            {
                button.setBackground(new Color(255,153,0));
                button.setForeground(Color.black);
            }
            tabPanel.add(button);
            button.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(new Color(255, 200, 100));
                }
                public void mouseExited(MouseEvent e) {
                    if (!t.equals("Home"))
                        button.setBackground(new Color(75,110,130));
}
            });
            if(t.equals("Calculator"))
            {
                button.addActionListener(e->{
                    JDialog cal=new JDialog(h,"Balance Enquiry",true);
                    cal.setSize(400,350);
                    cal.setLayout(null);
                    cal.setLocationRelativeTo(h);
                    cal.getContentPane().setBackground(new Color(40,40,70));
                    JLabel labelPrincipal = new JLabel("Principal (₹):");
                    JTextField textPrincipal = new JTextField();
                    JLabel labelRate = new JLabel("Rate (% per annum):");
                    JTextField textRate = new JTextField();
                    JLabel labelTime = new JLabel("Time (years):");
                    JTextField textTime = new JTextField();
                    JLabel labelType = new JLabel("Interest Type:");
                    JComboBox<String> interestTypeBox = new JComboBox<>(new String[]{"Simple Interest", "Compound Interest"});
                    JLabel labelResult = new JLabel("Interest = ₹0.00");
                    JButton calcButton = new JButton("Calculate");
                    JButton clearButton = new JButton("Clear");
                    calcButton.addActionListener(ev -> {
                        try {
                            double principal = Double.parseDouble(textPrincipal.getText());
                            double rate = Double.parseDouble(textRate.getText());
                            double time = Double.parseDouble(textTime.getText());

                            String selectedType = (String) interestTypeBox.getSelectedItem();
                            double interest;

                            if ("Simple Interest".equals(selectedType)) {
                                interest = (principal * rate * time) / 100;
                            } else {
                                interest = principal * Math.pow((1 + rate / 100), time) - principal;
                            }

                            labelResult.setText(String.format("Interest = ₹%.2f", interest));
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(cal, "Please enter valid numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
                        }
                    });

                    clearButton.addActionListener(ev -> {
                        textPrincipal.setText("");
                        textRate.setText("");
                        textTime.setText("");
                        interestTypeBox.setSelectedIndex(0);
                        labelResult.setText("Interest = ₹0.00");
                    });

                    cal.add(labelPrincipal); cal.add(textPrincipal);
                    cal.add(labelRate);     cal.add(textRate);
                    cal.add(labelTime);     cal.add(textTime);
                    cal.add(labelType);     cal.add(interestTypeBox);
                    cal.add(calcButton);    cal.add(clearButton);
                    cal.add(new JLabel());  cal.add(labelResult);
                    labelPrincipal.setBounds(30, 20, 150, 20);
                    labelPrincipal.setForeground(Color.WHITE);
                    textPrincipal.setBounds(180, 20, 160, 25);
                    labelRate.setBounds(30, 60, 150, 20);
                    labelRate.setForeground(Color.WHITE);
                    textRate.setBounds(180, 60, 160, 25);
                    labelTime.setBounds(30, 100, 150, 20);
                    labelTime.setForeground(Color.WHITE);
                    textTime.setBounds(180, 100, 160, 25);
                    labelType.setBounds(30, 140, 150, 20);
                    labelType.setForeground(Color.WHITE);
                    interestTypeBox.setBounds(180, 140, 160, 25);
                    labelResult.setBounds(30, 240, 300, 25);
                    labelResult.setForeground(Color.CYAN);
                    calcButton.setBounds(60, 190, 100, 30);
                    clearButton.setBounds(200, 190, 100, 30);

                    cal.setVisible(true);
                });
            }
            if(t.equals("About us"))
            {
                button.addActionListener(r->{
                    h.dispose();
                    new AboutUs();
                });
            }
            if (t.equals("Logout")) {
                button.addActionListener(e -> {
                    int confirm = JOptionPane.showConfirmDialog(h, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        h.dispose();
                        new Login(); // Your login class
   }});
            }
        }
        int blockWidth = 140;
        int blockHeight=80;
        int gap=(500-3*blockWidth)/4;
        int y=30;
        int x=gap;
        int x2=x+blockWidth+gap;
        int x3=x2+blockWidth+gap;
        JPanel body=new JPanel();
        body.setBounds(0,130,500,500);
        body.setBackground(new Color(30,30,60));
        body.setLayout(null);
        h.add(body);
        JPanel block1=new JPanel();
        block1.setBounds(x,y,blockWidth,blockHeight);
        block1.setBackground(new Color(102,153,255));
        block1.setLayout(new GridLayout(1,1));
        body.add(block1);
        block1.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
        JPanel block2=new JPanel();
        block2.setBackground(new Color(102,153,255));
        block2.setBounds(x2,y,blockWidth,blockHeight);
        block2.setLayout(new GridLayout(1,1));
        block2.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
        body.add(block2);
        JPanel block3=new JPanel();
        body.add(block3);
        block3.setBackground(new Color(102,153,255));
        block3.setBounds(x3,y,blockWidth,blockHeight);
        block3.setBorder(BorderFactory.createLineBorder(Color.white,2,true));
        block3.setLayout(new GridLayout(1,1));
        JLabel label1 = new JLabel("<html><center>Balance<br><b>₹25,000.00</b></center></html>", SwingConstants.CENTER);
        label1.setForeground(Color.white);
        label1.setFont(new Font(Font.SANS_SERIF,1,12));
        block1.add(label1);
        JLabel label2 = new JLabel("<html><center>Fixed Deposit<br><b>Interest: 5.7% p.a.<br>Duration: till 2027</b></center></html>", SwingConstants.CENTER);
        label2.setForeground(Color.white);
        label2.setFont(new Font(Font.SANS_SERIF,1,12));
        block2.add(label2);
        JLabel label3 = new JLabel("<html><center>CIBIL Score<br><b>740</b></center></html>", SwingConstants.CENTER);
        label3.setForeground(Color.white);
        label3.setFont(new Font(Font.SANS_SERIF,1,12));
        block3.add(label3);
        JLabel quickTaskLabel = new JLabel("Quick Tasks");
        quickTaskLabel.setForeground(Color.WHITE);
        quickTaskLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        quickTaskLabel.setBounds(30, 130, 200, 20);
        body.add(quickTaskLabel);
        String[] task={"Transfer Money","Pay Bills","Check Offers"};
        int taskX=30;
        int taskY=160;
        int taskWidth=130;
        int taskHeight=40;
        int taskGap=20;
        for(String tn:task){
            JButton taskB=new JButton(tn);
                    taskB.setBounds(taskX,taskY,taskWidth,taskHeight);
            taskB.setBackground(new Color(255,204,102));
            taskB.setForeground(Color.BLACK);
            taskB.setFocusPainted(false);
            taskB.setFont(new Font(Font.SANS_SERIF,1,11));
            taskB.setBorder(BorderFactory.createLineBorder((Color.white) ));
            body.add(taskB);
            taskX+=taskWidth+taskGap;
        }
        JLabel help = new JLabel("Need Help?");
        help.setBounds(360, 380, 100, 30);
        help.setBackground(new Color(200, 255, 255));
        help.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        help.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        help.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(h,"You can reach us at support@finSutra.com");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                help.setForeground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                help.setForeground(new Color(200,255,255));
            }
        });
        body.add(help);
        JLabel recentLabel=new JLabel("Recent Transactions");
        recentLabel.setForeground(Color.white);
        recentLabel.setFont(new Font(Font.SANS_SERIF,1,13));
        recentLabel.setBounds(30,240,200,20);
        body.add(recentLabel);
        String[] transc={"₹1500 UPI to Amrita","₹299 bill paid - Netflix","₹40000 credited Salary"};
        int txY=270;
        for(String t:transc)
        {
            JLabel tx=new JLabel("• "+t);
            tx.setForeground(new Color(200,200,255));
            tx.setFont(new Font(Font.MONOSPACED,0,12));
            tx.setBounds(40,txY,300,20);
            body.add(tx);
            txY+=22;
        }
        JLabel tips = new JLabel("<html><b>Tip:</b> Pay bills on time to boost your credit score!</html>");
        tips.setForeground(new Color(180, 220, 255));
        tips.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 12));
        tips.setBounds(30, txY + 10, 300, 40);
        body.add(tips);

        h.setVisible(true);
    }
    public static void main(String args[]){
        new HomePage();
    }
}
