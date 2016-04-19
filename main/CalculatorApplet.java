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

        /* set Nimbus theme */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            SwingUtilities.updateComponentTreeUI(this);
        }
        catch (Exception ex) {
            System.err.println("Cannot set Nimbus theme.");
        }

        /* setting and unsetting ENTER keybindings */
        getRootPane().setDefaultButton(calculate);
        add.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        clear.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        decimalPoint.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        div.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        eraseToLeft.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        exponentConstant.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        mul.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num0.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num1.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num2.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num3.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num4.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num5.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num6.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num7.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num8.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        num9.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        power.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        root.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
        sub.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "none");
    }

    private void initComponents() {

        eraseToLeft = new JButton();
        num5 = new JButton();
        clear = new JButton();
        num4 = new JButton();
        sub = new JButton();
        decimalPoint = new JButton();
        num0 = new JButton();
        calculate = new JButton();
        num3 = new JButton();
        num8 = new JButton();
        num1 = new JButton();
        value = new JTextField();
        num9 = new JButton();
        power = new JButton();
        exponentConstant = new JButton();
        num6 = new JButton();
        num2 = new JButton();
        root = new JButton();
        storedValue = new JLabel();
        mul = new JButton();
        num7 = new JButton();
        div = new JButton();
        add = new JButton();
        operation = new JLabel();

        eraseToLeft.setText("⌫");
        eraseToLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                eraseToLeftActionPerformed(evt);
            }
        });
        eraseToLeft.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        clear.setText("c");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        clear.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        sub.setText("-");
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        sub.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        decimalPoint.setText(".");
        decimalPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                decimalPointActionPerformed(evt);
            }
        });
        decimalPoint.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num0.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        calculate.setText("=");
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        calculate.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num8.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num1.setText("1");
        num1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        value.setEditable(false);
        value.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num9.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        power.setText("^");
        power.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        power.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        exponentConstant.setText("E");
        exponentConstant.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exponentConstantActionPerformed(evt);
            }
        });
        exponentConstant.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num6.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        root.setText("√");
        root.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        root.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        storedValue.setText("0.0");

        mul.setText("✕");
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        mul.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                numActionPerformedHandler(evt);
            }
        });
        num7.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        div.setText("/");
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        div.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculationActionPerformedHandler(evt);
            }
        });
        add.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                keyTypedHandler(evt);
            }
        });

        operation.setText("=");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(storedValue, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operation, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(calculate)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(power)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(root))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(value, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eraseToLeft))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num8)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(exponentConstant)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num0)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(decimalPoint)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(add)
                                .addComponent(sub)
                                .addComponent(mul)
                                .addComponent(div)))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {add, calculate, clear, decimalPoint, div, exponentConstant, mul, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, power, root, sub});

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(operation)
                    .addComponent(storedValue))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(value, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(eraseToLeft))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate)
                    .addComponent(power)
                    .addComponent(root)
                    .addComponent(clear))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num1)
                    .addComponent(num2)
                    .addComponent(num3)
                    .addComponent(add))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num4)
                    .addComponent(num5)
                    .addComponent(num6)
                    .addComponent(sub))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num7)
                    .addComponent(num8)
                    .addComponent(num9)
                    .addComponent(mul))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(num0)
                    .addComponent(div)
                    .addComponent(decimalPoint)
                    .addComponent(exponentConstant))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(SwingConstants.VERTICAL, new Component[] {add, calculate, clear, decimalPoint, div, exponentConstant, mul, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, power, root, sub, value});
    }

    private void clearActionPerformed(ActionEvent evt) {
        value.setText("");
        storedValue.setText("0.0");
        operation.setText("=");
    }

    private void decimalPointActionPerformed(ActionEvent evt) {
        int i;
        String orig;

        orig = value.getText();

        if(orig.contains(".") || orig.contains("E")) return;
        if(orig.contains("I") || orig.contains("N")) value.setText(orig = "");
        /* Checking for these letters because
            E = Exponent
            I = Infinity
            N = NaN
        */

        value.setText(orig + '.');
    }

    private void keyTypedHandler(KeyEvent evt) {
        switch(evt.getKeyChar()){
        case '1':
            num1.doClick();
            break;
        case '2':
            num2.doClick();
            break;
        case '3':
            num3.doClick();
            break;
        case '4':
            num4.doClick();
            break;
        case '5':
            num5.doClick();
            break;
        case '6':
            num6.doClick();
            break;
        case '7':
            num8.doClick();
            break;
        case '8':
            num8.doClick();
            break;
        case '9':
            num9.doClick();
            break;
        case '0':
            num0.doClick();
            break;
        case '.':
            decimalPoint.doClick();
            break;
        case 'e':   /* intended fall-through */
        case 'E':
            exponentConstant.doClick();
            break;
        case '=':
            calculate.doClick();
            break;
        case '\b':
            eraseToLeft.doClick();
            break;
        case 'c':   /* intended fall-through */
        case 'C':
            clear.doClick();
            break;
        case '+':
            add.doClick();
            break;
        case '-':
            sub.doClick();
            break;
        case '*':   /* intended fall-through */
        case 'x':
        case 'X':
            mul.doClick();
            break;
        case '/':
            div.doClick();
            break;
        case '^':
            power.doClick();
            break;
        case 'r':
            root.doClick();
            break;
        default:
            break;
        }
    }

    private void eraseToLeftActionPerformed(ActionEvent evt) {
        String orig;
        orig = value.getText();
        if(orig.length() == 0) return;
        value.setText(orig.substring(0, orig.length() - 1));
    }

    private void exponentConstantActionPerformed(ActionEvent evt) {
        int i;
        String orig;
        orig = value.getText();
        if("".equals(orig) || "-".equals(orig) || orig.contains("I") || orig.contains("N")) return;
        if(!orig.contains("E")) value.setText(orig + 'E');
    }

    private void numActionPerformedHandler(ActionEvent evt) {
        if(value.getText().contains("I") || value.getText().contains("N")) value.setText("");
        value.setText(value.getText() + evt.getActionCommand());
    }

    private void calculationActionPerformedHandler(ActionEvent evt) {
        double previousValue, currentValue;
        String orig, command, previousCommand;

        orig = value.getText();
        command = evt.getActionCommand();
        previousCommand = operation.getText();

        if("".equals(orig) || orig.charAt(orig.length() - 1) == 'E'){
            if("-".equals(command)) value.setText(orig + '-');
            else if(!"=".equals(command)) operation.setText(command);
            return;
        }

        if(orig.charAt(orig.length() - 1) == '-'){
            if(!"=".equals(command)) operation.setText(command);
            return;
        }

        try{
            previousValue = Double.parseDouble(storedValue.getText());
            currentValue = Double.parseDouble(orig);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Invalid Number!\nPress C to clear the input.");
            return;
        }

        value.setText("");

        switch(previousCommand){
        case "+":
            previousValue += currentValue;
            break;
        case "-":
            previousValue -= currentValue;
            break;
        case "\u2715":
            previousValue *= currentValue;
            break;
        case "/":
            previousValue /= currentValue;
            break;
        case "^":
            previousValue = Math.pow(previousValue, currentValue);
            break;
        case "\u221a":
            previousValue = Math.pow(currentValue, 1.0 / previousValue);
            break;
        case "=":
            previousValue = currentValue;
            break;
        }

        operation.setText(command);
        storedValue.setText(String.valueOf(previousValue));

        if("=".equals(command)) value.setText(String.valueOf(previousValue));
    }

    private JButton add;
    private JButton calculate;
    private JButton clear;
    private JButton decimalPoint;
    private JButton div;
    private JButton eraseToLeft;
    private JButton exponentConstant;
    private JButton mul;
    private JButton num0;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JLabel operation;
    private JButton power;
    private JButton root;
    private JLabel storedValue;
    private JButton sub;
    private JTextField value;
}
/*
    <object code="CalculatorApplet" width="185" height="225"></object>
*/
/* end of CalculatorApplet.java */
