import javax.swing.*;
import java.awt.*;

public class Lesson51 {
    JFrame window;
    private void createFrame()
    {
        window = new JFrame("Lesson51");
        window.setBounds(100, 100, 500, 500);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void run()
    {
        createFrame();
        JPanel panel = new JPanel();
        window.add(panel);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        panel.setLayout(gbl);

        JLabel name = new JLabel("First Name");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(name,gbc);
        JFormattedTextField firstName = new JFormattedTextField(new String("Christian"));
        firstName.setColumns(20);
        gbc.gridy = 1;
        panel.add(firstName,gbc);

        JLabel surname = new JLabel("Last Name");
        gbc.gridy = 2;
        panel.add(surname,gbc);
        JTextField lastName = new JTextField("Watson", 20);
        gbc.gridy = 3;
        panel.add(lastName,gbc);

        JLabel email = new JLabel("Email");
        gbc.gridy = 4;
        panel.add(email,gbc);
        JTextField eMail = new JTextField(20);
        gbc.gridy = 5;
        panel.add(eMail,gbc);

        JLabel password = new JLabel("Password");
        gbc.gridy = 6;
        panel.add(password,gbc);
        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridy = 7;
        panel.add(passwordField,gbc);

        JLabel confpassword = new JLabel("Confirm Password");
        gbc.gridy = 8;
        panel.add(confpassword,gbc);
        JPasswordField conpass = new JPasswordField(20);
        gbc.gridy = 9;
        panel.add(conpass,gbc);

        JLabel zip = new JLabel("Zip code");
        gbc.gridy = 10;
        panel.add(zip,gbc);
        JTextField zipCode = new JTextField(20);
        gbc.gridy = 11;
        panel.add(zipCode,gbc);

        window.setVisible(true);
    }
}
