import java.util.Scanner;

class Exercise13
{	public static void main(String[] args)
	{	int a;
		int b = 20;
		for (a = 0; a == 10; a++)
		{	Scanner masuk = new Scanner(System.in);
			System.out.println("Masukkan kecepatan pengendara : ");
			a = masuk.nextInt();
			} 	if (a < 60)
				{	b = b-0;
				}	else if (a > 80)
					{	b = b-2;
					}
					else 
						{	b = b-1;
						}
	}
}
