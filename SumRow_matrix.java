class SumRow_matrix
{
	public static void main(String[] args)
	{
		int i,j,sum;
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};

		System.out.println("\nElements of an array are");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(a[i][j]+" ");

			System.out.println();			
		}


		//System.out.println("=========================");
		System.out.print("\nFirst row : ");
		for(i=0;i<1;i++)
		{
			sum=0;
			for(j=0;j<3;j++)
			{
				sum= sum+a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.print("= "+sum+" ");

			System.out.println();			
		}

		System.out.print("\nSecond row : ");
		for(i=1;i<2;i++)
		{
			sum=0;
			for(j=0;j<3;j++)
			{
				sum= sum+a[1][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.print("= "+sum+" ");
		
			System.out.println();			
		}

		System.out.print("\nThird row : ");
		for(i=2;i<3;i++)
		{
			sum=0; 
			for(j=0;j<3;j++)
			{
				sum= sum+a[2][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.print("= "+sum+" ");

			System.out.println();			
		}
	}
}
/*
Output :

Elements of an array are
1 2 3
4 5 6
7 8 9

First row : 1 2 3 = 6

Second row : 4 5 6 = 15

Third row : 7 8 9 = 24
*/