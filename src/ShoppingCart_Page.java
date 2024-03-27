import javax.swing.*;
import java.awt.*;

public class ShoppingCart_Page extends JFrame {
    JPanel backgroundPanel;
    ImageIcon sofaItem1Image, sofaChairItem2Image, bedItem3Image, shoppingCartImage;
    JLabel shoppingCartImageLabel, titleTextLabel;
    int itemsCount, totalPrice = 0, sofasCount = 0, sofaChairsCount = 0, bedsCount = 0;
    JLabel itemsTopicLabel, totalTopicLabel, itemsCountLabel, totalPriceLabel, sofasTopicLabel, sofaChairsTopicLabel, bedsTopicLabel, sofasCountLabel, sofaChairsCountLabel, bedsCountLabel;
    RoundedPanel item1Panel, item2Panel, item3Panel;
    JLabel item1ImageLabel, item1CodeTopicLabel, item1NameTopicLabel, item1PriceTopicLabel, item1CodeLabel, item1NameLabel, item1PriceLabel;
    RoundedButton item1RemoveCartButton, item1AddCartButton;
    JLabel item2ImageLabel, item2CodeTopicLabel, item2NameTopicLabel,  item2PriceTopicLabel, item2CodeLabel, item2NameLabel, item2PriceLabel;
    RoundedButton item2RemoveCartButton, item2AddCartButton;
    JLabel item3ImageLabel, item3CodeTopicLabel, item3NameTopicLabel,  item3PriceTopicLabel, item3CodeLabel, item3NameLabel, item3PriceLabel;
    RoundedButton item3RemoveCartButton, item3AddCartButton;

