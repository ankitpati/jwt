/* Result.java */
/* Date  : 16 March 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

interface Exam{
    float PercentCal();
};

class Student{
    String name;
    int roll;
    float mark1, mark2;

    Student(String name, int roll, float mark1, float mark2)
    {
        this.name  = name;
        this.roll  = roll;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
};

class Result extends Student implements Exam{
    Result(String name, int roll, float mark1, float mark2)
    {
        super(name, roll, mark1, mark2);
    }

    public float PercentCal()
    {
        return (mark1 + mark2) / 2.0f; /* both marks out of 100 */
    }

    void display()
    {
        System.out.printf(
            "~~~~ Result ~~~~" +
            "\n- Name    : " + name  +
            "\n- Roll    : " + roll  +
            "\n- Mark1   : " + mark1 +
            "\n- Mark2   : " + mark2 +
            "\n- Percent : " + PercentCal() +
            "\n"
        );
    }

    public static void main(String args[])
    {
        String name;
        int roll;
        float mark1, mark2;
        Scanner sc;
        Result r;

        sc = new Scanner(System.in);

        System.out.printf("Student Details?\n");
        System.out.printf("- Name  : "); name  = sc.nextLine();
        System.out.printf("- Roll  : "); roll  = sc.nextInt(); sc.nextLine();
        System.out.printf("- Mark1 : "); mark1 = sc.nextFloat(); sc.nextLine();
        System.out.printf("- Mark2 : "); mark2 = sc.nextFloat(); sc.nextLine();

        r = new Result(name, roll, mark1, mark2);

        r.display();

        return;
    }
};
/* end of Result.java */

/* OUTPUT

Student Details?
- Name  : Ankit Pati
- Roll  : 506
- Mark1 : 43
- Mark2 : 50
~~~~ Result ~~~~
- Name    : Ankit Pati
- Roll    : 506
- Mark1   : 43.0
- Mark2   : 50.0
- Percent : 46.5

*/
