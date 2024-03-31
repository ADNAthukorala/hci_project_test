import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Furnitures360View_Page extends JFrame {
    JPanel backgroundPanel;
    BufferedImage sofaItem1Image, sofaChairItem2Image, bedItem3Image, rotatedImage, selectedImage;
    JLabel imageLabel, titleTextLabel;
    JComboBox<String> furnitureList;
    double rotationAngle = 0;

    public Furnitures360View_Page() {
        setTitle("Furnitures 360 View");
        setSize(1360, 730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        backgroundPanel = new JPanel();
        backgroundPanel.setBackground(Color.decode("#E1E3DF"));
        backgroundPanel.setLayout(null);

        // Title text label
        titleTextLabel = new JLabel("Furnitures 360 View");
        titleTextLabel.setForeground(Color.decode("#2B4A47"));
        titleTextLabel.setFont(new Font("Arial", Font.BOLD, 50));
        titleTextLabel.setBounds(450, 0, 500, 70);

        try {
            sofaItem1Image = ImageIO.read(new File("images/sofa-item1.png"));
            sofaChairItem2Image = ImageIO.read(new File("images/sofa-chair-item2.png"));
            bedItem3Image = ImageIO.read(new File("images/bed-item3.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        selectedImage = sofaItem1Image;

        imageLabel = new JLabel(new ImageIcon(selectedImage));
        imageLabel.setBounds(470, 0, 400, 730);

        // Furniture list
        String[] furnitureListString = {"Blue Sofa", "White Sofa Chair", "Brown Bed"};
        furnitureList = new JComboBox<>(furnitureListString);
        furnitureList.setBounds(100,180,200,40);
        furnitureList.setFont(new Font("Arial", Font.BOLD, 20));
        furnitureList.setBackground(Color.decode("#2B4A47"));
        furnitureList.setForeground(Color.decode("#F7AD3A"));
        furnitureList.addActionListener(e -> changeFurniture());

        // Add mouse listener for rotation
        imageLabel.addMouseMotionListener(new MouseAdapter() {
            int prevX, prevY;

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                // Calculate the change in mouse position
                int dx = x - prevX;
                int dy = y - prevY;

                // Calculate rotation angle based on mouse movement
                rotationAngle += Math.toRadians(dx + dy);

                // Rotate the image
                rotatedImage = rotateImage(selectedImage, rotationAngle);
                imageLabel.setIcon(new ImageIcon(rotatedImage));

                prevX = x;
                prevY = y;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                prevX = e.getX();
                prevY = e.getY();
            }
        });

        // Adding components to background panel
        backgroundPanel.add(imageLabel);
        backgroundPanel.add(titleTextLabel);
        backgroundPanel.add(furnitureList);

        // Add the custom backgroundPanel to the JFrame
        add(backgroundPanel);
    }

    private BufferedImage rotateImage(BufferedImage original, double radians) {
        double sin = Math.abs(Math.sin(radians));
        double cos = Math.abs(Math.cos(radians));
        int w = original.getWidth();
        int h = original.getHeight();
        int newWidth = (int) Math.floor(w * cos + h * sin);
        int newHeight = (int) Math.floor(h * cos + w * sin);

        BufferedImage rotated = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = rotated.createGraphics();
        AffineTransform at = new AffineTransform();
        at.translate((double) (newWidth - w) / 2, (double) (newHeight - h) / 2);

        int x = w / 2;
        int y = h / 2;

        at.rotate(radians, x, y);
        g2d.setTransform(at);
        g2d.drawImage(original, 0, 0, null);
        g2d.dispose();
        return rotated;
    }

    private void changeFurniture() {
        String selectedArt = (String) furnitureList.getSelectedItem();
        BufferedImage image = sofaItem1Image;
        if (selectedArt != null) {
            switch (selectedArt) {
                case "Blue Sofa":
                    break;
                case "White Sofa Chair":
                    image = sofaChairItem2Image;
                    break;
                case "Brown Bed":
                    image = bedItem3Image;
                    break;
            }
        }
        selectedImage = image;
        rotatedImage = rotateImage(image, rotationAngle);
        imageLabel.setIcon(new ImageIcon(rotatedImage));
    }

    public static void main(String[] args) {
        Furnitures360View_Page frame = new Furnitures360View_Page();
        frame.setVisible(true);
    }
}
