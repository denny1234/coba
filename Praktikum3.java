 class Praktikum3
 {	public static void main(String[] args)
	{	char[] string1 = {'H','a','j','i','m','e',' ','m','a','s','h','i','t','e',',',' ',
							'w','a','t','a','s','h','i',' ','w','a',' ',
							'D','e','n','n','y',' ','d','e','s','u'};
		String string2 = "Hajime mashite, watashi wa Denny desu";
		byte[] string3 = {(byte)'H',(byte)'a',(byte)'j',(byte)'i',(byte)'m',(byte)'e',(byte)' ',
						(byte)'m',(byte)'a',(byte)'s',(byte)'h',(byte)'i',(byte)'t',(byte)'e',(byte)',',(byte)' ',
						(byte)'w',(byte)'a',(byte)'t',(byte)'a',(byte)'s',(byte)'h',(byte)'i',(byte)' ',(byte)'w',(byte)'a',
						(byte)' ',(byte)'D',(byte)'e',(byte)'n',(byte)'n',(byte)'y',(byte)' ',(byte)'d',(byte)'e',(byte)'s',(byte)'u'};
		String str1 = new String(string1);
		String str2 = new String(string2);
		String str3 = new String(string3);
		
		String s1 = str1.concat(" Yoroshiku onegaishimasu");
		String s2 = str2.replace("a","o");
		String s3 = str3.substring(16);
		String s4 = str3.substring(16,32);
		String s6 = str3.toUpperCase();
		String s7 = str3.toLowerCase();
		Boolean s8 = str3.startsWith("h");
		int s9 = str3.length();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
	}
 }