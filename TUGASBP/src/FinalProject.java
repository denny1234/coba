import java.util.Scanner;

public class FinalProject{
	public static void main (String args []){
	Scanner sc = new Scanner (System.in);
	System.out.println ("PERINGATAN !! PROGRAM INI DIBUAT HANYA UNTUK TUJUAN TUGAS SEMATA");
	System.out.println ("JANGAN PERCAYA DENGAN HASIL YANG TAMPIL KARENA JODOH HANYA BERADA DITANGAN TUHAN!! ");
	System.out.println ("===================================================================================");
	System.out.println ("MASUKKAN IDENTITAS ANDA!!");
	System.out.println ("Masukkan Nama lengkap Anda"  );
	String nama = sc.nextLine ();
	System.out.println ("Masukkan Nama panggilan anda"  );
	String panggilan = sc.nextLine ();
	System.out.println ("Masukkan Jenis kelamin Anda, (Laki-Laki/Perempuan)"  );
	String kelamin = sc.nextLine ();
	System.out.println ("Masukkan bulan lahir anda"  );
	String bulan = sc.nextLine ();
	System.out.println ("Masukkan Tanggal lahir anda"  );
	int tanggal = sc.nextInt ();
	System.out.println ("Masukkan Tahun lahir anda"  );
	int tahun = sc.nextInt ();
	System.out.println ("\n");
	System.out.println ("MASUKAN IDENTITAS PASANGAN YANG DIINGINKAN!!");
	String identitas = sc.nextLine ();
	System.out.println ("Masukkan Nama lengkap pasangan"  );
	String nama1 = sc.nextLine ();
	System.out.println ("Masukkan Nama panggilan pasangan"  );
	String panggilan1 = sc.nextLine ();
	System.out.println ("Masukkan Jenis kelamin pasangan, (Laki-Laki/Perempuan)"  );
	String kelamin1 = sc.nextLine ();
	System.out.println ("Masukkan bulan lahir pasangan anda"  );
	String bulan1 = sc.nextLine ();
	System.out.println ("Masukkan Tanggal lahir pasangan anda"  );
	int tanggal1 = sc.nextInt ();
	System.out.println ("Masukkan Tahun lahir pasangan anda"  );
	int tahun1 = sc.nextInt ();
	System.out.println ("\n");
	System.out.println ("JADI IDENTITAS ANDA ADALAH:");
	System.out.println ("Nama		: " + nama.toUpperCase());
	System.out.println ("Nama Panggilan	: " + panggilan.toUpperCase());
	System.out.println ("Jenis Kelamin	: " + kelamin.toUpperCase());
	System.out.println ("Tanggal Lahir	: " + tanggal + " " + bulan.toUpperCase() + " " + tahun);
	System.out.println ("\n");
	System.out.println ("DAN IDENTITAS Pasangan ANDA ADALAH:");
	System.out.println ("Nama		: " + nama1.toUpperCase());
	System.out.println ("Nama Panggilan	: " + panggilan1.toUpperCase());
	System.out.println ("Jenis Kelamin	: " + kelamin1.toUpperCase());
	System.out.println ("Tanggal Lahir	: " + tanggal1 + " " + bulan1.toUpperCase() + " " + tahun1);
	System.out.println ("\n");
	char a = nama.toUpperCase().charAt (3);
	char b = nama1.toUpperCase().charAt (3);
	char c = nama.toUpperCase().charAt (7);
	char d = nama1.toUpperCase().charAt (7);
	char e = panggilan.toUpperCase().charAt (1);
	char f = panggilan1.toUpperCase().charAt (1);
	int g = panggilan.toUpperCase().length ();
	int h = panggilan1.toUpperCase().length ();
	char i = bulan.toUpperCase().charAt (0);
	char j = bulan1.toUpperCase().charAt (0);
	char k = kelamin.toUpperCase().charAt (0);
	char l = kelamin1.toUpperCase().charAt (0);
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
		if (k == l ){
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
}
	