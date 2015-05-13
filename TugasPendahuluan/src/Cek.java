import java.util.Scanner;
public class Cek {
    static void Dua(double[][] a)
        {   double ordo2 = a[0][0]*a[1][1]-a[0][1]*a[1][0];
            System.out.print(a[0][0]+"x"+a[1][1]+"-"+a[0][1]+"x"+a[1][0]+"=");
            System.out.println(ordo2);
        }
    static void Tiga(double[][] b)
        {   double awal = (b[0][0]*b[1][1]*b[2][2])+(b[0][1]*b[1][2]*b[2][0])+(b[0][2]*b[1][0]*b[2][1]);
            double akhir = (b[2][0]*b[1][1]*b[0][2])+(b[2][1]*b[1][2]*b[0][0])+(b[2][2]*b[1][0]*b[0][1]);
            System.out.printf("(%fx%fx%f+%fx%fx%f+%fx%fx%f)-",b[0][0],b[1][1],b[2][2],b[0][1],b[1][2],b[2][0],b[0][2],b[1][0],b[2][1]);
            System.out.printf("(%fx%fx%f+%fx%fx%f+%fx%fx%f)=",b[2][0],b[1][1],b[0][2],b[2][1],b[1][2],b[0][0],b[2][2],b[1][0],b[0][1]);
            double ordo3 = awal-akhir;
            System.out.println(awal-akhir);
        }
    static void Penjumlahan2(int q, double[][] c, double[][] d)
        {   double[][] hasil = new double[q][q];
            for(int i=0;i<q;i++)
            {   for(int j=0;j<q;j++)
                {   hasil[i][j]=c[i][j]+d[i][j];
                    System.out.print(hasil[i][j]+"  ");
                }   System.out.println();
            }
        }
    static void Pengurangan(int t, double[][] g, double[][] h)
        {   double[][] hasil = new double[t][t];
            for(int i=0;i<t;i++)
            {   for(int j=0;j<t;j++)
                {   hasil[i][j]=g[i][j]-h[i][j];
                    System.out.print(hasil[i][j]+"  ");
                }   System.out.println();
            }
        }
    static void Perkalian2(double[][] e,double[][] f)
        {   double[][] hasilKali = new double[2][2];
            for(int j=0;j<2;j++)
            {   hasilKali[j][0]=e[j][0]*f[0][0]+e[j][1]*f[1][0];
                hasilKali[j][1]=e[j][0]*f[0][1]+e[j][1]*f[1][1];
                System.out.printf("%f  %f\n",hasilKali[j][0],hasilKali[j][1]);
            }
        }
    static void Perkalian3(double[][] e,double[][] f)
        {   double[][] hasilKali = new double[3][3];
            for(int i=0;i<3;i++)
            {   hasilKali[i][0]=e[i][0]*f[0][0]+e[i][1]*f[1][0]+e[i][2]*f[2][0];
                hasilKali[i][1]=e[i][0]*f[0][1]+e[i][1]*f[1][1]+e[i][2]*f[2][1];
                hasilKali[i][2]=e[i][0]*f[0][2]+e[i][1]*f[1][2]+e[i][2]*f[2][2];
                System.out.printf("%f  %f  %f\n",hasilKali[i][0],hasilKali[i][1],hasilKali[i][2]);
            }   
        }
    public static void main(String[] args)
    {   System.out.println("************************************");
        Scanner masuk = new Scanner(System.in);
        System.out.println("Pilihan Pengoperasian : ");
        System.out.println("1. Determinan");
        System.out.println("2. Penjumlahan");
        System.out.println("3. Pengurangan");
        System.out.println("4. Perkalian");
        System.out.print("Masukkan pilihan : ");
        int q = masuk.nextInt();
        if(q==1)
        {   System.out.println("Pilihan Ordo: ");
            System.out.println("1. 2x2\n2. 3x3");
            System.out.println("Masukkan Pilihan");
            int p = masuk.nextInt();
            if(p==1)
            {   double[][] a = new double [2][2];
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
            {   double[][] b = new double [3][3];
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
                double[][] c = new double[r][r];
                double[][] d = new double[r][r];
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
                    {   System.out.printf("%f+%f  ",c[ii][jj],d[ii][jj]);
                    }   System.out.println();
                }
                System.out.println("Hasil penjumlahannya adalah : ");
                Penjumlahan2(r,c,d);
            }
            else if(q==3)
            {   System.out.println("Masukkan Ordo : \n2. 2x2 \n3. 3x3\n");
                int t = masuk.nextInt();
                double[][] g = new double[t][t];
                double[][] h = new double[t][t];
                for(int ii=0;ii<t;ii++)
                {   for(int jj=0;jj<t;jj++)
                    {   System.out.printf("Input Matriks 1, baris %d kolom %d : ",ii+1,jj+1);
                        g[ii][jj] = masuk.nextInt();
                    }
                }
                for(int ii=0;ii<t;ii++)
                {   for(int jj=0;jj<t;jj++)
                    {   System.out.printf("Input Matriks 2, baris %d kolom %d : ",ii+1,jj+1);
                        h[ii][jj] = masuk.nextInt();
                    }   
                }
                for(int ii=0;ii<t;ii++)
                {   for(int jj=0;jj<t;jj++)
                    {   System.out.printf("%f-%f  ",g[ii][jj],h[ii][jj]);
                    }   System.out.println();
                }
                System.out.println("Hasil pengurangannya adalah : ");
                Pengurangan(t,g,h);
            }
        else if(q==4)
        {   System.out.println("Masukkan Pilihan Pengoperasian : \n2. 2x2 \n3. 3x3\n");
            int s = masuk.nextInt();
            double[][] e = new double[s][s];
            double[][] f = new double[s][s];
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
                    {   System.out.printf("%f  ",e[ii][jj]);
                        if(jj==s-1)
                        {   System.out.print("\t");
                            for(int kk=0;kk<s;kk++)
                            {   System.out.printf("%f  ",f[ii][kk]);
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
        

