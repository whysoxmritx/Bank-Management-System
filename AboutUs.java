import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AboutUs {
    public AboutUs() {
        JFrame au = new JFrame("About us");
        au.setSize(500, 600);
        au.setDefaultCloseOperation(au.EXIT_ON_CLOSE);
        au.setLayout(null);
        au.setLocationRelativeTo(null);
        au.setResizable(false);
        au.getContentPane().setBackground(new Color(30, 30, 60));
        ImageIcon ig = new ImageIcon("logo.jpg");
        au.setIconImage(ig.getImage());
        JPanel tabPanel = new JPanel();
        au.add(tabPanel);
        tabPanel.setBackground(new Color(75, 110, 130));
        tabPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 8, 5));
        tabPanel.setBounds(0, 0, 500, 38);
        String[] tabs = {"Home", "Transactions", "Calculator", "Logout", "About us"};
        for (String t : tabs) {
            JButton button = new JButton(t);
            button.setFocusPainted(false);
            button.setForeground(Color.white);
            button.setBackground(new Color(75, 110, 130));
            button.setBorderPainted(false);
            button.setFont(new Font(Font.SANS_SERIF, 1, 13));
            tabPanel.add(button);
            if (t.equals("About us")) {
                button.setBackground(new Color(255, 153, 0));
                button.setForeground(Color.black);
            }
            button.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    button.setBackground(new Color(255, 200, 100));
                }

                public void mouseExited(MouseEvent e) {
                    if (!t.equals("About us"))
                        button.setBackground(new Color(75, 110, 130));
                }
            });
            if (t.equals("Home")) {
                button.addActionListener(e -> {
                    au.dispose();
                    new HomePage();
                });
            }
            if (t.equals("Logout")) {
                button.addActionListener(e -> {
                    int confirm = JOptionPane.showConfirmDialog(au, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        au.dispose();
                        new Login(); // Your login class
                    }
                });
            }
            JLabel title = new JLabel("About FinSutra");
            au.add(title);
            title.setForeground(new Color(180, 150, 225));
            title.setFont(new Font(Font.MONOSPACED, 1, 20));
            title.setBounds(170, 60, 300, 30);
            JTextArea about=new JTextArea("FinSutra is a modern digital banking solution that offers an easy and secure way to manage their finances.\n\n"+"Our mission is to empower customer with technology driven tools to track savings.Manage fixed deposits, and plan for a better Financial future.\n\n"
                    +"We are commited to providing a smooth, responsive, and feature enriched banking experience for everyone.");
            au.add(about);
            about.setWrapStyleWord(true);
            about.setEditable(false);
            about.setLineWrap(true);
            about.setFont(new Font(Font.SANS_SERIF,0,13));
            about.setForeground(Color.white);
            about.setBackground(new Color(30,30,60));
            about.setOpaque(true);
            about.setBounds(50,110,400,250);
            JLabel team=new JLabel("Our Team");
            au.add(team);
            team.setBounds(50,350,100,30);
            team.setForeground(new Color(180,150,225));
            team.setFont(new Font(Font.SANS_SERIF,1,17));
            JLabel ak=new JLabel("Akshat Srivastava : akshatSri@finSutra.com");
            JLabel am=new JLabel("Amrita Pandey : amritaPan@finSutra.com");
            au.add(ak);
            au.add(am);
            ak.setFont(new Font(Font.SERIF,0,15));
            am.setFont(new Font(Font.SERIF,0,15));
            ak.setForeground(Color.white);
            am.setForeground(Color.white);
            ak.setBounds(50,380,300,30);
            am.setBounds(50,410,300,30);
            am.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            ak.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            au.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        new AboutUs();
    }
}
