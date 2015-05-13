/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpraktikum;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class FP6 {
   static int fact(int a)
    {   if(a==0||a==1)
    {   return 1;
    }   else
        {   return a*fact(a-1);
        }
    }
   static void deret(int a)
   {    System.out.print("Deret = ");
        for(int i=0;i<=a;i++)
        {   System.out.print(a-i);
            if(i==a)
            {   System.out.print("");
            }   else
            {   System.out.print("! + ");
            }
        }
        System.out.println();
   }
   static void hasil(int a)
    {   System.out.print("Hasil = ");
        for(int i=0;i<=a;i++)
       {    System.out.print(fact(a-i));
            if(i==a)
            {   System.out.print(" = ");
            }   else
            {   System.out.print(" + ");
            }
       }
    }
    static void total(int a)
    {   int b = 0;
        for(int i=0;i<=a;i++)
        {   b = b + fact(a-i);
        }
        System.out.println(b);
    }
    
        
    public static void main(String[] args)
    {   Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan input : ");
        int a = masuk.nextInt();
        if(a<0)
        {   deret(a);
            hasil(a);
            total(a);
        }   else
    } 
}