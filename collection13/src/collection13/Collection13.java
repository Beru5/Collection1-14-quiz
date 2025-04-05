package collection13;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;



public class Collection13 {

    private static ArrayList<Product> products = new ArrayList<>();
    private static DefaultTableModel tableModel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Daftar Produk");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        String[] columnNames = {"Nama Produk", "Harga"};
        tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel inputPanel = new JPanel();
        JTextField nameField = new JTextField(10);
        JTextField priceField = new JTextField(10);
        JButton addButton = new JButton("Tambah");

        addButton.addActionListener(e -> {
            try {
                String name = nameField.getText();
                double price = Double.parseDouble(priceField.getText());

                Product product = new Product(name, price);
                products.add(product);

                tableModel.addRow(new Object[]{name, price});

                nameField.setText("");
                priceField.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Masukkan harga dalam angka!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        inputPanel.add(new JLabel("Nama:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Harga:"));
        inputPanel.add(priceField);
        inputPanel.add(addButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
