import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JLabel labelPrincipal, labelRate, labelTime, labelType, labelResult;
    JTextField textPrincipal, textRate, textTime;
    JButton calcButton, clearButton;
    JComboBox<String> interestTypeBox;

    public Calculator() {
        setTitle("Bank Interest Calculator");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Labels
        labelPrincipal = new JLabel("Principal (₹):");
        labelRate = new JLabel("Rate (% per annum):");
        labelTime = new JLabel("Time (years):");
        labelType = new JLabel("Interest Type:");
        labelResult = new JLabel("Interest = ₹0.00");
        textPrincipal = new JTextField();
        textRate = new JTextField();
        textTime = new JTextField();

        // ComboBox
        String[] types = {"Simple Interest", "Compound Interest"};
        interestTypeBox = new JComboBox<>(types);

        // Buttons
        calcButton = new JButton("Calculate");
        clearButton = new JButton("Clear");

        calcButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Adding components
        add(labelPrincipal);
        add(textPrincipal);
        add(labelRate);
        add(textRate);
        add(labelTime);
        add(textTime);
        add(labelType);
        add(interestTypeBox);
        add(calcButton);
        add(clearButton);
        add(new JLabel()); // empty cell
        add(labelResult);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcButton) {
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
                JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == clearButton) {
            textPrincipal.setText("");
            textRate.setText("");
            textTime.setText("");
            labelResult.setText("Interest = ₹0.00");
            interestTypeBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new Calculator();
}
}
