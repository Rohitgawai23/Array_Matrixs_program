class EqualityOfMatrix
{
	public static void main(String []args)
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2,3},{6,5,4},{7,8,9}};

		int c=1;
		int row1=a.length;
		int row2=b.length;

		int col1=a[0].length;
		int col2=b[0].length;

		System.out.println("Matrix First");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
			   System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}


		System.out.println("Matrix second");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
			   System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}



		if(row1!=row2 ||col1!=col2)
			System.out.print("Not equal");
		else
		{
			for(int i=0; i<3; i++)
			{
				for(int j=0; j< 3; j++)
				{	
					if(a[i][j]!=b[i][j])
					{
					  c=0;
					  break;
					}
				}
			}
			System.out.println();


			if(c==1)
			   System.out.println("Matrix is equal");
			else
			   System.out.println("Matrix not equal");

		}
	}
}
/*
Output :

Matrix First
1 2 3
4 5 6
7 8 9
Matrix second
1 2 3
6 5 4
7 8 9

Matrix not equal
*/