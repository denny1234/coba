import java.util.Scanner;
public class Const 
{	String nama, Name;
	Name = "DENNY";
	//Scanner masuk = new Scanner(System.in);
	//System.out.println("masukkan");
	//name = masuk.next();
	public Const(String nama,String data2)
	{	this.nama = nama;
		this.data2 = data2;
	}
	void cetakConst()
	{	System.out.printf("%s %s",this.nama,this.data2);
		System.out.println("");
	}
	public static void main(String[] fian)
	{	Const a = new Const(Name,"fian");
		a.cetakConst();
	}
}