import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class RoundedButton extends JButton {

    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false); // Make sure the button's background is transparent
        setFocusable(false);
        setBorder(null);
        // Add MouseListener to the button
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the background color of the button when mouse enters
                setBackground(Color.decode("#FFFFFF"));
                setForeground(Color.decode("#F7AD3A"));// Change color to whatever you want
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Restore the original background color of the button when mouse exits
                setBackground(Color.decode("#F7AD3A"));
                setForeground(Color.decode("#2B4A47")); // Restore default color
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint the rounded background
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40)); // Adjust the arc width and height for desired roundness

        // Paint the text
        super.paintComponent(g2);

        g2.dispose();
    }
}