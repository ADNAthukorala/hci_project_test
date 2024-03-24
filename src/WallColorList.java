import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WallColorList extends JFrame implements ActionListener {
    JComboBox<String> wallColorList;

    WallColorList() {
        String[] wallColorList = {"White", "Orange", "Black", "Navy-Blue"};

        // Created a combo box
        this.wallColorList = new JComboBox<>(wallColorList);
        this.wallColorList.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(this.wallColorList);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == wallColorList) {
            System.out.println(wallColorList.getSelectedItem());
        }
    }
}
