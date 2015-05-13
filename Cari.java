import java.util.Scanner;

class Cari
{	static double x(String nrp)
	{	String fak;
		fak = nrp.substring(0,1);
		int ff = Integer.parseInt(fak);
		return ff;
	}
	static double y(String nrp)
	{	String jur;
		jur = nrp.substring(0,2);
		int jj = Integer.parseInt(jur);
		return jj;
	}
	static double z(String nrp)
	{	String ang;
		ang = nrp.substring(2,4);
		int aa = Integer.parseInt(ang);
		return aa;
	}

	public static void main (String[] args)
	{	String fak,jur,ang,nrp;
		Scanner masuk = new Scanner(System.in);
		System.out.println("================================");
		System.out.print("Masukkan NRP: ");
		nrp = masuk.nextLine();
		System.out.println("================================");
		double fff = x(nrp);
		double jjj = y(nrp);
		double aaa = z(nrp);
		
		String fakultas = String.valueOf(fff);
		String jurusan = String.valueOf(jjj);
		String angkatan = String.valueOf(aaa);
		
		fak = fakultas.replace("1.0","FMIPA");
		fak = fakultas.replace("2.0","FTSP");
		fak = fakultas.replace("3.0","FTI");
		fak = fakultas.replace("4.0","FTK");
		fak = fakultas.replace("5.0","FTIf");
		
		jur = jurusan.replace("11.0","Fisika");
		jur = jurusan.replace("12.0","Statistika");
		jur = jurusan.replace("13.0","T.Informatika");
		jur = jurusan.replace("14.0","T.Informatika");
		jur = jurusan.replace("15.0","T.Informatika");
		jur = jurusan.replace("16.0","T.Informatika");
		jur = jurusan.replace("21.0","T.Informatika");
		jur = jurusan.replace("22.0","T.Informatika");
		jur = jurusan.replace("23.0","T.Informatika");
		jur = jurusan.replace("51.0","T.Informatika");
		jur = jurusan.replace("52.0","Sistem Informasi");
		
		ang = angkatan.replace("14.0","Angkatan 2014");
		System.out.println("=================================");
		System.out.println("Fakultas Anda : "+fak);
		System.out.println("jurusanurusan Anda : "+jur);
		System.out.println("Angkatan Anda : "+ang);
	}
}