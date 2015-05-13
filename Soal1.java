zizport java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Soal1 
{	String Nama;
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	int a;
	
    public Soal1(String Nama, int a)
	{	this.Nama = Nama;
		this.a = a;
	}
	public void keterangan(){
		System.out.println("------------------STRING------------------");
        System.out.println("Nama Anda : "+this.Nama);
		System.out.println("Panjang kalimat : "+this.Nama.length());
		System.out.println("Huruf Besar : "+this.Nama.toUpperCase());
		System.out.println("Huruf kecil : "+this.Nama.toLowerCase());
		System.out.println("a diganti o "+this.Nama.replace("a","o"));
		System.out.println("Karakter ke empat sampai selesai "+this.Nama.substring(4));
		System.out.println("Karakter ke empat sampai 10 "+this.Nama.substring(4,10));
		System.out.println("Ditambah kata "+this.Nama.concat(" Yoroshiku onegaishimasu"));
		System.out.println("Apakah diawali huruf d? "+this.Nama.startsWith("d"));
		System.out.println("------------------DATE------------------");
		System.out.println("Hari ini " +dateFormat.format(date));
		System.out.println("Hari ke "+date.getDay());
		System.out.println("Tanggal "+date.getDate());
		System.out.println("Bulan " +(date.getMonth()+1));
		System.out.println("Tahun "+(date.getYear()+1900));
		System.out.println("Jam "+date.getHours());
		System.out.println("Menit "+date.getMinutes());
		System.out.println("Detik "+date.getSeconds());
		System.out.println("------------------INTEGER------------------");
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toString(a));
		System.out.println(Double.valueOf(a));
		System.out.println(Integer.rotateLeft(a,3));
		System.out.println(Integer.bitCount(a));
 }
}


