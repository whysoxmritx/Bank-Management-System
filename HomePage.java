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
        h.setVisible(true);
    }
    public static void main(String args[]){
        new HomePage();
    }
}
