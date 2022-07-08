import java.util.*;
class Matrix_3x4Array
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		
		int a[][]=new int[3][4];
		
		int row , col;
        
           	for(row=0; row<3; row++)
             	{
              		for(col=0; col<4; col++)
                	   a[row][col]=sc.nextInt();
             	}
          	System.out.println("Data are=");
     
        	for(row=0; row<3; row++)
             	{
              	for(col=0; col<4; col++)
                     System.out.println(a[row][col]);
                }

                    System.out.println("Printing In Matrix Form=");   
  
                for(row=0; row<3; row++)
                {
                   for(col=0; col<4; col++)
                        System.out.print(a[row][col]+" ");

                System.out.println();
                }

        }
}
/*
output :
1
2
3
4
5
6
7
8
9
1
2
34
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
1
2
34
Printing In Matrix Form=
1 2 3 4
5 6 7 8
9 1 2 34

*/