import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BalanceEnquiry {
    public BalanceEnquiry(){
        JFrame h=new JFrame("Balance Enquiry");
        h.setSize(500,600);
        h.setDefaultCloseOperation(h.EXIT_ON_CLOSE);
        h.setLayout(null);
        h.setLocationRelativeTo(null);
        h.getContentPane().setBackground(new Color(30,30,60));
        ImageIcon ig=new ImageIcon("logo.jpg");
        h.setIconImage(ig.getImage());
        JLabel ac=new JLabel("A/C no.");
        h.add(ac);
        ac.setForeground(Color.lightGray);
        ac.setFont(new Font(Font.MONOSPACED,2,17));
        ac.setBounds(60,60,100,40);
        h.setVisible(true);
    }
    public static void main(String[] args){
        new BalanceEnquiry();
    }
}