    ShoppingCart_Page() {
        setTitle("Shopping Cart");
        setSize(1360, 730);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        backgroundPanel = new JPanel();
        backgroundPanel.setBackground(Color.decode("#E1E3DF"));
        backgroundPanel.setLayout(null);

        // Sofa image
        sofaItem1Image = new ImageIcon("images/sofa-item1.png");

        // Sofa chair image
        sofaChairItem2Image = new ImageIcon("images/sofa-chair-item2.png");

        // Bed image
        bedItem3Image = new ImageIcon("images/bed-item3.png");

        // Shopping cart image
        shoppingCartImage = new ImageIcon("images/shopping-cart.png");

        // Title text label
        titleTextLabel = new JLabel("Shopping Cart");
        titleTextLabel.setForeground(Color.decode("#2B4A47"));
        titleTextLabel.setFont(new Font("Arial", Font.BOLD, 50));
        titleTextLabel.setBounds(910, 100, 500, 70);

        // Shopping cart image label
        shoppingCartImageLabel = new JLabel();
        shoppingCartImageLabel.setBounds(840,200,500,500);
        shoppingCartImageLabel.setIcon(shoppingCartImage);

        // Items topic label
        itemsTopicLabel = new JLabel("Items:");
        itemsTopicLabel.setForeground(Color.decode("#2B4A47"));
        itemsTopicLabel.setFont(new Font("Arial", Font.BOLD, 30));
        itemsTopicLabel.setBounds(40, 25, 100, 50);

        // Items count label
        itemsCountLabel = new JLabel(Integer.toString(itemsCount));
        itemsCountLabel.setForeground(Color.decode("#2B4A47"));
        itemsCountLabel.setFont(new Font("Arial", Font.BOLD, 30));
        itemsCountLabel.setBounds(140, 25, 70, 50);

        // Total price topic label
        totalTopicLabel = new JLabel("Total Price:");
        totalTopicLabel.setForeground(Color.decode("#2B4A47"));
        totalTopicLabel.setFont(new Font("Arial", Font.BOLD, 30));
        totalTopicLabel.setBounds(200, 25, 166, 50);

        // Total price label
        totalPriceLabel = new JLabel("Rs " + totalPrice + ".00");
        totalPriceLabel.setForeground(Color.decode("#2B4A47"));
        totalPriceLabel.setFont(new Font("Arial", Font.BOLD, 30));
        totalPriceLabel.setBounds(376, 25, 400, 50);

        // Sofas topic label
        sofasTopicLabel = new JLabel("Blue Sofas:");
        sofasTopicLabel.setForeground(Color.decode("#2B4A47"));
        sofasTopicLabel.setFont(new Font("Arial", Font.BOLD, 16));
        sofasTopicLabel.setBounds(675, 10, 120, 30);

        // Sofas count label
        sofasCountLabel = new JLabel(Integer.toString(sofasCount));
        sofasCountLabel.setForeground(Color.decode("#2B4A47"));
        sofasCountLabel.setFont(new Font("Arial", Font.BOLD, 16));
        sofasCountLabel.setBounds(770, 10, 50, 30);

        // Sofa chairs topic label
        sofaChairsTopicLabel = new JLabel("White Sofa Chairs:");
        sofaChairsTopicLabel.setForeground(Color.decode("#2B4A47"));
        sofaChairsTopicLabel.setFont(new Font("Arial", Font.BOLD, 16));
        sofaChairsTopicLabel.setBounds(620, 40, 145, 30);

        // Sofa chairs count label
        sofaChairsCountLabel = new JLabel(Integer.toString(sofaChairsCount));
        sofaChairsCountLabel.setForeground(Color.decode("#2B4A47"));
        sofaChairsCountLabel.setFont(new Font("Arial", Font.BOLD, 16));
        sofaChairsCountLabel.setBounds(770, 40, 50, 30);

        // Beds topic label
        bedsTopicLabel = new JLabel("Brown Beds:");
        bedsTopicLabel.setForeground(Color.decode("#2B4A47"));
        bedsTopicLabel.setFont(new Font("Arial", Font.BOLD, 16));
        bedsTopicLabel.setBounds(664, 70, 120, 30);

        // Beds count label
        bedsCountLabel = new JLabel(Integer.toString(bedsCount));
        bedsCountLabel.setForeground(Color.decode("#2B4A47"));
        bedsCountLabel.setFont(new Font("Arial", Font.BOLD, 16));
        bedsCountLabel.setBounds(770, 70, 50, 30);

        // Item 1 image label (Sofa)
        item1ImageLabel = new JLabel();
        item1ImageLabel.setBounds(20,10,287,170);
        item1ImageLabel.setIcon(sofaItem1Image);

        // Item 1 code topic label (Sofa)
        item1CodeTopicLabel = new JLabel("Item Code:");
        item1CodeTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item1CodeTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item1CodeTopicLabel.setBounds(450, 10, 110, 50);

        // Item 1 code label (Sofa)
        item1CodeLabel = new JLabel("BSO - 001");
        item1CodeLabel.setForeground(Color.decode("#FFFFFF"));
        item1CodeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item1CodeLabel.setBounds(580, 10, 110, 50);

        // Item 1 name topic label (Sofa)
        item1NameTopicLabel = new JLabel("Item Name:");
        item1NameTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item1NameTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item1NameTopicLabel.setBounds(450, 45, 110, 50);

        // Item 1 name label (Sofa)
        item1NameLabel = new JLabel("Blue Sofa");
        item1NameLabel.setForeground(Color.decode("#FFFFFF"));
        item1NameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item1NameLabel.setBounds(580, 45, 110, 50);

        // Item 1 price topic label (Sofa)
        item1PriceTopicLabel = new JLabel("Price:");
        item1PriceTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item1PriceTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item1PriceTopicLabel.setBounds(450, 80, 110, 50);

        // Item 1 price label (Sofa)
        item1PriceLabel = new JLabel("RS 100,000.00");
        item1PriceLabel.setForeground(Color.decode("#FFFFFF"));
        item1PriceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item1PriceLabel.setBounds(580, 80, 160, 50);

        // Item 1 remove cart button (Sofa)
        item1RemoveCartButton = new RoundedButton("Remove Cart");
        item1RemoveCartButton.setFont(new Font("Arial", Font.BOLD, 15));
        item1RemoveCartButton.setBackground(Color.decode("#F7AD3A"));
        item1RemoveCartButton.setForeground(Color.decode("#2B4A47"));
        item1RemoveCartButton.addActionListener(e -> item1RemoveCartButton(sofasCount, totalPrice));
        item1RemoveCartButton.setBounds(450, 130, 130, 40);

        // Item 1 add cart button (Sofa)
        item1AddCartButton = new RoundedButton("Add Cart");
        item1AddCartButton.setFont(new Font("Arial", Font.BOLD, 15));
        item1AddCartButton.setBackground(Color.decode("#F7AD3A"));
        item1AddCartButton.setForeground(Color.decode("#2B4A47"));
        item1AddCartButton.addActionListener(e -> item1AddCartButton(sofasCount, totalPrice));
        item1AddCartButton.setBounds(600, 130, 130, 40);

        // Item 2 image label (Sofa Chair)
        item2ImageLabel = new JLabel();
        item2ImageLabel.setBounds(20,10,287,170);
        item2ImageLabel.setIcon(sofaChairItem2Image);

        // Item 2 code topic label (Sofa Chair)
        item2CodeTopicLabel = new JLabel("Item Code:");
        item2CodeTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item2CodeTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item2CodeTopicLabel.setBounds(450, 10, 110, 50);

        // Item 2 code label (Sofa Chair)
        item2CodeLabel = new JLabel("WSOC - 008");
        item2CodeLabel.setForeground(Color.decode("#FFFFFF"));
        item2CodeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item2CodeLabel.setBounds(580, 10, 115, 50);

        // Item 2 name topic label (Sofa Chair)
        item2NameTopicLabel = new JLabel("Item Name:");
        item2NameTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item2NameTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item2NameTopicLabel.setBounds(450, 45, 110, 50);

        // Item 2 name label (Sofa Chair)
        item2NameLabel = new JLabel("White Sofa Chair");
        item2NameLabel.setForeground(Color.decode("#FFFFFF"));
        item2NameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item2NameLabel.setBounds(580, 45, 160, 50);

        // Item 2 price topic label (Sofa Chair)
        item2PriceTopicLabel = new JLabel("Price:");
        item2PriceTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item2PriceTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item2PriceTopicLabel.setBounds(450, 80, 110, 50);

        // Item 2 price label (Sofa Chair)
        item2PriceLabel = new JLabel("RS 50,000.00");
        item2PriceLabel.setForeground(Color.decode("#FFFFFF"));
        item2PriceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item2PriceLabel.setBounds(580, 80, 160, 50);

        // Item 2 remove cart button (Sofa Chair)
        item2RemoveCartButton = new RoundedButton("Remove Cart");
        item2RemoveCartButton.setFont(new Font("Arial", Font.BOLD, 15));
        item2RemoveCartButton.setBackground(Color.decode("#F7AD3A"));
        item2RemoveCartButton.setForeground(Color.decode("#2B4A47"));
        item2RemoveCartButton.addActionListener(e -> item2RemoveCartButton(sofaChairsCount, totalPrice));
        item2RemoveCartButton.setBounds(450, 130, 130, 40);

        // Item 2 add cart button (Sofa Chair)
        item2AddCartButton = new RoundedButton("Add Cart");
        item2AddCartButton.setFont(new Font("Arial", Font.BOLD, 15));
        item2AddCartButton.setBackground(Color.decode("#F7AD3A"));
        item2AddCartButton.setForeground(Color.decode("#2B4A47"));
        item2AddCartButton.addActionListener(e -> item2AddCartButton(sofaChairsCount, totalPrice));
        item2AddCartButton.setBounds(600, 130, 130, 40);

        // Item 3 image label (Bed)
        item3ImageLabel = new JLabel();
        item3ImageLabel.setBounds(20,10,287,170);
        item3ImageLabel.setIcon(bedItem3Image);

        // Item 3 code topic label (Bed)
        item3CodeTopicLabel = new JLabel("Item Code:");
        item3CodeTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item3CodeTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item3CodeTopicLabel.setBounds(450, 10, 110, 50);

        // Item 3 code label (Bed)
        item3CodeLabel = new JLabel("BBD - 006");
        item3CodeLabel.setForeground(Color.decode("#FFFFFF"));
        item3CodeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item3CodeLabel.setBounds(580, 10, 110, 50);

        // Item 3 name topic label (Bed)
        item3NameTopicLabel = new JLabel("Item Name:");
        item3NameTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item3NameTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item3NameTopicLabel.setBounds(450, 45, 110, 50);

        // Item 3 name label (Bed)
        item3NameLabel = new JLabel("Brown Bed");
        item3NameLabel.setForeground(Color.decode("#FFFFFF"));
        item3NameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item3NameLabel.setBounds(580, 45, 110, 50);

        // Item 3 price topic label (Bed)
        item3PriceTopicLabel = new JLabel("Price:");
        item3PriceTopicLabel.setForeground(Color.decode("#F7AD3A"));
        item3PriceTopicLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item3PriceTopicLabel.setBounds(450, 80, 110, 50);

        // Item 3 price label (Bed)
        item3PriceLabel = new JLabel("RS 250,000.00");
        item3PriceLabel.setForeground(Color.decode("#FFFFFF"));
        item3PriceLabel.setFont(new Font("Arial", Font.BOLD, 20));
        item3PriceLabel.setBounds(580, 80, 160, 50);

        // Item 3 remove cart button (Bed)
        item3RemoveCartButton = new RoundedButton("Remove Cart");
        item3RemoveCartButton.setFont(new Font("Arial", Font.BOLD, 15));
        item3RemoveCartButton.setBackground(Color.decode("#F7AD3A"));
        item3RemoveCartButton.setForeground(Color.decode("#2B4A47"));
        item3RemoveCartButton.addActionListener(e -> item3RemoveCartButton(bedsCount, totalPrice));
        item3RemoveCartButton.setBounds(450, 130, 130, 40);

        // Item 3 add cart button (Bed)
        item3AddCartButton = new RoundedButton("Add Cart");
        item3AddCartButton.setFont(new Font("Arial", Font.BOLD, 15));
        item3AddCartButton.setBackground(Color.decode("#F7AD3A"));
        item3AddCartButton.setForeground(Color.decode("#2B4A47"));
        item3AddCartButton.addActionListener(e -> item3AddCartButton(bedsCount, totalPrice));
        item3AddCartButton.setBounds(600, 130, 130, 40);

        // Item 1 panel (Sofa)
        item1Panel = new RoundedPanel(30, Color.decode("#2B4A47"));
        item1Panel.setBounds(10, 100, 800, 190);
        item1Panel.setLayout(null);
        item1Panel.add(item1ImageLabel);
        item1Panel.add(item1CodeTopicLabel);
        item1Panel.add(item1CodeLabel);
        item1Panel.add(item1NameTopicLabel);
        item1Panel.add(item1NameLabel);
        item1Panel.add(item1PriceTopicLabel);
        item1Panel.add(item1PriceLabel);
        item1Panel.add(item1RemoveCartButton);
        item1Panel.add(item1AddCartButton);

        // Item 2 panel (Sofa Chair)
        item2Panel = new RoundedPanel(30, Color.decode("#2B4A47"));
        item2Panel.setBounds(10, 300, 800, 190);
        item2Panel.setLayout(null);
        item2Panel.add(item2ImageLabel);
        item2Panel.add(item2CodeTopicLabel);
        item2Panel.add(item2CodeLabel);
        item2Panel.add(item2NameTopicLabel);
        item2Panel.add(item2NameLabel);
        item2Panel.add(item2PriceTopicLabel);
        item2Panel.add(item2PriceLabel);
        item2Panel.add(item2RemoveCartButton);
        item2Panel.add(item2AddCartButton);

        // Item 3 panel (Bed)
        item3Panel = new RoundedPanel(30, Color.decode("#2B4A47"));
        item3Panel.setBounds(10, 500, 800, 190);
        item3Panel.setLayout(null);
        item3Panel.add(item3ImageLabel);
        item3Panel.add(item3CodeTopicLabel);
        item3Panel.add(item3CodeLabel);
        item3Panel.add(item3NameTopicLabel);
        item3Panel.add(item3NameLabel);
        item3Panel.add(item3PriceTopicLabel);
        item3Panel.add(item3PriceLabel);
        item3Panel.add(item3RemoveCartButton);
        item3Panel.add(item3AddCartButton);

        // Adding components to background panel
        backgroundPanel.add(titleTextLabel);
        backgroundPanel.add(shoppingCartImageLabel);
        backgroundPanel.add(itemsTopicLabel);
        backgroundPanel.add(itemsCountLabel);
        backgroundPanel.add(totalTopicLabel);
        backgroundPanel.add(totalPriceLabel);
        backgroundPanel.add(sofasTopicLabel);
        backgroundPanel.add(sofasCountLabel);
        backgroundPanel.add(sofaChairsTopicLabel);
        backgroundPanel.add(sofaChairsCountLabel);
        backgroundPanel.add(bedsTopicLabel);
        backgroundPanel.add(bedsCountLabel);
        backgroundPanel.add(item1Panel);
        backgroundPanel.add(item2Panel);
        backgroundPanel.add(item3Panel);

        // Add the custom backgroundPanel to the JFrame
        add(backgroundPanel);
    }

