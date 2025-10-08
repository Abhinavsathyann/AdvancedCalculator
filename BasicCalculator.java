import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicCalculator extends JFrame implements ActionListener {
    private JTextField field1, field2, resultField;
    private JComboBox<String> operationBox;

    public BasicCalculator() {
        setTitle("Basic Calculator");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(6, 2, 5, 5));

        add(new JLabel("First Number:"));
        field1 = new JTextField();
        add(field1);

        add(new JLabel("Operation:"));
        String[] ops = {"+", "-", "*", "/"};
        operationBox = new JComboBox<>(ops);
        add(operationBox);

        add(new JLabel("Second Number:"));
        field2 = new JTextField();
        add(field2);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        JButton calcBtn = new JButton("Calculate");
        JButton backBtn = new JButton("Back");
        add(calcBtn);
        add(backBtn);

        calcBtn.addActionListener(this);
        backBtn.addActionListener(e -> {
            dispose();
            new HomePage();
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(field1.getText());
            double b = Double.parseDouble(field2.getText());
            String op = (String) operationBox.getSelectedItem();

            double result = switch (op) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> (b != 0) ? a / b : Double.NaN;
                default -> 0;
            };

            resultField.setText(String.valueOf(result));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
    }
}
