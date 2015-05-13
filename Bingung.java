import java.util.Scanner;
import java.util.Date;
class Bingung 
{   String nama, nip, tgllhr, blnlhr, thnlhr, blnang, thnang, a, kelamin, kel;
	int umur, tahun;
	
    public Bingung () 
	{	nama = nama;
		nip = nip;
    }
	
	public void namaA (String nama) 
	{	System.out.println("Nama \t\t\t: "+nama);
	}
	
    public void substringA (String nip) 
	{	tgllhr = nip.substring(6,8);
		blnlhr = nip.substring(4,6);
		thnlhr = nip.substring(0,4);
		Date date = new Date();
		umur = date.getYear()-Integer.parseInt(thnlhr)+1900;
        System.out.println("Tanggal lahir \t\t: "+tgllhr+"-"+blnlhr+"-"+thnlhr);
		System.out.println("Umur \t\t\t: "+umur+" tahun");
    }
	
	public void substringB (String nip) 
	{	blnang = nip.substring(12,14);
		int b = Integer.parseInt(blnang);
		switch (b)
		{	case 1 : a = "Januari"; break;
			case 2 : a = "Februari"; break;
			case 3 : a = "Maret"; break;
			case 4 : a = "April"; break;
			case 5 : a = "Mei"; break;
			case 6 : a = "Juni"; break;
			case 7 : a = "Juli"; break;
			case 8 : a = "Agustus"; break;
			case 9 : a = "September"; break;
			case 10 : a = "Oktober"; break;
			case 11 : a = "November"; break;
			case 12 : a = "Desember"; break;
		}
		thnang = nip.substring(8,12);
		System.out.println("Tanggal diangkat \t: "+a+" "+thnang);
	}
	
	public void gender (String nip) 
	{	kelamin = nip.substring(14,15);
		if(Integer.parseInt(kelamin)==1)
		{	kel = "Laki-laki";
		}	else 
			{	kel = "Perempuan";
			}
		System.out.println("Jenis kelamin \t\t: "+kel);
	}
	
	public static void main(String[]args) 
	{	Bingung aku = new Bingung();
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan nama anda : "); aku.nama = in.next();
		System.out.print("Masukkan NIP anda : "); aku.nip = in.next();
		if (aku.nip.matches("[0-9]*")) {
			if (aku.nip.length()==18)
			{	System.out.println();
				System.out.println("-------------------DATA PEGAWAI-----------------");
				aku.namaA(aku.nama);
				aku.substringA(aku.nip);
				aku.substringB(aku.nip);
				aku.gender(aku.nip);
			}	else
			{	System.out.println("Maaf, Anda harus memasukkan 18 digit NIP");
			}
		} else
		{	System.out.println("Maaf, Anda harus memasukkan NIP  berformat angka "); }
    }
}