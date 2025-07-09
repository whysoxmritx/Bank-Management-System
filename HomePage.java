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
        
        h.setVisible(true);
    }
    public static void main(String args[]){
        new HomePage();
    }
}
