import java.util.*;
class Matrix_3x3ArrayAdd
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i , j;

        	System.out.println("Enter the matrix 1 element=");     
           	for(i=0; i<3; i++)
             	{
              		for(j=0; j<3; j++)
                	   a[i][j]=sc.nextInt();
             	}

          	System.out.println("Enter the matrix 2 element=");
		for(i=0; i<3; i++)
             	{
              		for(j=0; j<3; j++)
                	   b[i][j]=sc.nextInt();
             	}

        	for(i=0; i<3; i++)
             	{
              		for(j=0; j<3; j++)
                	   c[i][j]=a[i][j]+b[i][j];
                }

		System.out.println("Printing Matrix 1 =");     
                for(i=0; i<3; i++)
                {
                   for(j=0; j<3; j++)
                       System.out.print(a[i][j]+" ");

                System.out.println();
                }

		System.out.println("Printing  Matrix 2 =");     
                for(i=0; i<3; i++)
                {
                   for(j=0; j<3; j++)
                       System.out.print(b[i][j]+" ");

                System.out.println();
                }

                System.out.println("Printing In Matrix Form=");     
                for(i=0; i<3; i++)
                {
                   for(j=0; j<3; j++)
                       System.out.print(c[i][j]+" ");

                System.out.println();
             }

        }


  }
/*
Output :
Enter the matrix 1 element=
1
2
3
4
5
6
7
8
9
Enter the matrix 2 element=
9
8
7
6
5
4
3
2
1
Printing Matrix 1 =
1 2 3
4 5 6
7 8 9
Printing  Matrix 2 =
9 8 7
6 5 4
3 2 1
Printing In Matrix Form=
10 10 10
10 10 10
10 10 10
 */  