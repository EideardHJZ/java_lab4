
public class P11 {
	public static void main(String[] args) 
	{
		RacingCar11 rccar1 ;
		rccar1 = new RacingCar11();
		
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
		
		rccar1.show();
		
	}

}
class car11
{
	protected int num;
	protected double gas;
	
	public car11()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，氣油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("氣油量是"+gas);
	}
}

class RacingCar11 extends car11
{
	private int course;
	
	public RacingCar11()
	{
		course = 0;
		System.out.println("生產了賽車");
	}

	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設定為"+course);
	}
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("氣油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
