import java.util.Scanner;
class Bingung {
    String nama;
    int lamainap;
    double harga;
    String namapemesan;
        //constructor pesankamar
    Bingung () {
        nama = nama;
        
    }
    void substringA () {
        System.out.println(nama);
    }
    }
public static void main(String[]args) {
        Bingung pesan = new Bingung();
        Scanner in = new Scanner(System.in);
        System.out.print("Daftarkan nama anda : "); pesan.nama = in.next();
        System.out.print("Berapa hari anda akan menginap? "); pesan.lamainap = in.nextInt();
        System.out.print("Berapa kamar yang akan anda pesan? "); pesan.jumlahkamar = in.nextInt();
        pesan.totalbayar(pesan.lamainap, pesan.jumlahkamar);
		pesan.substringA();
    }
	}