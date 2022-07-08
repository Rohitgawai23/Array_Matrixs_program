import java.util.*;
class Matrix_3x2Array
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		
		int a[][]=new int[3][2];
		
		int row , col;
        
           	for(row=0; row<3; row++)
             	{
              		for(col=0; col<2; col++)
                	   a[row][col]=sc.nextInt();
             	}
          	System.out.println("Data are=");
     
        	for(row=0; row<3; row++)
             	{
              	for(col=0; col<2; col++)
                     System.out.println(a[row][col]);
                }

                    System.out.println("Printing In Matrix Form=");   
  
                for(row=0; row<3; row++)
                {
                   for(col=0; col<2; col++)
                        System.out.print(a[row][col]+" ");

                System.out.println();
                }

        }

/*
Output :
1
2
3
4
5
6
Data are=
1
2
3
4
5
6
Printing In Matrix Form=
1 2
3 4

*/


5 6}