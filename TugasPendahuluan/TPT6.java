import java.util.Scanner;
public class TPT6 {
    static void Dua(int[][] a)
        {   int ordo2 = a[0][0]*a[1][1]-a[0][1]*a[1][0];
            System.out.print(a[0][0]+" x "+a[1][1]+" - "+a[0][1]+" x "+a[1][0]+" = ");
            System.out.println(ordo2);
        }
    static void Tiga(int[][] b)
        {   int awal = (b[0][0]*b[1][1]*b[2][2])+(b[0][1]*b[1][2]*b[2][0])+(b[0][2]*b[1][0]*b[2][1]);
            int akhir = (b[2][0]*b[1][1]*b[0][2])+(b[2][1]*b[1][2]*b[0][0])+(b[2][2]*b[1][0]*b[0][1]);
            System.out.printf("%dx%dx%d+%dx%dx%d+%dx%dx%d-",b[0][0],b[1][1],b[2][2],b[0][1],b[1][2],b[2][0],b[0][2],b[1][0],b[2][1]);
            System.out.printf("%dx%dx%d+%dx%dx%d+%dx%dx%d",b[2][0],b[1][1],b[0][2],b[2][1],b[1][2],b[0][0],b[2][2],b[1][0],b[0][1]);
            int ordo3 = awal-akhir;
            System.out.println(ordo3);
        }
    static void Penjumlahan2(int q, int[][] c, int[][] d)
        {   int[][] hasil = new int[q][q];
            for(int i=0;i<q;i++)
            {   for(int j=0;j<q;j++)
                {   hasil[i][j]=c[i][j]+d[i][j];
                    System.out.print(hasil[i][j]+"  ");
                }   System.out.println();
            }
        }
    static void Perkalian2(int[][] e,int[][] f)
        {   int[][] hasilKali = new int[2][2];
            for(int j=0;j<2;j++)
            {   hasilKali[j][0]=e[j][0]*f[0][0]+e[j][1]*f[1][0];
                hasilKali[j][1]=e[j][0]*f[0][1]+e[j][1]*f[1][1];
                System.out.printf("%d  %d",hasilKali[j][0],hasilKali[j][1]);
            }   System.out.println();
        }
    static void Perkalian3(int[][] e,int[][] f)
        {   int[][] hasilKali = new int[3][3];
            for(int i=0;i<3;i++)
            {   hasilKali[i][0]=e[i][0]*f[0][0]+e[i][1]*f[1][0]+e[i][2]*f[2][0];
                hasilKali[i][1]=e[i][0]*f[0][1]+e[i][1]*f[1][1]+e[i][2]*f[2][1];
                hasilKali[i][2]=e[i][0]*f[0][2]+e[i][1]*f[1][2]+e[i][2]*f[2][2];
                System.out.printf("%d  %d  %d",hasilKali[i][0],hasilKali[i][1],hasilKali[i][2]);
            }   System.out.println();
        }
    public static void main(String[] args)
    {   System.out.println("************************************");
        Scanner masuk = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Pengoperasian : \n1. Determinan\n2. Penjumlahan\n3. Perkalian");
        int q = masuk.nextInt();
        if(q==1)
        {   System.out.println("Pilihlah Matriks Ordo di bawah ini: \n1. 2x2\n2. 3x3\nTulis angka untuk memproses : ");
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
                        }   System.out.println();
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
                    }   System.out.println();
                }
                System.out.println("Hasil Determinan adalah : ");
                Tiga(b);
                System.out.println("************************************");
            }   else
            {   System.out.println("Maaf Inputan Anda Salah ");
                System.out.println("************************************");
                }
        }   else if(q==2)
            {   System.out.println("Masukkan Ordo : \n2. 2x2 \n3. 3x3\n");
                int r = masuk.nextInt();
                int[][] c = new int[r][r];
                int[][] d = new int[r][r];
                for(int ii=0;ii<r;ii++)
                {   for(int jj=0;jj<r;jj++)
                    {   System.out.printf("Input Matriks 1, baris %d kolom %d : ",ii+1,jj+1);
                        c[ii][jj] = masuk.nextInt();
                    }
                }
                for(int ii=0;ii<r;ii++)
                {   for(int jj=0;jj<r;jj++)
                    {   System.out.printf("Input Matriks 2, baris %d kolom %d : ",ii+1,jj+1);
                        d[ii][jj] = masuk.nextInt();
                    }   
                }
                for(int ii=0;ii<r;ii++)
                {   for(int jj=0;jj<r;jj++)
                    {   System.out.printf("%d  ",c[ii][jj]);
                        if(jj==r-1)
                        {   System.out.print("\t");
                            for(int kk=0;kk<r;kk++)
                            {   System.out.printf("%d  ",d[ii][kk]);
                            }
                        }
                    }   System.out.println();
                }
                System.out.println("Hasil penjumlahannya adalah : ");
                Penjumlahan2(r,c,d);
            }
        else if(q==3)
        {   System.out.println("Masukkan Pilihan Pengoperasian : \n2. 2x2 \n3. 3x3\n");
            int s = masuk.nextInt();
            int[][] e = new int[s][s];
            int[][] f = new int[s][s];
                for(int ii=0;ii<s;ii++)
                {   for(int jj=0;jj<s;jj++)
                    {   System.out.printf("Input Matriks 1, baris %d kolom %d : ",ii+1,jj+1);
                        e[ii][jj] = masuk.nextInt();
                    }
                }
                for(int ii=0;ii<s;ii++)
                {   for(int jj=0;jj<s;jj++)
                    {   System.out.printf("Input Matriks 2, baris %d kolom %d : ",ii+1,jj+1);
                        f[ii][jj] = masuk.nextInt();
                    }   
                }
                for(int ii=0;ii<s;ii++)
                {   for(int jj=0;jj<s;jj++)
                    {   System.out.printf("%d  ",e[ii][jj]);
                        if(jj==s-1)
                        {   System.out.print("\t");
                            for(int kk=0;kk<s;kk++)
                            {   System.out.printf("%d  ",f[ii][kk]);
                            }
                        }
                    }   System.out.println();
                }
                System.out.println("Hasil perkaliannya adalah : ");
                if(s==2)
                {   Perkalian2(e,f);
                }   else if(s==3)
                {   Perkalian3(e,f);
                }   else
                {   System.out.println("Maaf Inputan Anda Salah ");
                    System.out.println("************************************");
                    }
        }   else
            {   System.out.println("Maaf Inputan Anda Salah ");
                System.out.println("************************************");
                }
    }
}
        

