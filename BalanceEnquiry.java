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
        JLabel ac=new JLabel("A/C no.:");
        h.add(ac);
        ac.setForeground(Color.lightGray);
        ac.setFont(new Font(Font.MONOSPACED,1,20));
        ac.setBounds(80,130,100,40);
        JTextField bal=new JTextField();
        h.add(bal);
        bal.setBounds(220,130,130,30);
        JLabel phn=new JLabel("Phone No.:");
        h.add(phn);
        phn.setForeground(Color.lightGray);
        phn.setFont(new Font(Font.MONOSPACED,1,20));
        phn.setBounds(80,180,130,40);
        JTextField ph=new JTextField();
        h.add(ph);
        ph.setBounds(220,180,130,30);
        JLabel branch=new JLabel("Branch:");
        h.add(branch);
        branch.setForeground(Color.lightGray);
        branch.setFont(new Font(Font.MONOSPACED,1,20));
        branch.setBounds(80,230,100,40);
        JTextField brn=new JTextField();
        h.add(brn);
        brn.setBounds(220,230,130,30);
        h.setVisible(true);
    }
    public static void main(String[] args){
        new BalanceEnquiry();
    }
}
