class Ftocc
{	static double convert_Ftoc(double fahrenheit)
	{ 	double celcius = (5*(fahrenheit-32))/9;
		return celcius;
	}
		public static void main(String[] args)
		{	double f = 122;
			double c = convert_Ftoc(f);
			System.out.println(f+" derajat fahrenheit, sama dengan "+c+" derajat celcius");
		}
}