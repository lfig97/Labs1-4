package labThree;

public class Banana extends Fruit{

    public Banana(double calories){
        super(calories);
    }

    public static void peel(){
        System.out.println("Peeling the banana!");
    }
    @Override
    public void makeJuice(){
        System.out.println("Making apple juice!");
    }
}
