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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) themeComboBox.addItem(info.getName());
            themeComboBox.setSelectedItem("Nimbus");
        });
    }

    private GridBagConstraints initGridBagConstraints(int gridwidth)
    {
        GridBagConstraints gbc;

        gbc = new GridBagConstraints();
        gbc.gridx = GridBagConstraints.RELATIVE;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridwidth = gridwidth;
        gbc.ipadx = gbc.gridwidth * 50;

        return gbc;
    }

    private GridBagConstraints initGridBagConstraints()
    {
        return initGridBagConstraints(1);
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
        backspaceButton.setFocusable(false);
        backspaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backspaceButtonActionPerformed(evt);
            }
        });

        num0Button.setText("0");
        num0Button.setFocusable(false);
        num0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num1Button.setText("1");
        num1Button.setFocusable(false);
        num1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num2Button.setText("2");
        num2Button.setFocusable(false);
        num2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num3Button.setText("3");
        num3Button.setFocusable(false);
        num3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num4Button.setText("4");
        num4Button.setFocusable(false);
        num4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num5Button.setText("5");
        num5Button.setFocusable(false);
        num5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num6Button.setText("6");
        num6Button.setFocusable(false);
        num6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num7Button.setText("7");
        num7Button.setFocusable(false);
        num7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num8Button.setText("8");
        num8Button.setFocusable(false);
        num8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        num9Button.setText("9");
        num9Button.setFocusable(false);
        num9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });

        decimalPointButton.setText(".");
        decimalPointButton.setFocusable(false);
        decimalPointButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                decimalPointButtonActionPerformed(evt);
            }
        });

        exponentConstantButton.setText("E");
        exponentConstantButton.setFocusable(false);
        exponentConstantButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exponentConstantButtonActionPerformed(evt);
            }
        });

        additionButton.setText("+");
        additionButton.setFocusable(false);
        additionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        subtractButton.setText("-");
        subtractButton.setFocusable(false);
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        multiplicationButton.setText("✕");
        multiplicationButton.setFocusable(false);
        multiplicationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        divisionButton.setText("/");
        divisionButton.setFocusable(false);
        divisionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        powerButton.setText("^");
        powerButton.setFocusable(false);
        powerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        rootButton.setText("√");
        rootButton.setFocusable(false);
        rootButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        calculateButton.setText("=");
        calculateButton.setFocusable(false);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });

        clearButton.setText("c");
        clearButton.setFocusable(false);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        themeComboBox.setToolTipText("Look and Feel");
        themeComboBox.setFocusable(false);
        themeComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                themeComboBoxItemStateChanged(evt);
            }
        });

        setLayout(new GridBagLayout());

        gbc = initGridBagConstraints(3);
        storedValueLabel.setMinimumSize(new Dimension(0, 15));
        add(storedValueLabel, gbc);

        gbc = initGridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        storedValueLabel.setMinimumSize(new Dimension(0, 15));
        add(operationLabel, gbc);

        gbc = initGridBagConstraints(3);
        storedValueLabel.setMinimumSize(new Dimension(0, 27));
        add(valueField, gbc);

        gbc = initGridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        backspaceButton.setMinimumSize(new Dimension(0, 27));
        add(backspaceButton, gbc);

        gbc = initGridBagConstraints();
        calculateButton.setMinimumSize(new Dimension(0, 27));
        add(calculateButton, gbc);

        gbc = initGridBagConstraints();
        clearButton.setMinimumSize(new Dimension(0, 27));
        add(clearButton, gbc);

        gbc = initGridBagConstraints();
        powerButton.setMinimumSize(new Dimension(0, 27));
        add(powerButton, gbc);

        gbc = initGridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        rootButton.setMinimumSize(new Dimension(0, 27));
        add(rootButton, gbc);

        gbc = initGridBagConstraints();
        num1Button.setMinimumSize(new Dimension(0, 27));
        add(num1Button, gbc);

        gbc = initGridBagConstraints();
        num2Button.setMinimumSize(new Dimension(0, 27));
        add(num2Button, gbc);

        gbc = initGridBagConstraints();
        num3Button.setMinimumSize(new Dimension(0, 27));
        add(num3Button, gbc);

        gbc = initGridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        additionButton.setMinimumSize(new Dimension(0, 27));
        add(additionButton, gbc);

        gbc = initGridBagConstraints();
        num4Button.setMinimumSize(new Dimension(0, 27));
        add(num4Button, gbc);

        gbc = initGridBagConstraints();
        num5Button.setMinimumSize(new Dimension(0, 27));
        add(num5Button, gbc);

        gbc = initGridBagConstraints();
        num6Button.setMinimumSize(new Dimension(0, 27));
        add(num6Button, gbc);

        gbc = initGridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        subtractButton.setMinimumSize(new Dimension(0, 27));
        add(subtractButton, gbc);

        gbc = initGridBagConstraints();
        num7Button.setMinimumSize(new Dimension(0, 27));
        add(num7Button, gbc);

        gbc = initGridBagConstraints();
        num8Button.setMinimumSize(new Dimension(0, 27));
        add(num8Button, gbc);

        gbc = initGridBagConstraints();
        num9Button.setMinimumSize(new Dimension(0, 27));
        add(num9Button, gbc);

        gbc = initGridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        multiplicationButton.setMinimumSize(new Dimension(0, 27));
        add(multiplicationButton, gbc);

        gbc = initGridBagConstraints();
        exponentConstantButton.setMinimumSize(new Dimension(0, 27));
        add(exponentConstantButton, gbc);

        gbc = initGridBagConstraints();
        num0Button.setMinimumSize(new Dimension(0, 27));
        add(num0Button, gbc);

        gbc = initGridBagConstraints();
        decimalPointButton.setMinimumSize(new Dimension(0, 27));
        add(decimalPointButton, gbc);

        gbc = initGridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        divisionButton.setMinimumSize(new Dimension(0, 27));
        add(divisionButton, gbc);

        gbc = initGridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
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
        if (orig.contains("I") || orig.contains("N")) valueField.setText(orig = "");
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
        if ("".equals(orig) || "-".equals(orig) || orig.contains("I") || orig.contains("N")) return;
        if (!orig.contains("E")) valueField.setText(orig + 'E');
    }

    private void numActionPerformedHandler(ActionEvent evt) {
        if (valueField.getText().contains("I") || valueField.getText().contains("N")) valueField.setText("");
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
            JOptionPane.showMessageDialog(this, "Invalid Number!\nPress C to clear the input.");
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

        if ("=".equals(command)) valueField.setText(String.valueOf(previousValue));
    }

    private void themeComboBoxItemStateChanged(ItemEvent evt) {
        SwingUtilities.invokeLater(() -> {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                    if (themeComboBox.getSelectedItem().equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                SwingUtilities.updateComponentTreeUI(this);
            }
            catch (Exception ex) {
                System.err.println("Cannot set "+themeComboBox.getSelectedItem()+" theme.");
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
            themeComboBox.setSelectedIndex((themeComboBox.getSelectedIndex() == 0 ? themeComboBox.getItemCount() : themeComboBox.getSelectedIndex()) - 1);
            break;
        case KeyEvent.VK_DOWN:
            themeComboBox.setSelectedIndex(themeComboBox.getSelectedIndex() == themeComboBox.getItemCount() - 1 ? 0 : themeComboBox.getSelectedIndex() + 1);
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
