import java.util.Scanner;
 
public class Jancard {
   
   
    static int jaccardSimilarity(int[] vektor1, int[] vektor2) {
    int intersection = 0, union = vektor1.length,hasil;
    for (int i=0; i<vektor1.length; i++) 
    {   if (vektor1[i] == 1 && vektor2[i] == 1) 
    {   intersection++;
    }
    }
   
    for (int i=0; i<vektor1.length; i++) 
    {   if (vektor1[i] == 0 && vektor2[i] == 0) 
    {   union--;
    }
    }
    
    hasil = (intersection/union)*100;
    return hasil;
}
   
    public static void main(String[] args) 
    {   Jancard object = new Jancard();
        Scanner masuk = new Scanner(System.in);
        int[] bambang   = {1,0,0,0,1,1};
        int[] cahyono   = {0,1,0,1,1,0};
        int[] dedi      = {1,1,0,0,1,1};
        int[] eko       = {0,0,1,0,0,0};
        int[] nama1 = new int[6];
        int[] nama2 = new int[6];
        String nama11 = null;
        String nama22 = null;
        
        System.out.println("Input nomor sesuai nama :");
        System.out.println("1. Bambang\n2. Cahyono\n3. Dedi\n4. Eko");
        System.out.print("Nama 1 = ");
        int input1 = masuk.nextInt();
        System.out.print("Nama 2 = ");
        int input2 = masuk.nextInt();
       
               
        if (input1 == 1) {
            nama1 = bambang;
            nama11 = "bambang";
        } else if (input1 == 2) {
            nama1 = cahyono;
            nama11 = "cahyono";
        } else if (input1 == 3) {
            nama1 = dedi;
            nama11 = "dedi";
        } else if (input1 == 4) {
            nama1 = eko;
            nama11 = "eko";
        } else {
            System.out.print("Masukkan tidak sesuai kriteria");
        }
       
        if (input2 == 1) {
            nama2 = bambang;
            nama22 = "Bambang";
        } else if (input2 == 2) {
            nama2 = cahyono;
            nama22 = "Cahyono";
        } else if (input2 == 3) {
            nama2 = dedi;
            nama22 = "Dedi";
        } else if (input2 == 4) {
            nama2 = eko;
            nama22 = "Eko";
        } else {
            System.out.print("Masukkan tidak sesuai kriteria");
        }
       
       
        System.out.println("Jaccard Similarity Index dari " + nama11 +  " dan " + nama22 + " adalah = " + Jancard.jaccardSimilarity(nama1,nama2) + " persen");
       
    }
   
}