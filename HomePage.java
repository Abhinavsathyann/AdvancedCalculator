import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame {

    public HomePage() {
        setTitle("Advanced Java Calculator");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        JButton basicBtn = new JButton("Basic Calculator");
        JButton sciBtn = new JButton("Scientific Calculator");
        JButton aboutBtn = new JButton("About");
        JButton exitBtn = new JButton("Exit");

        add(basicBtn);
        add(sciBtn);
        add(aboutBtn);
        add(exitBtn);

        basicBtn.addActionListener(e -> {
            dispose();
            new BasicCalculator();
        });

        sciBtn.addActionListener(e -> {
            dispose();
            new ScientificCalculator();
        });

        aboutBtn.addActionListener(e -> {
            dispose();
            new AboutPage();
        });

        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}
