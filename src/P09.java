
public class P09 {
	public static void main(String[] args) 
	{
		RacingCar9 	rccar1;
		rccar1 = new RacingCar9();
		
		rccar1.newshow();

	}

}
class car9
{
	protected int num;
	protected double gas;
	
	public car9()
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

class RacingCar9 extends car9
{
	private int course;
	
	public RacingCar9()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	public void newshow()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("氣油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}