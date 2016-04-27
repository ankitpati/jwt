/* Employee2.java */
/* Date  : 23 February 2016
 * Author: Ankit Pati
 */

abstract class Employee2{
    int id;
    String name, address, department;

    Employee2(String name, String address, String department)
    {
        setName(name);
        setAddress(address);
        setDepartment(department);
    }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setAddress(String address){ this.address = address; }
    public String getAddress(){ return address; }

    public void setDepartment(String department){this.department = department; }
    public String getDepartment(){ return department; }

    public static void main(String args[])
    {
        int i, j, k;
        Employee2 e[];
        FixedSalary f[];
        HourlySalary h[];

        e = new Employee2[10];
        f = new FixedSalary[5];
        h = new HourlySalary[5];

        for(i = 0; i < f.length; ++i)
            f[i] = new FixedSalary(
                "FixedSalary   " + i,
                "FS_Address    " + i,
                "FS_Department " + i,
                1500 * (i + 1)
            );

        for(i = 0; i < h.length; ++i)
            h[i] = new HourlySalary(
                "HourlySalary  " + i,
                "HS_Address    " + i,
                "HS_Department " + i,
                50 * (i + 1), i
            );

        i = j = k = 0;
        while(j < f.length) e[i++] = f[j++];
        while(k < h.length) e[i++] = h[k++];

        for(i = 0; i < e.length; ++i) System.out.printf("%s\n", e[i].getName());

        return;
    }
};

class FixedSalary extends Employee2{
    float salary;

    FixedSalary(String name, String address, String department, float salary)
    {
        super(name, address, department);
        setSalary(salary);
    }

    public void setSalary(float salary){ this.salary = salary; }
    public float getSalary(){ return salary; }
};

class HourlySalary extends Employee2{
    float salaryPerHour;
    int hours;

    HourlySalary(
        String name, String address, String department,
        float salaryPerHour, int hours
    )
    {
        super(name, address, department);
        setSalaryPerHour(salaryPerHour);
        setHours(hours);
    }

    public void setSalaryPerHour(float salaryPerHour)
    {
        this.salaryPerHour = salaryPerHour;
    }
    public float getSalaryPerHour(){ return salaryPerHour; }

    public void setHours(int hours){ this.hours = hours; }
    public int getHours(){ return hours; }
};
/* end of Employee2.java */

/* OUTPUT

FixedSalary   0
FixedSalary   1
FixedSalary   2
FixedSalary   3
FixedSalary   4
HourlySalary  0
HourlySalary  1
HourlySalary  2
HourlySalary  3
HourlySalary  4

*/
