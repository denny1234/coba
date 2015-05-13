import java.util.Scanner;
public class NRP5214100135 {
    String a;
    public NRP5214100135() {
        a = a;
    }
    
    public void kata (String a) {
        System.out.println("Input anda : ");
        for(int z=0;z<a.length();z++) {
        System.out.print(a.charAt(z)+"\t");
        }
        System.out.println();
        for(int z=0;z<a.length();z++) {
        System.out.print(z+"\t");
        }
        System.out.println();
    }
    public void acak1 (String a) {
        System.out.println("Dibalik : ");
        for(int z=1;z<=a.length();z++) {
        System.out.print(a.charAt(a.length()-z)+"\t");
        }
        System.out.println();
        for(int z=a.length()-1;z>=0;z--) {
        System.out.print(z+"\t");
        }
        System.out.println();
    }
    public void acak2(String a) {
        System.out.println("Dibagi 2 bagian : ");
        if (a.length()%2==0) {
        System.out.print(a.substring(0,a.length()/2)+"\t\t");
        System.out.print(a.substring((a.length())/2,a.length()));
        System.out.println("Dibalik : ");
        for(int x=a.length()/2+1;x<=a.length();x++) {
            System.out.print(a.charAt(a.length()-x));
        }
        System.out.print("\t\t");
        for(int x=a.length()/2;x>=1;x--) {
            System.out.print(a.charAt(x));
        }
        }
        else {
        System.out.print(a.substring(0,(a.length()+1)/2)+"\t\t");
        System.out.println(a.substring((a.length()+1)/2,a.length()));
        System.out.println("Dibalik : ");
        for(int x=a.length()/2+1;x<=a.length();x++) {
            System.out.print(a.charAt(a.length()-x));
        }
        System.out.print("\t\t");
        for(int x=1;x<=a.length()/2;x++) {
            System.out.print(a.charAt(a.length()-x));
        }
        }
    }
    public static void main (String[] args) {
        NRP5214100135 aku = new NRP5214100135();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan input anda : "); 
        aku.a = masuk.nextLine();
        aku.kata(aku.a);
        aku.acak1(aku.a);
        aku.acak2(aku.a);
        System.out.println();
    }
    
}
