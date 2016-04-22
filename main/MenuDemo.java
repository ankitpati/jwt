/* MenuDemo.java */
/* Date  : 14 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

class MenuDemo extends Frame implements ActionListener{
    final static long serialVersionUID = 0l;
    Menu file, edit, form, help;
    MenuItem open, save, cut, copy, bold, ital, abt;
    MenuBar mbar;
    Label sltd;

    MenuDemo()
    {
        file = new Menu("File");
        edit = new Menu("Edit");
        form = new Menu("Format");
        help = new Menu("Help");

        open = new MenuItem("Open");
        save = new MenuItem("Save");

        cut  = new MenuItem("Cut");
        copy = new MenuItem("Copy");

        bold = new MenuItem("Bold");
        ital = new MenuItem("Italics");

        abt  = new MenuItem("About");

        mbar = new MenuBar();

        sltd = new Label("None Selected", Label.CENTER);

        setTitle("Menu Demo");
        setSize(225, 175);
        setLayout(new GridLayout(1, 1));
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        open.addActionListener(this);
        save.addActionListener(this);
        cut .addActionListener(this);
        copy.addActionListener(this);
        bold.addActionListener(this);
        ital.addActionListener(this);
        abt .addActionListener(this);

        file.add(open);
        file.addSeparator();
        file.add(save);

        edit.add(cut );
        edit.add(copy);

        form.add(bold);
        form.add(ital);

        help.add(abt );

        mbar.add(file);
        mbar.add(edit);
        mbar.add(form);
        mbar.add(help);

        setMenuBar(mbar);
        add(sltd);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt)
    {
        sltd.setText(evt.getActionCommand() + " Selected");
    }

    public static void main(String[] args)
    {
       MenuDemo md;
       md = new MenuDemo();
       return;
    }
};
/* end of MenuDemo.java */
