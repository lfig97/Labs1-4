package labThree;

public class Banana extends Fruit{

    public Banana(double calories){
        setCalories(calories);
    }

    public  static void peel(){
        System.out.println("Peeling the banana!");
    }
    @Override
    public  void makeJuice(){
        System.out.println("Making banana juice!");
    }
}
