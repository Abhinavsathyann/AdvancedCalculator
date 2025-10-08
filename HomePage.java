import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame {

    public HomePage() {
        setTitle("Advanced Java Calculator");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // ----- Header -----
        JLabel title = new JLabel("⚙️ Advanced Java Calculator", JLabel.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        // ----- Center Buttons -----
        JPanel buttonPanel = new JPanel(new GridLayout(5, 2, 15, 15));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JButton basicBtn = new JButton("🧮 Basic Calculator");
        JButton sciBtn = new JButton("📈 Scientific Calculator");
        JButton progBtn = new JButton("💻 Programmer Calculator");
        JButton unitBtn = new JButton("📏 Unit Converter");
        JButton historyBtn = new JButton("📜 History");
        JButton settingsBtn = new JButton("⚙️ Settings");
        JButton helpBtn = new JButton("❓ Help");
        JButton aboutBtn = new JButton("ℹ️ About");
        JButton exitBtn = new JButton("🚪 Exit");

        // Add buttons to panel
        buttonPanel.add(basicBtn);
        buttonPanel.add(sciBtn);
        buttonPanel.add(progBtn);
        buttonPanel.add(unitBtn);
        buttonPanel.add(historyBtn);
        buttonPanel.add(settingsBtn);
        buttonPanel.add(helpBtn);
        buttonPanel.add(aboutBtn);
        buttonPanel.add(exitBtn);

        add(buttonPanel, BorderLayout.CENTER);

        // ----- Footer -----
        JLabel footer = new JLabel("Created by Abhinav K", JLabel.CENTER);
        footer.setFont(new Font("Segoe UI", Font.ITALIC, 12));
        footer.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));
        add(footer, BorderLayout.SOUTH);

        // ----- Button Styles -----
        JButton[] allButtons = {basicBtn, sciBtn, progBtn, unitBtn, historyBtn, settingsBtn, helpBtn, aboutBtn, exitBtn};
        for (JButton btn : allButtons) {
            btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btn.setBackground(new Color(245, 245, 245));
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1, true));
            btn.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(230, 230, 250));
                }
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(245, 245, 245));
                }
            });
        }

        // ----- Button Actions -----
        basicBtn.addActionListener(e -> { dispose(); new BasicCalculator(); });
        sciBtn.addActionListener(e -> { dispose(); new ScientificCalculator(); });
        progBtn.addActionListener(e -> { dispose(); new ProgrammerCalculator(); });
        unitBtn.addActionListener(e -> { dispose(); new UnitConverter(); });
        historyBtn.addActionListener(e -> { dispose(); new HistoryPage(); });
        settingsBtn.addActionListener(e -> { dispose(); new SettingsPage(); });
        helpBtn.addActionListener(e -> { dispose(); new HelpPage(); });
        aboutBtn.addActionListener(e -> { dispose(); new AboutPage(); });

        exitBtn.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", 
                    "Confirm Exit", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // ----- Final Visibility -----
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HomePage::new);
    }
}
