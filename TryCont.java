import java.util.Scanner;
class TryCont
{	public static void main(String[] args)
	{	int p, t;
		String left = "[-";
		String right = "-]";
		Scanner masuk = new Scanner(System.in);
		System.out.print("Masukkan panjang bata : ");
		p = masuk.nextInt();
		System.out.print("Masukkan tinggi bata : ");
		t = masuk.nextInt();
		for (int baris = 1; baris <= t; baris++)
		{	for (int kolom = 1; kolom <= p; kolom++)
			{	if (baris%2==0) 
				{	System.out.print(right);
					if (kolom==p)
					{	System.out.println(left);
					}	else
						{	System.out.print(left);
						}
				}	
				
				else
					{	System.out.print(left);
						if (kolom==p)
						{	System.out.println(right);
						}	else
							{	System.out.print(right);
							}
				}				
			}
		}	
	}
}
