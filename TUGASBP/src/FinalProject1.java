import java.util.Scanner;
public class FinalProject1 {
        static String nama,panggilan,kelamin,bulan,
                nama1,panggilan1,kelamin1,bulan1;
        static int tanggal,tahun,tanggal1,tahun1;
        
	public static void run(){
        Scanner sc = new Scanner (System.in);
	System.out.println ("PERINGATAN !! PROGRAM INI DIBUAT HANYA UNTUK TUJUAN TUGAS SEMATA");
	System.out.println ("JANGAN PERCAYA DENGAN HASIL YANG TAMPIL KARENA JODOH HANYA BERADA DITANGAN TUHAN!! ");
	System.out.println ("===================================================================================");
	System.out.println ("MASUKKAN IDENTITAS ANDA!!");
	System.out.print("Masukkan Nama lengkap Anda : "  );
	nama = sc.nextLine ();
	System.out.print("Masukkan Nama panggilan Anda : "  );
	panggilan = sc.nextLine ();
	System.out.print("Masukkan Jenis kelamin Anda (L/P) : "  );
	kelamin = sc.nextLine ();
	System.out.print("Masukkan Bulan lahir Anda : "  );
	bulan = sc.nextLine ();
	System.out.print("Masukkan Tanggal lahir Anda : "  );
	tanggal = sc.nextInt ();
	System.out.print("Masukkan Tahun lahir Anda : "  );
	tahun = sc.nextInt ();
	System.out.println();
        run2();
    }
    public static void run2(){
        Scanner sc = new Scanner(System.in);
	System.out.print("MASUKAN IDENTITAS PASANGAN YANG DIINGINKAN!!");
        System.out.println();
	System.out.print("Masukkan Nama lengkap pasangan : ");
        nama1 = sc.nextLine();
	System.out.print("Masukkan Nama panggilan pasangan : "  );
	panggilan1 = sc.nextLine ();
	System.out.print("Masukkan Jenis kelamin pasangan (L/P) : "  );
	kelamin1 = sc.nextLine ();
	System.out.print("Masukkan bulan lahir pasangan : "  );
	bulan1 = sc.nextLine ();
	System.out.print("Masukkan Tanggal lahir pasangan : "  );
	tanggal1 = sc.nextInt ();
	System.out.print("Masukkan Tahun lahir pasangan : "  );
	tahun1 = sc.nextInt ();
	System.out.println ("\n");
        run3();
    }
    public static void run3(){
	System.out.println ("JADI IDENTITAS ANDA ADALAH:");
	System.out.println ("Nama		: " + nama);
	System.out.println ("Nama Panggilan	: " + panggilan);
	System.out.println ("Jenis Kelamin	: " + kelamin);
	System.out.println ("Tanggal Lahir	: " + tanggal + " " + bulan + " " + tahun);
	System.out.println ("\n");
	System.out.println ("DAN IDENTITAS Pasangan ANDA ADALAH:");
	System.out.println ("Nama		: " + nama1);
	System.out.println ("Nama Panggilan	: " + panggilan1);
	System.out.println ("Jenis Kelamin	: " + kelamin1);
	System.out.println ("Tanggal Lahir	: " + tanggal1 + " " + bulan1 + " " + tahun1);
	System.out.println ("\n");
	char a = nama.charAt (1);
	char b = nama1.charAt (1);
	char c = nama.charAt (3);
	char d = nama1.charAt (3);
	char e = panggilan.charAt (1);
	char f = panggilan1.charAt (1);
	int g = panggilan.length ();
	int h = panggilan1.length ();
	char i = bulan.charAt (0);
	char j = bulan1.charAt (0);
        int persen = (int) (Math.random()*21);
		if (a == b){
			persen=persen+20;
		} else
			persen=persen+(int) (Math.random()*21);
		if (c == d){
			persen=persen+20;
		} else
			persen=persen+(int) (Math.random()*21);
		if (e == f ){
			persen=persen+20;
		} else
			persen=persen+(int) (Math.random()*21);
		if (g == h ){
			persen=persen+20;
		} else
			persen=persen+(int) (Math.random()*21);
		if (i == j ){
			persen=persen+20;
		} else
			persen=persen+(int) (Math.random()*21);
		if (kelamin.equals(kelamin1) ){
			persen=persen-300;
		} else
			persen=persen+0;
			if (persen<0){
                              System.out.println ("Astagfirullah Jangan mencintai sesama jenis bro, DOSA!!");
                              System.out.println ("===============================================\n\n\n");
                        }
	 		else if (persen<20){
                              System.out.println ("Hasil kecocokan anda adalah " +persen+
                              "%, itu artinya anda tidak cocok dengan "+
                              nama1+"cari lagi!");
                              System.out.println ("===============================================\n\n\n");
                        }

                        else if (persen<50){
                              System.out.println ("Kecil kemungkinannya brooo, cuma "+persen+
                              "%, lebih baik putusin "+nama1+", dan coba cari yang lain");
                              System.out.println ("==============================================\n\n\n");
                        }

                        else if (persen<70){
                              System.out.println (persen+"% anda cocok dengan "+nama1+
                              "! meski hanya "+persen+"%, tapi masih ada kemungkinan anda jodoh dengan "
                              + nama1);
                              System.out.println ("=================================================\n\n\n");
                        }

                        else if (persen<85){
                              System.out.println (persen+" % anda cocok dengan " + nama1 +
                              "! mantap broo, kemungkinan besar akan langgeng hubungan anda dengan "+ nama1);
                              System.out.println ("================================================\n\n\n");
                        }

                        else if(persen<101){
                              System.out.println (persen+"% anda cocok dengan pasangan anda! "+"cepat ajak merid si "+nama1+"");
                              System.out.println("==============================================\n\n\n");
                        }

                        else
                        	System.out.println ("ngisinya jangan ngaasal ya!!");
				System.out.println("==============================================\n\n\n");
        }
        
        public static void main (String args []){
            run();
	}
}