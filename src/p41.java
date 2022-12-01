
public class p41 {

	public static void main(String[] args) {
		car41 car1 = new car41(1234,20.5);
		car1.vshow();
		car1.mshow();

	}

}
interface ivehical41{
	void vshow();
}
interface imaterial{
	void mshow();
}
class car41 implements ivehical41,imaterial{
	private int num;
	private double gas;
	
	public car41(int n, double g) {
		num = n;
		gas = g;
	    System.out.println("生產了車號為"+num+"，氣油量為"+gas+"的車子");
	  }
	  public void vshow(){
			System.out.println("車號是"+num);
			System.out.println("氣油量是"+gas);  
	}
	  public void mshow(){
		    System.out.println("車子的材質是鐵");
		    	  
		}
}