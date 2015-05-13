class Ctofc
{	static double convert_Ctof(double celcius)
	{	double fahrenheit = ((9/5)*celcius)+32;
		return fahrenheit;
	}
		public static void main(String[] args)
		{	double c = 90;
			double f = convert_Ctof(c);
			System.out.println(c+" derajat celcius, sama dengan "+f+" derajat fahrenheit");
		}
}