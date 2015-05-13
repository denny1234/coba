/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class BinarySearch {
    public static void main(String[] args)
    {   int[] himpunan = {1,2,3,4,5};
        int a = 0;
        int b = himpunan.length;
        int mid = (b-a)/2;
        int diCari = 4;
        while(a<=b)
        {   if(himpunan[mid]<diCari)
            {   a = mid+1;
            }   else if(himpunan[mid]==diCari)
                {   System.out.print("Ada di : "+(mid+1));
                    break;
                }
            else
            {   b = mid-1;
            }
        
        }
        if(a==b)
        {   System.out.print("Tidak ada ");
        }
    }
}
