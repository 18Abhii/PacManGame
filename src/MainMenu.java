import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainMenu(CardLayout cardLayout, JPanel mainPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        setLayout(new GridBagLayout());

        JLabel title = new JLabel("Pac-Man Game");
        title.setFont(new Font("Arial", Font.BOLD, 36));
        title.setForeground(Color.YELLOW);

        JButton startButton = new JButton("Start Game");
        JButton modeButton = new JButton("Select Mode");
        JButton instructionsButton = new JButton("Instructions");
        JButton exitButton = new JButton("Exit");

        startButton.setPreferredSize(new Dimension(200, 40));
        modeButton.setPreferredSize(new Dimension(200, 40));
        instructionsButton.setPreferredSize(new Dimension(200, 40));
        exitButton.setPreferredSize(new Dimension(200, 40));

        startButton.addActionListener(e -> cardLayout.show(mainPanel, "GAME"));
        modeButton.addActionListener(e -> cardLayout.show(mainPanel, "MODE_SELECT"));
        instructionsButton.addActionListener(e -> cardLayout.show(mainPanel, "INSTRUCTIONS"));
        exitButton.addActionListener(e -> System.exit(0));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 0, 20, 0);
        add(title, gbc);

        gbc.gridy++;
        add(startButton, gbc);
        gbc.gridy++;
        add(modeButton, gbc);
        gbc.gridy++;
        add(instructionsButton, gbc);
        gbc.gridy++;
        add(exitButton, gbc);
    }
}