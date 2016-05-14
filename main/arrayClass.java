/* arrayClass.java */
/* Date  : 24 February 2016
 * Author: Ankit Pati
 */

import java.util.*;
import java.text.*;

class Student implements Comparable<Student>{
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

    public int compareTo(Student s){ return dob.compareTo(s.dob); }

    public float getHeight(){ return height; }
    public float getWeight(){ return weight; }
    public Date  getDob   (){ return dob   ; }
};

class arrayClass{
    public static void main(String args[]) throws ParseException
    {
        int i, a[];
        Scanner sc;
        Date today;
        Student s[];

        sc = new Scanner(System.in);
        today = new Date();

        System.out.printf(
            "Array of Primitive Types\n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~\n"
        );

        System.out.printf("Number of integers?\n");
        a = new int[sc.nextInt()]; sc.nextLine();

        System.out.printf("Values of %d integers?\n", a.length);
        for(i = 0; i < a.length; ++i) a[i] = sc.nextInt();
        sc.nextLine();

        Arrays.sort(a);

        System.out.printf("Sorted Array:\n");
        for(int ai : a) System.out.printf("%d ", ai); /* for-each iterator */
        System.out.printf("\n");

        System.out.printf("Key to search?\n");
        i = Arrays.binarySearch(a, sc.nextInt()); sc.nextLine();
        if(i == -1) System.out.printf("Key not found.\n");
        else System.out.printf("Key %d found at position %d.\n", a[i], i);

        System.out.printf("~~~~\n\n");

        System.out.printf(
            "Array of Objects\n" +
            "~~~~~~~~~~~~~~~~\n"
        );

        System.out.printf("Number of students?\n");
        s = new Student[sc.nextInt()]; sc.nextLine();

        System.out.printf("Details for %d students?\n", s.length);
        for(i = 0; i < s.length; ++i) s[i] = new Student();

        Arrays.sort(s);

        System.out.printf("Sorted Array:\n");
        for(Student si : s) System.out.printf("%s\n", si);
        System.out.printf("\n");

        System.out.printf("~~~~\n\n");
    }
};
/* end of arrayClass.java */

/* OUTPUT

Array of Primitive Types
~~~~~~~~~~~~~~~~~~~~~~~~
Number of integers?
5
Values of 5 integers?
43 50 13 12 95
Sorted Array:
12 13 43 50 95
Key to search?
43
Key 43 found at position 2.
~~~~

Array of Objects
~~~~~~~~~~~~~~~~
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

Sorted Array:
Details are:
- Roll   : 3
- Name   : Tiashaa Chatterjee
- Weight : 90.5
- Height : 160.0
- Marks  : 50.0
- DOB    : 1995-12-13

Details are:
- Roll   : 4
- Name   : Sahil Pandey
- Weight : 95.0
- Height : 176.0
- Marks  : 40.0
- DOB    : 1995-10-16

Details are:
- Roll   : 1
- Name   : Mayank Verma
- Weight : 85.3
- Height : 165.0
- Marks  : 45.0
- DOB    : 1995-09-23

Details are:
- Roll   : 2
- Name   : Ankit Pati
- Weight : 95.0
- Height : 160.0
- Marks  : 45.0
- DOB    : 1996-04-02

Details are:
- Roll   : 5
- Name   : Ravi Tripathi
- Weight : 95.0
- Height : 150.0
- Marks  : 44.0
- DOB    : 2000-05-21
~~~~

*/
