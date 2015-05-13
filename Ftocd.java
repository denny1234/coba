class Ftocd
{	double convert_Ftoc(double fahrenheit)
	{ 	double celcius = (5*(fahrenheit-32))/9;
		return celcius;
	}
		public static void main(String[] args)
		{	Ftocd ftoc = new Ftocd();
			double f = Double.parseDouble(args[0]);
			double c = ftoc.convert_Ftoc(f);
			System.out.println(f+" derajat fahrenheit, sama dengan "+c+" derajat celcius");
		}
}