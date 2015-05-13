class CekSatu
{	public static void main(String[] args)
	{	String a = "[==]";
		
		for (int baris = 1; baris <= 10; baris++)
		{	for (int kolom = 1; kolom <= 5; kolom++)
			{	System.out.print(a);
				if (kolom==5)
				{	System.out.println(a);
				}
					else 
					{	System.out.print(a);
					}
			}
		}	
	}
}