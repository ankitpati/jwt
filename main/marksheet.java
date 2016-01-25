/* marksheet.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

class Student{
    int prn;
    String name, dept;
    float marks[];
    Scanner sc;

    public Student()
    {
        sc = new Scanner(System.in);
        marks = new float[5];
    }

    public void getMarks()
    {
        int i;

        System.out.printf("Enter following details:\n");
        System.out.printf("- PRN   : "); prn  = sc.nextInt(); sc.nextLine();
        System.out.printf("- Name  : "); name = sc.nextLine();
        System.out.printf("- Dept. : "); dept = sc.nextLine();
        System.out.printf("- Marks in 5 subjects:\n");

        for(i = 0; i < 5; ++i)
            marks[i] = sc.nextFloat();
        sc.nextLine();
    }

    public void generateMarksheet()
    {
        int i;
        float total;

        total = 0.0f;
        for(i = 0; i < 5; ++i)
            total += marks[i];

        System.out.printf(
            "~~~~ Marksheet ~~~~\n" +
            "- PRN   : %d\n" +
            "- Name  : %s\n" +
            "- Dept. : %s\n" +
            "- Total : %f\n" +
            "- Avg.  : %f\n" ,
            prn, name, dept, total, total/5
        );
    }
};

class marksheet{
    public static void main(String args[])
    {
        Student s;

        s = new Student();

        s.getMarks();
        s.generateMarksheet();

        return;
    }
};
/* end of marksheet.java */
