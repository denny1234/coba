class Constructor
{	private String merk, warna;
	public sepeda (String m, String w)
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
		{	sepeda sepedaku = new sepeda("Pegasus", "Pink" );
			sepedaku.info();
		}
	}