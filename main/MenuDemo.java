/* MenuDemo.java */
/* Date  : 14 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

class MenuDemo extends Frame
{
    final static long serialVersionUID = 0l;
    Menu file, edit;
    MenuItem open, save, cut, copy;
    MenuBar mbar;
    Label sltd;

    MenuDemo()
    {
        file = new Menu("File");
        edit = new Menu("Edit");

        open = new MenuItem("Open");
        save = new MenuItem("Save");

        cut  = new MenuItem("Cut");
        copy = new MenuItem("Copy");

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

        open.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    sltd.setText("Open Selected");
                }
            }
        );

        save.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    sltd.setText("Save Selected");
                }
            }
        );

        cut.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    sltd.setText("Cut Selected");
                }
            }
        );

        copy.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    sltd.setText("Copy Selected");
                }
            }
        );

        file.add(open);
        file.addSeparator();
        file.add(save);

        edit.add(cut);
        edit.add(copy);

        mbar.add(file);
        mbar.add(edit);

        setMenuBar(mbar);
        add(sltd);

        setVisible(true);
    }

    public static void main(String[] args)
    {
       MenuDemo md;
       md = new MenuDemo();
       return;
    }
};
/* end of MenuDemo.java */
