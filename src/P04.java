
public class P04 {
	public static void main(String[] args) 
	{
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar4(1234,20.5);
		
		rccar1.setCourse(5);
	}

}
class car4
{
	private int num;
	private double gas;
	
	public car4()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar4(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+n+"，氣油量設為"+g);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("氣油量是"+gas);
	}
}

class RacingCar extends car4
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
}