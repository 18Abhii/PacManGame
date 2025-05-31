import javax.swing.*;
import java.awt.CardLayout;
public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pac Man");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(608, 672); // Match your tile layout

        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Create and add the main menu panel
        MainMenu menu = new MainMenu(cardLayout, mainPanel);
        mainPanel.add(menu, "MainMenu");

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}