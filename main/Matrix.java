/* Matrix.java */
/* Date  : 16 February 2016
 * Author: Ankit Pati
 */

import java.util.Scanner;

class Matrix{
    static void display(int m[][])
    {
        int i, j;

        for(i = 0; i < m.length; ++i){
            for(j = 0; j < m[0].length; ++j)
                System.out.printf("% 5d ", m[i][j]);
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    static void copy(int m1[][], int m2[][])
    {
        int i, j;

        for(i = 0; i < m2.length; ++i)
            for(j = 0; j < m2[0].length; ++j)
                m1[i][j] = m2[i][j];
    }

    static void read(Scanner sc, int m[][])
    {
        int i, j;

        for(i = 0; i < m.length; ++i)
            for(j = 0; j < m[0].length; ++j)
                m[i][j] = sc.nextInt();
        sc.nextLine();
    }

    static int transpose(int m[][])[][]
    {
        int i, j;
        int t[][];

        t = new int[m.length][m[0].length];

        for(i = 0; i < m.length; ++i)
            for(j = 0; j < m[0].length; ++j)
                t[j][i] = m[i][j];

        return t;
    }

    static int add(int m1[][], int m2[][])[][]
    {
        int i, j;
        int t[][];

        t = new int[m1.length][m1[0].length];

        for(i = 0; i < t.length; ++i)
            for(j = 0; j < t[0].length; ++j)
                t[i][j] = m1[i][j] + m2[i][j];

        return t;
    }

    static int subtract(int m1[][], int m2[][])[][]
    {
        int i, j;
        int t[][];

        t = new int[m1.length][m1[0].length];

        for(i = 0; i < t.length; ++i)
            for(j = 0; j < t[0].length; ++j)
                t[i][j] = m1[i][j] - m2[i][j];

        return t;
    }

    static int multiply(int m1[][], int m2[][])[][]
    {
        int i, j, k;
        int t[][];

        t = new int[m1.length][m2[0].length];

        for(i = 0; i < t.length; ++i)
            for(j = 0; j < t[0].length; ++j)
                for(k = 0; k < t[0].length; ++k)
                    t[i][j] += m1[i][k] * m2[k][j];

        return t;
    }

    public static void main(String args[])
    {
        int m1[][], m2[][], t[][];
        int dim;
        Scanner sc;

        sc = new Scanner(System.in);

        System.out.printf("Dimension of square matrix?\n");
        dim = sc.nextInt();
        System.out.printf("\n");

        m1 = new int[dim][dim];
        m2 = new int[dim][dim];
        t  = new int[dim][dim];

        System.out.printf("Enter values of two %dx%d matrices:\n", dim, dim);
        Matrix.read(sc, m1);
        System.out.printf("\n");
        Matrix.read(sc, m2);

        Matrix.copy(t, m1);
        t = Matrix.transpose(t);
        System.out.printf("\nTranspose:\n");
        Matrix.display(t);

        t = Matrix.add(m1, m2);
        System.out.printf("\nAddition:\n");
        Matrix.display(t);

        t = Matrix.subtract(m1, m2);
        System.out.printf("\nSubtraction:\n");
        Matrix.display(t);

        t = Matrix.multiply(m1, m2);
        System.out.printf("\nMultiplication:\n");
        Matrix.display(t);
    }
};
/* end of Matrix.java */

/* OUTPUT

Dimension of square matrix?
4

Enter values of two 4x4 matrices:
1 4 5 6
4 1 2 3
4 1 2 5
6 4 5 3

1 4 6 6
7 5 2 1
5 4 7 8
6 4 3 5

Transpose:
    1     4     4     6
    4     1     1     4
    5     2     2     5
    6     3     5     3


Addition:
    2     8    11    12
   11     6     4     4
    9     5     9    13
   12     8     8     8


Subtraction:
    0     0    -1     0
   -3    -4     0     2
   -1    -3    -5    -3
    0     0     2    -2


Multiplication:
   90    68    67    80
   39    41    49    56
   51    49    55    66
   77    76    88    95

*/