    void item1RemoveCartButton(int sofasCount, int totalPrice) {
        if (sofasCount > 0) {
            this.sofasCount = sofasCount - 1;
            this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
            this.totalPrice = totalPrice - 100000;
        } else {
            this.sofasCount = sofasCount;
            this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
            this.totalPrice = totalPrice;
        }
        itemsCountLabel.setText(String.valueOf(this.itemsCount));
        sofasCountLabel.setText(String.valueOf(this.sofasCount));
        totalPriceLabel.setText("Rs " + this.totalPrice + ".00");
    }

    void item1AddCartButton(int sofasCount, int totalPrice) {
        this.sofasCount = sofasCount + 1;
        this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
        this.totalPrice = totalPrice + 100000;
        itemsCountLabel.setText(String.valueOf(this.itemsCount));
        sofasCountLabel.setText(String.valueOf(this.sofasCount));
        totalPriceLabel.setText("Rs " + this.totalPrice + ".00");
    }

    void item2RemoveCartButton(int sofaChairsCount, int totalPrice) {
        if (sofaChairsCount > 0) {
            this.sofaChairsCount = sofaChairsCount - 1;
            this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
            this.totalPrice = totalPrice - 50000;
        } else {
            this.sofaChairsCount = sofaChairsCount;
            this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
            this.totalPrice = totalPrice;
        }
        itemsCountLabel.setText(String.valueOf(this.itemsCount));
        sofaChairsCountLabel.setText(String.valueOf(this.sofaChairsCount));
        totalPriceLabel.setText("Rs " + this.totalPrice + ".00");
    }

