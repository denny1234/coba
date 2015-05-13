class Sepeda
{	String merk, warna;
	public Sepeda(String m, String w)
	{	this.merk = m;
		this.warna = w;	
	}
	public void info()
	{ 	System.out.println("Merk sepeda saya adalah  : "+this.merk);
		System.out.println("Warna sepeda saya adalah  : "+this.warna);
	}
}
	public class constructor
	{	public static void main(String[] args)
		{	sepeda sepedaku = new mobil("Pegasus", "Pink" );
			sepedaku.info();
		}
	}