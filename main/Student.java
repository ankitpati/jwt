/* Student.java */
/* Date  : 16 February 2016
 * Author: Ankit Pati
 */

import java.util.*;
import java.text.*;

class Student{
    int roll;
    float weight, height, marks;
    String name;
    Date dob;
    DateFormat df;

    Student() throws ParseException
    {
        Scanner sc;

        sc = new Scanner(System.in);
        df = new SimpleDateFormat("yyyy-mm-dd");

        System.out.printf("Enter following details:\n");
        System.out.printf("- Roll   : "); roll   = sc.nextInt  ();sc.nextLine();
        System.out.printf("- Name   : "); name   = sc.nextLine ();
        System.out.printf("- Weight : "); weight = sc.nextFloat();sc.nextLine();
        System.out.printf("- Height : "); height = sc.nextFloat();sc.nextLine();
        System.out.printf("- Marks  : "); marks  = sc.nextFloat();sc.nextLine();
        System.out.printf("- DOB    : "); dob    = df.parse(sc.nextLine());
        System.out.printf("\n");
    }

    public String toString()
    {
        return
            "Details are:" +
            "\n- Roll   : "  + roll           +
            "\n- Name   : "  + name           +
            "\n- Weight : "  + weight         +
            "\n- Height : "  + height         +
            "\n- Marks  : "  + marks          +
            "\n- DOB    : "  + df.format(dob) +
            "\n"
        ;
    }

    public float getHeight(){ return height; }
    public float getWeight(){ return weight; }
    public Date  getDob   (){ return dob   ; }

    public static void main(String args[]) throws ParseException
    {
        int i;
        Date today;
        Student s[];

        today = new Date();

        System.out.printf("Number of students?\n");
        s = new Student[new Scanner(System.in).nextInt()];

        System.out.printf("Details for %d students?\n", s.length);
        for(i = 0; i < s.length; ++i) s[i] = new Student();

        System.out.printf(
            "List of students >= 19 years, > 90.5 kgf, < 175.0 cm:\n"
        );
        for(i = 0; i < s.length; ++i){
            if(
                today.getYear() - s[i].dob.getYear() >= 19 &&
                s[i].weight > 90.5f && s[i].height < 175.0f
            ) System.out.printf("%s\n", s[i]);
        }

        return;
    }
};
/* end of Student.java */

/* OUTPUT

Number of students?
5
Details for 5 students?
Enter following details:
- Roll   : 1
- Name   : Mayank Verma
- Weight : 85.3
- Height : 165
- Marks  : 45
- DOB    : 1995-09-23

Enter following details:
- Roll   : 2
- Name   : Ankit Pati
- Weight : 95
- Height : 160
- Marks  : 43
- DOB    : 1996-04-02

Enter following details:
- Roll   : 3
- Name   : Tiashaa Chatterjee
- Weight : 90.5
- Height : 160
- Marks  : 50
- DOB    : 1995-12-13

Enter following details:
- Roll   : 4
- Name   : Sahil Pandey
- Weight : 95
- Height : 176
- Marks  : 40
- DOB    : 1995-10-16

Enter following details:
- Roll   : 5
- Name   : Ravi Tripathi
- Weight : 95
- Height : 150
- Marks  : 44
- DOB    : 2000-05-21

List of students >= 19 years, > 90.5 kgf, < 175.0 cm:
Details are:
- Roll   : 2
- Name   : Ankit Pati
- Weight : 95.0
- Height : 160.0
- Marks  : 43.0
- DOB    : 1996-04-02

Details are:
- Roll   : 3
- Name   : Tiashaa Chatterjee
- Weight : 90.6
- Height : 160.0
- Marks  : 50.0
- DOB    : 1995-12-13

*/
