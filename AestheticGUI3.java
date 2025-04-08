import java.awt.*;
import javax.swing.*;

public class AestheticGUI3 {
    public static void main(String[] args) {
        // Create the frame and set a custom background color
        JFrame frame = new JFrame("Aesthetic GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setBackground(new Color(200, 216, 230));
        frame.setLocationRelativeTo(null); // Center the frame

        // Create a panel with a custom background color
        JPanel panel = new JPanel();
        panel.setBackground(new Color(173, 216, 230)); // Light Blue
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Create a label with custom font and color
        JLabel label = new JLabel("Welcome to Aesthetic GUI");
        label.setForeground(new Color(0, 0, 0)); // Black
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Create text fields with custom font and color
        JTextField textField1 = new JTextField("Student Name",15);
        textField1.setFont(new Font("Arial", Font.PLAIN, 14));
        textField1.setForeground(new Color(0, 0, 0)); // Black
        textField1.setBackground(new Color(107, 112, 92));
        JTextField textField2 = new JTextField("Branch",15);
        textField2.setFont(new Font("Arial", Font.PLAIN, 14));
        textField2.setForeground(new Color(0, 0, 0)); // Black
        textField2.setBackground(new Color(165, 165, 141)); // Navajo White
        JTextField textField3 = new JTextField("Register Number",15);
        textField3.setFont(new Font("Arial", Font.PLAIN, 14));
        textField3.setForeground(new Color(0, 0, 0)); // Black
        textField3.setBackground(new Color(135, 206, 250)); // Light Sky Blue
        JTextField textField4 = new JTextField("Email",15);
        textField4.setFont(new Font("Arial", Font.PLAIN, 14));
        textField4.setForeground(new Color(183, 183 ,164)); // White
        textField4.setBackground(new Color(255, 99, 71)); // Tomato
        JTextField textField5 = new JTextField("Phone Number",15);
        textField5.setFont(new Font("Arial", Font.PLAIN, 14));
        textField5.setForeground(new Color(0, 0, 0)); // Black
        textField5.setBackground(new Color(221 ,190 ,169)); // Khaki
        JTextField textField6 = new JTextField("Address",15);
        textField6.setFont(new Font("Arial", Font.PLAIN, 14));
        textField6.setForeground(new Color(0, 0, 0)); // Black
        textField6.setBackground(new Color(203 ,153 ,126)); // Thistle

        // Create buttons with custom font and color
        JButton button1 = new JButton("Edit");
        button1.setFont(new Font("Arial", Font.PLAIN, 14));
        button1.setForeground(new Color(0, 0, 0)); // Black
        button1.setBackground(new Color(173, 216, 230)); // Light Blue
        JButton button2 = new JButton("Submit");
        button2.setFont(new Font("Arial", Font.PLAIN, 14));
        button2.setForeground(new Color(0, 0, 0)); // Black
        button2.setBackground(new Color(173, 216, 230)); // Light Blue

        // Load and resize the image
        ImageIcon originalImageIcon = new ImageIcon("C:\\Users\\sgkod\\java\\image.png"); // Corrected image path
        Image originalImage = originalImageIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(120, 120, Image.SCALE_SMOOTH); // Resize to 100x100 pixels
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        
        // Add image to a label
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(resizedImageIcon);

        // Add components to the panel with layout constraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(label, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(textField1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textField2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(textField3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(textField4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(textField5, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(textField6, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(button1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(button2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(imageLabel, gbc);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
