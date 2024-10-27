import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("JPanel Demo");
        window.setBounds(500, 150, 500, 500);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.WEST;
        window.add(panel);
        JLabel enterName = new JLabel("Enter Name:   ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(enterName, constraints);
        JTextField text = new JTextField(15);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(text, constraints);
        JLabel enterPassword = new JLabel("Enter password:   ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(enterPassword, constraints);
        JPasswordField password = new JPasswordField(15);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(password, constraints);
        JButton button = new JButton("Login");
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(button, constraints);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}