class matrix_init
{
	public static void main(String []args)
	{
		int [][] a={
				{2,3,4},
				{4,5,6},
				{5,9,8}

			     };

		
		int i,j;

		System.out.print("first row :");
		for(i=0; i<1; i++)
		{
			for(j=0; j<3; j++)
			   System.out.print(a[0][j]+" ");
			
			System.out.println();
		}

		System.out.print("second row :");
		for(i=1; i<2; i++)
		{
			for(j=0; j<3; j++)
			   System.out.print(a[1][j]+" ");
			
			System.out.println();
		}

		System.out.print("Third row :");
		for(i=2; i<3; i++)
		{
			for(j=0; j<3; j++)
			   System.out.print(a[2][j]+" ");
			
			System.out.println();
		}
		
	}
}
/*
Output :

first row :2 3 4
second row :4 5 6
Third row :5 9 8

*/