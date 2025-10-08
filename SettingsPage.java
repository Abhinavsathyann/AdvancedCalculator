import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SettingsPage extends JFrame {
    private boolean darkMode = false;

    public SettingsPage() {
        setTitle("Settings");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton themeBtn = new JButton("Toggle Dark/Light Mode");
        JButton fontBtn = new JButton("Increase Font Size");
        JButton backBtn = new JButton("Back");

        add(themeBtn);
        add(fontBtn);
        add(backBtn);

        themeBtn.addActionListener(e -> toggleTheme());
        fontBtn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Feature coming soon!"));
        backBtn.addActionListener(e -> { dispose(); new HomePage(); });

        setVisible(true);
    }

    private void toggleTheme() {
        darkMode = !darkMode;
        getContentPane().setBackground(darkMode ? Color.DARK_GRAY : Color.WHITE);
        JOptionPane.showMessageDialog(this, darkMode ? "Dark Mode Enabled" : "Light Mode Enabled");
    }
}
