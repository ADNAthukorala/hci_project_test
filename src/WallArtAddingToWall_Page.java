import javax.swing.*;
import java.awt.*;

public class WallArtAddingToWall_Page extends JFrame {
    private final ImageIcon brownWallImage;
    private final ImageIcon blackWallImage;
    private final ImageIcon whiteWallImage;
    private final ImageIcon wallArt1Image;
    private final ImageIcon wallArt2Image;
    private final ImageIcon wallArt3Image;
    JLabel wallLabel;
    JLabel wallPreviewLabel;
    JLabel wallArtLabel;
    JLabel wallArtPreviewLabel;
    JComboBox<String> wallColorList;
    JComboBox<String> wallArtList;

    WallArtAddingToWall_Page() {
        setTitle("Wall Art Adding to Wall");
        setSize(1360, 730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        // Create custom JPanel with the background image
        JPanel backgroundPanel = backgroundPanel();

        // Create the title text label
        JLabel titleTextLabel = new JLabel("Wall Art Adding to Wall");
        titleTextLabel.setForeground(Color.decode("#F7AD3A"));
        titleTextLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleTextLabel.setBounds(500, 50, 500, 50);

        // Brown wall image
        brownWallImage = new ImageIcon("images/brown-wall.jpg");

        // Black wall image
        blackWallImage = new ImageIcon("images/black-wall.jpg");

        // White wall image
        whiteWallImage = new ImageIcon("images/white-wall.jpg");

        // Wall art 1 image
        wallArt1Image = new ImageIcon("images/wall-art1.png");

        // Wall art 2 image
        wallArt2Image = new ImageIcon("images/wall-art2.png");

        // Wall art 3 image
        wallArt3Image = new ImageIcon("images/wall-art3.png");

        // Wall label
        wallLabel = new JLabel();
        wallLabel.setBounds(50,20,300,150);
        wallLabel.setIcon(brownWallImage);

        // Wall color list
        String[] wallColorListString = {"Brown", "White", "Black"};
        wallColorList = new JComboBox<>(wallColorListString);
        wallColorList.setBounds(100,180,200,40);
        wallColorList.setFont(new Font("Arial", Font.BOLD, 20));
        wallColorList.setBackground(Color.decode("#2B4A47"));
        wallColorList.setForeground(Color.decode("#F7AD3A"));
        wallColorList.addActionListener(e -> changeWallColor());

        // Wall holder panel
        RoundedPanel wallHolderPanel = new RoundedPanel(30, Color.decode("#FFFFFF"));
        wallHolderPanel.setBounds(100, 190, 400, 230);
        wallHolderPanel.setLayout(null);
        wallHolderPanel.add(wallLabel);
        wallHolderPanel.add(wallColorList);

        // Wall art label
        wallArtLabel = new JLabel();
        wallArtLabel.setBounds(50,20,300,150);
        wallArtLabel.setIcon(wallArt1Image);

        // Wall art list
        String[] wallArtListString = {"Wall Art 1", "Wall Art 2", "Wall Art 3"};
        wallArtList = new JComboBox<>(wallArtListString);
        wallArtList.setBounds(100,180,200,40);
        wallArtList.setFont(new Font("Arial", Font.BOLD, 20));
        wallArtList.setBackground(Color.decode("#2B4A47"));
        wallArtList.setForeground(Color.decode("#F7AD3A"));
        wallArtList.addActionListener(e -> changeWallArt());

        // Wall art holder panel
        RoundedPanel wallArtHolderPanel = new RoundedPanel(30, Color.decode("#FFFFFF"));
        wallArtHolderPanel.setBounds(840, 190, 400, 230);
        wallArtHolderPanel.setLayout(null);
        wallArtHolderPanel.add(wallArtLabel);
        wallArtHolderPanel.add(wallArtList);

        // Wall preview label
        wallPreviewLabel = new JLabel();
        wallPreviewLabel.setBounds(50,20,300,150);
        wallPreviewLabel.setIcon(brownWallImage);

        // Wall art preview label
        wallArtPreviewLabel = new JLabel();
        wallArtPreviewLabel.setBounds(50,20,300,150);
        wallArtPreviewLabel.setIcon(wallArt1Image);

        // Preview label
        JLabel previewLabel = new JLabel("Preview");
        previewLabel.setBounds(155,180,200,40);
        previewLabel.setFont(new Font("Arial", Font.BOLD, 22));
        previewLabel.setForeground(Color.decode("#2B4A47"));

        // Preview panel
        RoundedPanel previewPanel = new RoundedPanel(30, Color.decode("#FFFFFF"));
        previewPanel.setBounds(470, 430, 400, 230);
        previewPanel.setLayout(null);
        previewPanel.add(wallArtPreviewLabel);
        previewPanel.add(wallPreviewLabel);
        previewPanel.add(previewLabel);

        // Adding components to background panel
        backgroundPanel.add(titleTextLabel);
        backgroundPanel.add(wallHolderPanel);
        backgroundPanel.add(wallArtHolderPanel);
        backgroundPanel.add(previewPanel);

        // Add the custom backgroundPanel to the JFrame
        add(backgroundPanel);
    }

    private JPanel backgroundPanel() {
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon("images/wallColorAccordingFurnituresBack.png");
                // Draw the image at the backgroundPanel's upper left corner
                g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Set layout to null to allow positioning components freely
        backgroundPanel.setLayout(null);
        return backgroundPanel;
    }

    private void changeWallColor() {
        String selectedColor = (String) wallColorList.getSelectedItem();
        ImageIcon image = brownWallImage;
        if (selectedColor != null) {
            switch (selectedColor) {
                case "Brown":
                    break;
                case "White":
                    image = whiteWallImage;
                    break;
                case "Black":
                    image = blackWallImage;
                    break;
            }
        }
        wallLabel.setIcon(image);
        wallPreviewLabel.setIcon(image);
    }

    private void changeWallArt() {
        String selectedArt = (String) wallArtList.getSelectedItem();
        ImageIcon image = wallArt1Image;
        if (selectedArt != null) {
            switch (selectedArt) {
                case "Wall Art 1":
                    break;
                case "Wall Art 2":
                    image = wallArt2Image;
                    break;
                case "Wall Art 3":
                    image = wallArt3Image;
                    break;
            }
        }
        wallArtLabel.setIcon(image);
        wallArtPreviewLabel.setIcon(image);
    }

    public static void main(String[] args) {
        WallArtAddingToWall_Page frame = new WallArtAddingToWall_Page();
        frame.setVisible(true);
    }
}