/* LanguageList.java */
/* Date  : 13 April 2016
 * Author: Ankit Pati
 */

import java.awt.*;
import java.awt.event.*;

public class LanguageList extends Frame{
    final static long serialVersionUID = 0l;
    String languages[] = {"C", "C++", "Java", "HTML", "XML", "C#", "Python",
                                                    "Ruby", "Pascal", "COBOL"};
    List l1, l2;
    Button arrow, clear;

    LanguageList(){
        l1 = new List(languages.length, true);
        l2 = new List(languages.length);
        arrow = new Button(">>");
        clear = new Button("Clear");

        setTitle("Language List");
        setSize(400, 190);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evt)
                {
                    System.exit(0);
                }
            }
        );

        for(String lang : languages) l1.add(lang);

        l1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    l2.add(evt.getActionCommand());
                }
            }
        );

        arrow.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    for(String lang : l1.getSelectedItems()) l2.add(lang);
                }
            }
        );

        clear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt)
                {
                    l2.removeAll();
                }
            }
        );

        add(l1);
        add(arrow);
        add(l2);
        add(clear);

        setVisible(true);
    }

    public static void main(String args[])
    {
        new LanguageList();
    }
};
/* end of LanguageList.java */
