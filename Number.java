package Practice1;

public class Number {
	public static void main(String args[])
	{

	String str = "Puja Saha";
	int vowelA=0; 
	int vowelE=0;
	int vowelI=0; 
	int vowelO=0; 
	int vowelU=0;
	for (int i=0; i<str.length(); i++)
	{	
		
		if (str.charAt(i) =='a')
		{
		vowelA = vowelA + 1;
		
		}
		else if(str.charAt(i)=='e')
		{
		vowelE= vowelE + 1;
		}
		else if(str.charAt(i)=='i')
		{
		vowelI=vowelI + 1;
		}
		else if(str.charAt(i)=='o')
		{
			vowelO= vowelO + 1;
		}
		else if(str.charAt(i)=='u')
		{
			vowelU= vowelU + 1;
		}
		
	}
	if (vowelA>0)
	{
	System.out.println("No. of As="+ vowelA);
	}
	if (vowelE>0) 
	{
		System.out.println("No. of Es="+ vowelE);
	}
	if (vowelI>0) 
	{
		System.out.println("No. of Is="+ vowelI);
	}
	if (vowelO>0) 
	{
		System.out.println("No. of Os="+ vowelO);
	}
	if (vowelU>0) 
	{
		System.out.println("No. of Us="+ vowelU);
	}
}
}
	
			