class TransposeMatrix_Array
{
	public static void main(String[] args)
	{
		int i,j,sum1=0,sum2=0,sum3=0;
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= new int[3][3];

		System.out.println("\nElements of an array are");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(a[i][j]+" ");

			System.out.println();
		}


		System.out.println("\nElements after transpose : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				b[i][j]=a[j][i];
		}

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(b[i][j]+" ");
			
			System.out.println();
		}			
			
		
	}

 }

/*
Output:

Elements of an array are
1 2 3
4 5 6
7 8 9

Elements after transpose :
1 4 7
2 5 8
3 6 9

*/