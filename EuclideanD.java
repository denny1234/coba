class EuclideanD
{	double Euclid(double x1,double x2, double y1, double y2)
	{	double hasil = Math.sqrt(Math.pow((y2-x2),2)+Math.pow((y1-x1),2));
		return hasil;
	}
	
		public static void main(String[] args)
		{	EuclideanD euclid = new EuclideanD();
			double x1 = Double.parseDouble(args[0]);
			double x2 = Double.parseDouble(args[1]);
			double y1 = Double.parseDouble(args[2]);
			double y2 = Double.parseDouble(args[3]);
			double z = euclid.Euclid(x1,x2,y1,y2);
			System.out.println("Jarak antara titik A("+x1+","+x2+")"+" dan titik B("+y1+","+y2+")"+" adalah : "+z);
		}
}