/* ProductInformation.java */
/* Date  : 22 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NextFrame extends JFrame{
    final static long serialVersionUID = 0l;

    private JLabel idLabel, nameLabel, descriptionLabel;

    NextFrame(String id, String name, String description)
    {
        initComponents(id, name, description);
    }

    private void initComponents(String id, String name, String description)
    {
        Font font;
        Insets insets;
        GridBagConstraints gbc;

        font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20);
        insets = new Insets(5, 5, 5, 5);

        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.insets = insets;

        setTitle("Next Frame");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridBagLayout());

        idLabel = new JLabel(id, JLabel.CENTER);
        idLabel.setFont(font);
        add(idLabel, gbc);

        nameLabel = new JLabel(name, JLabel.CENTER);
        nameLabel.setFont(font);
        add(nameLabel, gbc);

        descriptionLabel = new JLabel(description, JLabel.CENTER);
        descriptionLabel.setFont(font);
        add(descriptionLabel, gbc);

        setVisible(true);
    }
};

public class ProductInformation extends JFrame implements ActionListener{
    final static long serialVersionUID = 0l;

    private JLabel idLabel, nameLabel, descriptionLabel;
    private JTextField idField, nameField;
    private JTextArea descriptionTextArea;
    private JButton submitButton, cancelButton;

    ProductInformation()
    {
        initComponents();
    }

    private void initComponents()
    {
        Font font;
        Insets insets;
        GridBagConstraints gbc;
        /*
            GridBagConstraints(
                gridx, gridy, gridwidth, gridheight, weightx, weighty,
                anchor, fill, Insets insets, ipadx, ipady
            );

            Insets(top, left, bottom, right);
        */

        font = new Font("Times New Roman", Font.PLAIN, 12);
        insets = new Insets(5, 5, 5, 5);

        setTitle("Product Information");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        idLabel = new JLabel("Product ID", JLabel.CENTER);
        idLabel.setFont(font);
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = insets;
        add(idLabel, gbc);

        idField = new JTextField();
        idField.setFont(font);
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = insets;
        gbc.ipadx = 400;
        add(idField, gbc);

        nameLabel = new JLabel("Name", JLabel.CENTER);
        nameLabel.setFont(font);
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = insets;
        add(nameLabel, gbc);

        nameField = new JTextField();
        nameField.setFont(font);
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = insets;
        gbc.ipadx = 400;
        add(nameField, gbc);

        descriptionLabel = new JLabel("Description", JLabel.CENTER);
        descriptionLabel.setFont(font);
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = insets;
        add(descriptionLabel, gbc);

        descriptionTextArea = new JTextArea();
        descriptionTextArea.setFont(font);
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 175, 5, 175);
        gbc.ipadx = 50;
        gbc.ipady = 20;
        add(descriptionTextArea, gbc);

        submitButton = new JButton("Submit");
        submitButton.setFont(font);
        submitButton.addActionListener(this);
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = insets;
        add(submitButton, gbc);

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(font);
        cancelButton.addActionListener(this);
        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = insets;
        add(cancelButton, gbc);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt)
    {
        switch(evt.getActionCommand()){
        case "Submit":
            new NextFrame(idField.getText(), nameField.getText(),
                                                 descriptionTextArea.getText());
            break;
        case "Cancel":
            idField.setText("");
            nameField.setText("");
            descriptionTextArea.setText("");
            break;
        default:
            break;
        }
    }

    public static void main(String[] args)
    {
        new ProductInformation();
    }
};
/* end of ProductInformation.java */
