class p29 {
  public static void main(String[] args) {
    vehicle[] vc  = new vehicle[2];
    vc[0] = new car2(1234,20.5);
    vc[0].setSpeed(60);
    vc[1] = new Plane(123);
    vc[1].setSpeed(500);

    for(int i = 0; i<vc.length ; i++){
      vc[i].show();
    }
  }
}
abstract class vehicle{
  protected int speed;
  public void setSpeed(int s){
    speed = s;
    System.out.println("將速度設為" + speed + "了");
  }
  abstract void show();
}
class car2 extends vehicle{
  private int num;
  private double gas;
  public car2(int n, double g){
    num = n;
    gas = g;
    System.out.println("生產了車號為"+num+"，氣油量為"+gas+"的車子");
  }
  public void show(){
    System.out.println("車號是" + num);
    System.out.println("汽油量是" + gas);
    System.out.println("速度是" + speed);
  }
}

class Plane extends vehicle{
  private int flight;
  public Plane(int f){
    flight = f;
    System.out.println("生產了" + flight + "班次的飛機");
  }
  public void show(){
    System.out.println("飛機的班次是"+ flight);
    System.out.println("速度是" + speed);
  }
}