    void item2AddCartButton(int sofaChairsCount, int totalPrice) {
        this.sofaChairsCount = sofaChairsCount + 1;
        this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
        this.totalPrice = totalPrice + 50000;
        itemsCountLabel.setText(String.valueOf(this.itemsCount));
        sofaChairsCountLabel.setText(String.valueOf(this.sofaChairsCount));
        totalPriceLabel.setText("Rs " + this.totalPrice + ".00");
    }

    void item3RemoveCartButton(int bedsCount, int totalPrice) {
        if (bedsCount > 0) {
            this.bedsCount = bedsCount - 1;
            this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
            this.totalPrice = totalPrice - 250000;
        } else {
            this.bedsCount = bedsCount;
            this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
            this.totalPrice = totalPrice;
        }
        itemsCountLabel.setText(String.valueOf(this.itemsCount));
        bedsCountLabel.setText(String.valueOf(this.bedsCount));
        totalPriceLabel.setText("Rs " + this.totalPrice + ".00");
    }

    void item3AddCartButton(int bedsCount, int totalPrice) {
        this.bedsCount = bedsCount + 1;
        this.itemsCount = this.sofasCount + this.sofaChairsCount + this.bedsCount;
        this.totalPrice = totalPrice + 250000;
        itemsCountLabel.setText(String.valueOf(this.itemsCount));
        bedsCountLabel.setText(String.valueOf(this.bedsCount));
        totalPriceLabel.setText("Rs " + this.totalPrice + ".00");
    }

    public static void main(String[] args) {
        ShoppingCart_Page frame = new ShoppingCart_Page();
        frame.setVisible(true);
    }
}
