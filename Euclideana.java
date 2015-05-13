class Euclideana
{	public static void main(String[] args)
	{	double x1 = 1;
		double x2 = 1;
		double y1 = 4;
		double y2 = 5;
		double z = Math.sqrt(Math.pow((y2-x2),2)+Math.pow((y1-x1),2));
		System.out.println("Jarak antara titik A("+x1+","+x2+")"+" dan titik B("+y1+","+y2+")"+" adalah : "+z);
	}
	
}