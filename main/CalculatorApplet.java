/* CalculatorApplet.java */
/* Date  : 15 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorApplet extends JApplet {
    final static long serialVersionUID = 0l;

    public void init() {
        initComponents();

        getRootPane().setDefaultButton(calculateButton);

        SwingUtilities.invokeLater(() -> {
            for (
                UIManager.LookAndFeelInfo info :
                UIManager.getInstalledLookAndFeels()
            ) themeComboBox.addItem(info.getName());
            themeComboBox.setSelectedItem("Nimbus");
        });
    }

    private GridBagConstraints initComponentLayout(Component com, int gridwidth)
    {
        GridBagConstraints gbc;

        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridwidth = gridwidth;
        gbc.ipadx = gbc.gridwidth * 50;

        com.setFocusable(false);
        com.setMinimumSize(new Dimension(0, 27));

        return gbc;
    }

    private void initComponents() {
        GridBagConstraints gbc;

        storedValueLabel = new JLabel();
        operationLabel = new JLabel();
        valueField = new JTextField();
        backspaceButton = new JButton();
        num0Button = new JButton();
        num1Button = new JButton();
        num2Button = new JButton();
        num3Button = new JButton();
        num4Button = new JButton();
        num5Button = new JButton();
        num6Button = new JButton();
        num7Button = new JButton();
        num8Button = new JButton();
        num9Button = new JButton();
        decimalPointButton = new JButton();
        exponentConstantButton = new JButton();
        additionButton = new JButton();
        subtractButton = new JButton();
        multiplicationButton = new JButton();
        divisionButton = new JButton();
        powerButton = new JButton();
        rootButton = new JButton();
        calculateButton = new JButton();
        clearButton = new JButton();
        themeComboBox = new JComboBox<String>();

        storedValueLabel.setText("0.0");

        operationLabel.setText("=");

        valueField.setEditable(false);
        valueField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                valueFieldKeyTyped(evt);
            }
            public void keyPressed(KeyEvent evt) {
                valueFieldKeyPressed(evt);
            }
        });

        backspaceButton.setText("⌫");
        backspaceButton.addActionListener((ActionEvent evt) ->
                                           backspaceButtonActionPerformed(evt));

        num0Button.setText("0");
        num0Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num1Button.setText("1");
        num1Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num2Button.setText("2");
        num2Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num3Button.setText("3");
        num3Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num4Button.setText("4");
        num4Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num5Button.setText("5");
        num5Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num6Button.setText("6");
        num6Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num7Button.setText("7");
        num7Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num8Button.setText("8");
        num8Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        num9Button.setText("9");
        num9Button.addActionListener((ActionEvent evt) ->
                                                numActionPerformedHandler(evt));

        decimalPointButton.setText(".");
        decimalPointButton.addActionListener((ActionEvent evt) ->
                                        decimalPointButtonActionPerformed(evt));

        exponentConstantButton.setText("E");
        exponentConstantButton.addActionListener((ActionEvent evt) ->
                                    exponentConstantButtonActionPerformed(evt));

        additionButton.setText("+");
        additionButton.addActionListener((ActionEvent evt) ->
                                        calculationActionPerformedHandler(evt));

        subtractButton.setText("-");
        subtractButton.addActionListener((ActionEvent evt) ->
                                        calculationActionPerformedHandler(evt));

        multiplicationButton.setText("✕");
        multiplicationButton.addActionListener((ActionEvent evt) ->
                                        calculationActionPerformedHandler(evt));

        divisionButton.setText("/");
        divisionButton.addActionListener((ActionEvent evt) ->
                                        calculationActionPerformedHandler(evt));

        powerButton.setText("^");
        powerButton.addActionListener((ActionEvent evt) ->
                                        calculationActionPerformedHandler(evt));

        rootButton.setText("√");
        rootButton.addActionListener((ActionEvent evt) ->
                                        calculationActionPerformedHandler(evt));

        calculateButton.setText("=");
        calculateButton.addActionListener((ActionEvent evt) ->
                                        calculationActionPerformedHandler(evt));

        clearButton.setText("c");
        clearButton.addActionListener((ActionEvent evt) ->
                                               clearButtonActionPerformed(evt));

        themeComboBox.setToolTipText("Look and Feel");
        themeComboBox.addItemListener((ItemEvent evt) ->
                                            themeComboBoxItemStateChanged(evt));

        setLayout(new GridBagLayout());

        gbc = initComponentLayout(storedValueLabel, 3);
        add(storedValueLabel, gbc);

        gbc = initComponentLayout(operationLabel, 1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(operationLabel, gbc);

        gbc = initComponentLayout(valueField, 3);
        valueField.setFocusable(true);
        add(valueField, gbc);

        gbc = initComponentLayout(backspaceButton, 1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(backspaceButton, gbc);

        gbc = initComponentLayout(calculateButton, 1);
        add(calculateButton, gbc);

        gbc = initComponentLayout(clearButton, 1);
        add(clearButton, gbc);

        gbc = initComponentLayout(powerButton, 1);
        add(powerButton, gbc);

        gbc = initComponentLayout(rootButton, 1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(rootButton, gbc);

        gbc = initComponentLayout(num1Button, 1);
        add(num1Button, gbc);

        gbc = initComponentLayout(num2Button, 1);
        add(num2Button, gbc);

        gbc = initComponentLayout(num3Button, 1);
        add(num3Button, gbc);

        gbc = initComponentLayout(additionButton, 1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(additionButton, gbc);

        gbc = initComponentLayout(num4Button, 1);
        add(num4Button, gbc);

        gbc = initComponentLayout(num5Button, 1);
        add(num5Button, gbc);

        gbc = initComponentLayout(num6Button, 1);
        add(num6Button, gbc);

        gbc = initComponentLayout(subtractButton, 1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(subtractButton, gbc);

        gbc = initComponentLayout(num7Button, 1);
        add(num7Button, gbc);

        gbc = initComponentLayout(num8Button, 1);
        add(num8Button, gbc);

        gbc = initComponentLayout(num9Button, 1);
        add(num9Button, gbc);

        gbc = initComponentLayout(multiplicationButton, 1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(multiplicationButton, gbc);

        gbc = initComponentLayout(exponentConstantButton, 1);
        add(exponentConstantButton, gbc);

        gbc = initComponentLayout(num0Button, 1);
        add(num0Button, gbc);

        gbc = initComponentLayout(decimalPointButton, 1);
        add(decimalPointButton, gbc);

        gbc = initComponentLayout(divisionButton, 1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(divisionButton, gbc);

        gbc = initComponentLayout(themeComboBox, 1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(themeComboBox, gbc);
    }

    private void clearButtonActionPerformed(ActionEvent evt) {
        valueField.setText("");
        storedValueLabel.setText("0.0");
        operationLabel.setText("=");
    }

    private void decimalPointButtonActionPerformed(ActionEvent evt) {
        String orig;

        orig = valueField.getText();

        if (orig.contains(".") || orig.contains("E")) return;
        if (orig.contains("I") || orig.contains("N"))
            valueField.setText(orig = "");
        /* Checking for these letters because
            E = Exponent
            I = Infinity
            N = NaN
        */

        valueField.setText(orig + '.');
    }

    private void backspaceButtonActionPerformed(ActionEvent evt) {
        String orig;
        orig = valueField.getText();
        if (orig.length() == 0) return;
        valueField.setText(orig.substring(0, orig.length() - 1));
    }

    private void exponentConstantButtonActionPerformed(ActionEvent evt) {
        String orig;
        orig = valueField.getText();
        if ("".equals(orig) || "-".equals(orig) ||
                               orig.contains("I") || orig.contains("N")) return;
        if (!orig.contains("E")) valueField.setText(orig + 'E');
    }

    private void numActionPerformedHandler(ActionEvent evt) {
        if (valueField.getText().contains("I") ||
                     valueField.getText().contains("N")) valueField.setText("");
        valueField.setText(valueField.getText() + evt.getActionCommand());
    }

    private void calculationActionPerformedHandler(ActionEvent evt) {
        double previousValue, currentValue;
        String orig, command, previousCommand;

        orig = valueField.getText();
        command = evt.getActionCommand();
        previousCommand = operationLabel.getText();

        if ("".equals(orig) || orig.charAt(orig.length() - 1) == 'E') {
            if ("-".equals(command)) valueField.setText(orig + '-');
            else if (!"=".equals(command)) operationLabel.setText(command);
            return;
        }

        if (orig.charAt(orig.length() - 1) == '-') {
            if (!"=".equals(command)) operationLabel.setText(command);
            return;
        }

        try {
            previousValue = Double.parseDouble(storedValueLabel.getText());
            currentValue = Double.parseDouble(orig);
        }
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                          this, "Invalid Number!\nPress C to clear the input.");
            return;
        }

        valueField.setText("");

        switch (previousCommand) {
        case "+":
            previousValue += currentValue;
            break;
        case "-":
            previousValue -= currentValue;
            break;
        case "✕":
            previousValue *= currentValue;
            break;
        case "/":
            previousValue /= currentValue;
            break;
        case "^":
            previousValue = Math.pow(previousValue, currentValue);
            break;
        case "√":
            previousValue = Math.pow(currentValue, 1.0 / previousValue);
            break;
        case "=":
            previousValue = currentValue;
            break;
        }

        operationLabel.setText(command);
        storedValueLabel.setText(String.valueOf(previousValue));

        if ("=".equals(command))
            valueField.setText(String.valueOf(previousValue));
    }

    private void themeComboBoxItemStateChanged(ItemEvent evt) {
        SwingUtilities.invokeLater(() -> {
            try {
                for (UIManager.LookAndFeelInfo info :
                                           UIManager.getInstalledLookAndFeels())
                    if(themeComboBox.getSelectedItem().equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                SwingUtilities.updateComponentTreeUI(this);
            }
            catch (Exception ex) {
                System.err.println(
                    "Cannot set " + themeComboBox.getSelectedItem() + " theme."
                );
            }
        });
    }

    private void valueFieldKeyTyped(KeyEvent evt) {
        switch (evt.getKeyChar()) {
        case '1':
            num1Button.doClick();
            break;
        case '2':
            num2Button.doClick();
            break;
        case '3':
            num3Button.doClick();
            break;
        case '4':
            num4Button.doClick();
            break;
        case '5':
            num5Button.doClick();
            break;
        case '6':
            num6Button.doClick();
            break;
        case '7':
            num7Button.doClick();
            break;
        case '8':
            num8Button.doClick();
            break;
        case '9':
            num9Button.doClick();
            break;
        case '0':
            num0Button.doClick();
            break;
        case '.':
            decimalPointButton.doClick();
            break;
        case 'e':   /* intended fall-through */
        case 'E':
            exponentConstantButton.doClick();
            break;
        case '=':
            calculateButton.doClick();
            break;
        case '\b':
            backspaceButton.doClick();
            break;
        case 'c':   /* intended fall-through */
        case 'C':
            clearButton.doClick();
            break;
        case '+':
            additionButton.doClick();
            break;
        case '-':
            subtractButton.doClick();
            break;
        case '*':   /* intended fall-through */
        case 'x':
        case 'X':
            multiplicationButton.doClick();
            break;
        case '/':
            divisionButton.doClick();
            break;
        case '^':
            powerButton.doClick();
            break;
        case 'r':
            rootButton.doClick();
            break;
        default:
            break;
        }
    }

    private void valueFieldKeyPressed(KeyEvent evt) {
        switch (evt.getKeyCode()) {
        case KeyEvent.VK_UP:
            themeComboBox.setSelectedIndex(
                (themeComboBox.getSelectedIndex() == 0 ?
                 themeComboBox.getItemCount() :
                 themeComboBox.getSelectedIndex()) - 1
            );
            break;
        case KeyEvent.VK_DOWN:
            themeComboBox.setSelectedIndex(
                themeComboBox.getSelectedIndex() == themeComboBox.getItemCount()
                                  - 1 ? 0 : themeComboBox.getSelectedIndex() + 1
            );
            break;
        default:
            break;
        }
    }

    public static void main(String args[])
    {
        new CalculatorFrame();
    }

    private JButton additionButton;
    private JButton backspaceButton;
    private JButton calculateButton;
    private JButton clearButton;
    private JButton decimalPointButton;
    private JButton divisionButton;
    private JButton exponentConstantButton;
    private JButton multiplicationButton;
    private JButton num0Button;
    private JButton num1Button;
    private JButton num2Button;
    private JButton num3Button;
    private JButton num4Button;
    private JButton num5Button;
    private JButton num6Button;
    private JButton num7Button;
    private JButton num8Button;
    private JButton num9Button;
    private JLabel operationLabel;
    private JButton powerButton;
    private JButton rootButton;
    private JLabel storedValueLabel;
    private JButton subtractButton;
    private JComboBox<String> themeComboBox;
    private JTextField valueField;
};

class CalculatorFrame extends JFrame {
    final static long serialVersionUID = 0l;

    CalculatorFrame() {
        initComponents();
    }

    private void initComponents() {
        calculatorApplet = new CalculatorApplet();
        calculatorApplet.init();

        setTitle("Calculator");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(calculatorApplet);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JApplet calculatorApplet;
};
/*
    <object code="CalculatorApplet" width="250" height="300"></object>
*/
/* end of CalculatorApplet.java */
