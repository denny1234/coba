import java.util.Scanner;
public class Rekursi1 {
    static int fact(int a)
    {   if (a==1)
        {   return 1;
        }   else 
            {   return a*fact(a-1);
            }
    }
    static int fibo(int a)
    {   if (a==1||a==2)
        {   return 1;
        }   else
            {   return fibo(a-2)+fibo(a-1);
            }
    }
    public static void main (String[] args)
    {   Scanner masuk = new Scanner(System.in);
        System.out.println("1.Fibonaccci\n2.Factorial");
        System.out.print("Masukkan Pilihan : ");
        int z = masuk.nextInt();
        if (z==1)
        {   System.out.print("Masukkan angka : ");
            int a = masuk.nextInt();
            int hasil = fibo(a);
            for(int i=1;i<=a;i++)
            {   System.out.print(fibo(i)+" ");
            }
            System.out.println();
            System.out.print(hasil);
        }   else if(z==2)
            {   System.out.print("Masukkan angka : ");
                int b = masuk.nextInt();
                int hasil = fact(b);
                for(int i=1;i<=b;i++)
                {   System.out.print(fact(i)+" ");
                }
                System.out.println();
                System.out.print(hasil);
            }   else
                {   System.out.println("Maaf pilihan hanya ada dua");
                }
    }
}
