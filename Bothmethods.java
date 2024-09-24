package basicprograms;

public class Bothmethods 
{

	static void sunil()
	{
		System.out.println("Sunil is static method");
		
	}
	static void suresh()
	{
		System.out.println("Suresh is static method");
	}
	void ramesh()
	{
		System.out.println("Ramesh Non Static method");
	}
	void rajesh()
	{
		System.out.println("Rajesh is non static method");
	}
	public static void main(String[] args) 
	{
		sunil();
		suresh();
		Bothmethods s1=new Bothmethods();
		s1.rajesh();
		s1.ramesh();
		

	}

}
