import java.awt.*;
import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphic User Interface Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField textField = new JTextField(15);
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        JButton button = new JButton("Click Me");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        ImageIcon icon = new ImageIcon("image.png");
        JLabel imageLabel = new JLabel(icon);
        gbc.gridx = 0; gbc.gridy = 0;
        frame.add(new JLabel("Enter Text:"), gbc);
        gbc.gridx = 1;
        frame.add(textField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        frame.add(button, gbc);
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        frame.add(imageLabel, gbc);
        frame.setVisible(true);
    }
}
