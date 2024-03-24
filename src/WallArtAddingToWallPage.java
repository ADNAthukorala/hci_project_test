import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;

public class WallArtAddingToWallPage extends JFrame {
    WallArtAddingToWallPage() {
        setTitle("Wall Art Adding to Wall");
        setSize(1360, 730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        // Create custom JPanel with the background image
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

        // Create the title text label
        JLabel titleTextLabel = new JLabel("Wall Art Adding to Wall");
        titleTextLabel.setForeground(Color.decode("#F7AD3A"));
        titleTextLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleTextLabel.setBounds(500, 50, 500, 50);

        // Brown wall image
        ImageIcon brownWallImage = new ImageIcon("images/brown-wall.jpg");

        // Black wall image
        ImageIcon blackWallImage = new ImageIcon("images/black-wall.jpg");

        // White wall image
        ImageIcon whiteWallImage = new ImageIcon("images/white-wall.jpg");

        // Wall art 1 image
        ImageIcon wallArt1Image = new ImageIcon("images/wall-art1.png");

        // Wall art 2 image
        ImageIcon wallArt2Image = new ImageIcon("images/wall-art2.png");

        // Wall art 3 image
        ImageIcon wallArt3Image = new ImageIcon("images/wall-art3.png");

        // Wall label
        JLabel wallLabel = new JLabel();
        wallLabel.setBounds(50,20,300,150);
        wallLabel.setIcon(brownWallImage);

        // Wall color list
        String[] wallColorListString = {"Brown", "White", "Black"};
        JComboBox<String> wallColorList = new JComboBox<>(wallColorListString);
        wallColorList.setBounds(100,180,200,40);
        wallColorList.setFont(new Font("Arial", Font.BOLD, 20));
        wallColorList.setBackground(Color.decode("#2B4A47"));
        wallColorList.setForeground(Color.decode("#F7AD3A"));

        // Wall holder panel
        RoundedPanel wallHolderPanel = new RoundedPanel(30, Color.decode("#FFFFFF"));
        wallHolderPanel.setBounds(100, 190, 400, 230);
        wallHolderPanel.setLayout(null);
        wallHolderPanel.add(wallLabel);
        wallHolderPanel.add(wallColorList);

        // Wall art label
        JLabel wallArtLabel = new JLabel();
        wallArtLabel.setBounds(50,20,300,150);
        wallArtLabel.setIcon(wallArt2Image);

        // Wall art list
        String[] wallArtListString = {"Wall Art 1", "Wall Art 2", "Wall Art 3"};
        JComboBox<String> wallArtList = new JComboBox<>(wallArtListString);
        wallArtList.setBounds(100,180,200,40);
        wallArtList.setFont(new Font("Arial", Font.BOLD, 20));
        wallArtList.setBackground(Color.decode("#2B4A47"));
        wallArtList.setForeground(Color.decode("#F7AD3A"));

        // Wall art holder panel
        RoundedPanel wallArtHolderPanel = new RoundedPanel(30, Color.decode("#FFFFFF"));
        wallArtHolderPanel.setBounds(840, 190, 400, 230);
        wallArtHolderPanel.setLayout(null);
        wallArtHolderPanel.add(wallArtLabel);
        wallArtHolderPanel.add(wallArtList);

        // Wall preview label
        JLabel wallPreviewLabel = new JLabel();
        wallPreviewLabel.setBounds(50,20,300,150);
        wallPreviewLabel.setIcon(brownWallImage);

        // Wall art preview label
        JLabel wallArtPreviewLabel = new JLabel();
        wallArtPreviewLabel.setBounds(50,20,300,150);
        wallArtPreviewLabel.setIcon(wallArt2Image);

        // Preview label
        JLabel previewLabel = new JLabel("Preview");
        previewLabel.setBounds(155,180,200,40);
        previewLabel.setFont(new Font("Arial", Font.BOLD, 20));

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
}

//private void updateWallImage() {
//    String selectedImage = (String) wallColorList.getSelectedItem();
//    ImageIcon image = brownWallImage;
//    switch (selectedImage) {
//        case "Brown":
//            image = brownWallImage;
//            break;
//        case "White":
//            image = whiteWallImage;
//            break;
//        case "Black":
//            image = blackWallImage;
//            break;
//    }
//    wallLabel.setIcon(image);
//}


