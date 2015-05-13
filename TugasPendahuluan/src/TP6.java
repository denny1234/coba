import java.util.Scanner;
public class TP6 {
    static void Dua(int[][] a)
        {   int ordo2 = a[0][0]*a[1][1]-a[0][1]*a[1][0];
            System.out.print(a[0][0]+" x "+a[1][1]+" - "+a[0][1]+" x "+a[1][0]+" = ");
            System.out.println(ordo2);
        }
    static void Tiga(int[][] b)
        {   int awal = (b[0][0]*b[1][1]*b[2][2])+(b[0][1]*b[1][2]*b[2][0])+(b[0][2]*b[1][0]*b[2][1]);
            int akhir = (b[2][0]*b[1][1]*b[0][2])+(b[2][1]*b[1][2]*b[0][0])+(b[2][2]*b[1][0]*b[0][1]);
            System.out.print("("+(b[0][0]+" x "+b[1][1]+" x "+b[2][2])+" + "+(b[0][1]+" x "+b[1][2]+" x "+b[2][0])+" + "+(b[0][2]+" x "+b[1][0]+" x "+b[2][1])+")"+" - ");
            System.out.print("("+b[2][0]+" x "+b[1][1]+" x "+b[0][2]+" + "+b[2][1]+" x "+b[1][2]+" x "+b[0][0]+" + "+b[2][2]+" x "+b[1][0]+" x "+b[0][1]+")"+" = ");
            int ordo3 = awal-akhir;
            System.out.println(ordo3);
        }
    static void Penjumlahan2()
        {   int[][] c = {{1,1},{2,2}};
            int[][] d = {{2,2},{3,3}};
            int[][] hasil = new int[2][2];
            for(int i=0;i<2;i++)
            {   for(int j=0;j<2;j++)
                {   hasil[i][j]=c[i][j]+d[i][j];
                    System.out.print(hasil[i][j]+"  ");
                }
                System.out.println();
            }
        }
        
    public static void main(String[] args)
    {   System.out.println("************************************");
        System.out.println("Pilihlah Matriks Ordo di bawah ini: \n1. 2x2\n2. 3x3\nTulis angka untuk memproses : ");
        Scanner masuk = new Scanner(System.in);
        int p = masuk.nextInt();
        if(p==1)
        {   int[][] a = new int [2][2];
            for(int z=0;z<2;z++)
            {   for(int y=0;y<2;y++)
                {   System.out.printf("Input baris %d kolom %d : ",z+1,y+1);
                    a[z][y]= masuk.nextInt();
                }
            }
                for(int i=0;i<2;i++)
                {   for(int j=0;j<2;j++)
                    {   System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                }
            System.out.println("Hasil Determinan adalah : ");
            Dua(a);
            System.out.println("************************************");
        } else if(p==2)
        {   int[][] b = new int [3][3];
            for(int zz=0;zz<3;zz++)
            {   for(int yy=0;yy<3;yy++)
                {   System.out.printf("Input baris %d kolom %d : ",zz+1,yy+1);
                    b[zz][yy] = masuk.nextInt();
                }
            }
            for(int ii=0;ii<3;ii++)
            {   for(int jj=0;jj<3;jj++)
                {   System.out.print(b[ii][jj]+" ");
                }
                System.out.println();
            }
            System.out.println("Hasil Determinan adalah : ");
            Tiga(b);
            System.out.println("************************************");
        }   else
        {   System.out.println("Maaf Inputan Anda Salah ");
            System.out.println("************************************");
        }
        Penjumlahan2();
    }
}
