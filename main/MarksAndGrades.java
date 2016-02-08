/* MarksAndGrades.java */
/* Date  : 20 January 2016
 * Author: Ankit Pati
 */

import java.io.*;

class MarksAndGrades {
    public static void main(String args[]) throws IOException
    {
        int marks;
        float gradePoint;
        String grade;

        System.out.printf("Enter marks:\n");

        marks = 0;
        try{
            marks = Integer.parseInt(
                new BufferedReader(
                    new InputStreamReader(System.in)).readLine());
        } catch(NumberFormatException nfe){
            System.err.printf("Entered string is not a number.\n");
            System.exit(1);
        }

             if(marks >= 85) { gradePoint = 10.0f; grade = "A++"; }
        else if(marks >= 80) { gradePoint =  9.0f; grade = "A+ "; }
        else if(marks >= 75) { gradePoint =  8.0f; grade = "A  "; }
        else if(marks >= 70) { gradePoint =  7.0f; grade = "B++"; }
        else if(marks >= 65) { gradePoint =  6.0f; grade = "B+ "; }
        else if(marks >= 60) { gradePoint =  5.5f; grade = "B  "; }
        else if(marks >= 55) { gradePoint =  5.0f; grade = "C+ "; }
        else if(marks >= 50) { gradePoint =  4.5f; grade = "C  "; }
        else if(marks >= 40) { gradePoint =  4.0f; grade = "D  "; }
        else                 { gradePoint =  0.0f; grade = "F  "; }

        System.out.println("Grade Point: " + gradePoint);
        System.out.println("Grade      : " + grade     );
    }
};
/* end of MarksAndGrades.java */
