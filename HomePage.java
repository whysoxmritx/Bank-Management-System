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
        tabPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
        tabPanel.setBounds(0,0,500,30);
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
        }
        h.setVisible(true);
    }
    public static void main(String args[]){
        new HomePage();
    }
}
