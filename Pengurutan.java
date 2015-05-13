import java.util.Scanner;
public class pengurutan {

    int[] angka=new int[6];
    public pengurutan()
    {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            System.out.print("Masukkan Angka ke "+(i+1)+" : ");
            angka[i] = input.nextInt();
        }

        tampilkanAngka();
        urutkanAngka();
        tampilkanAngka();

       
    }

    void tampilkanAngka()
    {
        System.out.println("\n--------------------------------");
        for (int i=0;i<6;i++)
        {
            System.out.print(angka[i]+" ");
        }
    }

    void urutkanAngka()
    {
        int tampung;
        for (int i=0;i<angka.length;i++)
        {
            for(int j=0;j<angka.length-(i+1);j++)
            {
                if(angka[j]>angka[j+1])
                {
                    tampung=angka[j];
                    angka[j]=angka[j+1];
                    angka[j+1]=tampung;
                }

            }
           
        }

    }

    public static void main(String[] aksi)
    {
        pengurutan urut = new pengurutan();
    }
}
