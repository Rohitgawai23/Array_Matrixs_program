import java.util.*;
class Matrix_4x3Array
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		
		int a[][]=new int[4][3];
		
		int row , col;
        
           	for(row=0; row<4; row++)
             	{
              		for(col=0; col<3; col++)
                	   a[row][col]=sc.nextInt();
             	}
          
          	System.out.println("Data are=");     
        	     for(row=0; row<4; row++)
             	{
              	for(col=0; col<3; col++)
                     System.out.println(a[row][col]);
             }

             System.out.println("Printing In Matrix Form=");   
  
             for(row=0; row<4; row++)
             {
              for(col=0; col<3; col++)
                  System.out.print(a[row][col]+" ");

             System.out.println();
             }

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
7
8
9
Data are=
1
2
3
4
5
6
7
8
9
0
0
0
Printing In Matrix Form=
1 2 3
4 5 6
7 8 9
0 0 0
*/