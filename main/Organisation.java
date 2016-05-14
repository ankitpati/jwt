/* Organisation.java */
/* Date  : 09 March 2016
 * Author: Ankit Pati
 */

import java.util.*;
import java.text.*;

class Organisation implements Comparable<Organisation>{
    String name;
    int emp, stu;

    Organisation()
    {
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Enter organisation details:\n");
        System.out.printf("- Name        : "); name = sc.nextLine();
        System.out.printf("- No. of Emp. : "); emp = sc.nextInt();sc.nextLine();
        System.out.printf("- No. of Stu. : "); stu = sc.nextInt();sc.nextLine();

        System.out.printf("\n");
    }

    public String toString()
    {
        return "Organisation:" +
            "\n- Name        : " + name +
            "\n- No. of Emp. : " + emp  +
            "\n- No. of Stu. : " + stu  +
            "\n"
        ;
    }

    public int compareTo(Organisation o)
    {
        return name.compareTo(o.name);
    }

    public boolean equals(Organisation o)
    {
        return compareTo(o) == 0;
    }

    public static void main(String args[]) throws ParseException
    {
        Person p1, p2;
        Organisation o1, o2;

        System.out.printf("Employees\n");
        p1 = new Employee();
        p2 = new Employee();
        System.out.printf("The two employees are %ssame.\n\n",
                                                   p1.equals(p2) ? "" : "not ");

        System.out.printf("Students\n");
        p1 = new Student();
        p2 = new Student();
        System.out.printf("The two students are %ssame.\n\n",
                                                   p1.equals(p2) ? "" : "not ");

        System.out.printf("Organisations\n");
        o1 = new Organisation();
        o2 = new Organisation();
        System.out.printf("The two organisations are %ssame.\n\n",
                                                   o1.equals(o2) ? "" : "not ");
    }
};

abstract class Person implements Comparable<Person>{
    String name, sex;
    Organisation org;
    Date dob;
    DateFormat df;

    Person() throws ParseException
    {
        Scanner sc;

        sc = new Scanner(System.in);
        df = new SimpleDateFormat("yyyy-mm-dd");

        System.out.printf("Enter personal details:\n");
        System.out.printf("- Name : "); name = sc.nextLine();
        System.out.printf("- Sex  : "); sex  = sc.nextLine();
        System.out.printf("- DOB  : "); dob  = df.parse(sc.nextLine());
        org = new Organisation();
    }

    public String toString()
    {
        return "Details are:" +
            "\n- Name         : " + name           +
            "\n- Sex          : " + sex            +
            "\n- Organisation : " + org            +
            "\n- DOB          : " + df.format(dob) +
            "\n"
        ;
    }

    public int compareTo(Person p)
    {
        int c;
        return (c = name.compareTo(p.name)) != 0 ? c :
            (c = sex.compareTo(p.sex)) != 0 ? c :
            (c = org.compareTo(p.org)) != 0 ? c : dob.compareTo(p.dob);
    }

    public boolean equals(Person p)
    {
        return compareTo(p) == 0;
    }
};

class Employee extends Person{
    String title;

    Employee() throws ParseException
    {
        super();

        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Enter employee details:\n");
        System.out.printf("- Job Title : "); title = sc.nextLine();

        System.out.printf("\n");
    }

    public String toString()
    {
        return "Details are:" +
            "\n- Job Title : " + title +
            "\n"
        ;
    }
};

class Student extends Person{
    int year;

    Student() throws ParseException
    {
        super();

        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Enter student details:\n");
        System.out.printf("- Year : "); year = sc.nextInt(); sc.nextLine();

        System.out.printf("\n");
    }

    public String toString()
    {
        return "Details are:" +
            "\n- Year : " + year +
            "\n"
        ;
    }
};
/* end of Organisation.java */

/* OUTPUT

Employees
Enter personal details:
- Name : Sahil Pandey
- Sex  : Male
- DOB  : 1990-12-01
Enter organisation details:
- Name        : ABC Corporation
- No. of Emp. : 50
- No. of Stu. : 0
Enter employee details:
- Job Title : Manager

Enter personal details:
- Name : Sahil Pandey
- Sex  : Male
- DOB  : 1990-12-01
Enter organisation details:
- Name        : ABC Corporation
- No. of Emp. : 50
- No. of Stu. : 0
Enter employee details:
- Job Title : Manager

The two employees are same.

Students
Enter personal details:
- Name : Ankit Pati
- Sex  : Male
- DOB  : 1996-04-02
Enter organisation details:
- Name        : SIT
- No. of Emp. : 200
- No. of Stu. : 3000
Enter student details:
- Year : 2

Enter personal details:
- Name : Tiashaa Chatterjee
- Sex  : Female
- DOB  : 1995-12-13
Enter organisation details:
- Name        : NLUO
- No. of Emp. : 150
- No. of Stu. : 1500
Enter student details:
- Year : 1

The two students are not same.

Organisations
Enter organisation details:
- Name        : SIT
- No. of Emp. : 200
- No. of Stu. : 3000

Enter organisation details:
- Name        : SIT
- No. of Emp. : 200
- No. of Stu. : 3000
The two organisations are same.

*/
