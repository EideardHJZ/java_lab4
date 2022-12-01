public class p38 {

	public static void main(String[] args) {
		ivehicle[] ivc;
		ivc = new ivehicle[2];
		
		ivc[0] = new car38(1234,20.5);
		ivc[1] = new plane38(123);
		
		for(int i = 0; i<ivc.length ; i++) {
			ivc[i].show();
		}

	}

}

interface ivehicle{
	int weight = 1000;
	void show();
}

class car38 implements ivehicle{
	  private int num;
	  private double gas;
	  public car38(int n, double g){
	    num = n;
	    gas = g;
	    System.out.println("生產了車號為"+num+"，氣油量為"+gas+"的車子");
	  }
	  public void show(){
			System.out.println("車號是"+num);
			System.out.println("氣油量是"+gas);
	    
	  }
	}

class plane38 implements ivehicle{
	  private int flight;
	  public plane38(int f){
	    flight = f;
	    System.out.println("生產了" + flight + "班次的飛機");
	  }
	  public void show(){
		    System.out.println("飛機的班次是"+ flight);
	    
	  }
	}