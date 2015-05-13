class A
{	public static void main(String [] args)
	{	for(int x = 1;x <=5;x++)
		{	for(int y = 1;y <= 5-x;y++)
			{	System.out.print(" ");
			}
			for(int y = 1;y <= x;y++)
			{	System.out.print("*");
			}
			System.out.println();
		}
	}
}