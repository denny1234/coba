class Kebelet
{	public static void main(String[] args)
	{	int x;
		int y;
		int z = 5;
		int jumlah;
		for(x = 1;x <= 3;x++)
		{	for(y = 1;y <= 3-x;y++)
			{	System.out.print(" ");
			}
			for(y = 1;y <= 2*x+4;y++)
			{	System.out.print("*");
			}
			for(y = 1;y <= (2*z)-3-(2*x);y++)
			{	System.out.print(" ");
			}
			for(y = 1;y <= (2*x)+4;y++)
			{	System.out.print("*");
			}
			System.out.println();
		}
		for(x = 1;x <= 21;x++)
		{	System.out.print("*");
		}
		System.out.println();
		for(x = 1;x <= 11;x++)
		{	for(y = 1;y <= x-1;y++)
			{	System.out.print(" ");
			}
			for(y = 1;y <= 23-(2*x);y++)
			{	System.out.print("*");
			}
		
			System.out.println();
		}
	}
}
	
