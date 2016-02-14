/* Employee.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

import java.lang.*;
import java.util.Scanner;

class Employee{
    int emp_id;
    String emp_name;
    float basic_salary, da, hra, gross_salary;

    Employee(int emp_id, String emp_name, float basic_salary)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;

        da = basic_salary * 15.0f/100.0f;
        hra = basic_salary * 10.0f/100.0f;
        gross_salary = basic_salary + da + hra;
    }

    float getGrossSalary()
    {
        return gross_salary;
    }

    public static void main(String args[])
    {
        int emp_id;
        String emp_name;
        float basic_salary;
        Scanner sc;
        Employee e;

        sc = new Scanner(System.in);

        System.out.printf("Employee ID, name, and basic salary?\n");
        emp_id = sc.nextInt(); sc.nextLine();
        emp_name = sc.nextLine();
        basic_salary = sc.nextFloat(); sc.nextLine();

        e = new Employee(emp_id, emp_name, basic_salary);

        System.out.printf("Gross Salary is %.2f.\n", e.getGrossSalary());

        return;
    }
};
/* end of Employee.java */

/* OUTPUT

Employee ID, name, and basic salary?
43
Ankit Pati
50000
Gross Salary is 62500.00.

*/
