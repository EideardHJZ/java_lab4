
public class P17 {
	public static void main(String[] args) 
	{
		Car17 car1[];
		car1 = new Car17[2];
		
		car1[0] = new Car17();
		car1[0].setCar(1234,20.5);
		
		
		car1[1] = new RacingCar17();
		car1[1].setCar(4567, 30.5);
		for(int i=0;i<car1.length;i++)
		{
			car1[i].show();
		}
	}

}
class Car17
{
	protected int num;
	protected double gas;
	
	public Car17()
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

class RacingCar17 extends Car17
{
	private int course;
	
	public RacingCar17()
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