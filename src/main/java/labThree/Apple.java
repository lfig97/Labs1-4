package labThree;

public class Apple extends Fruit {

    public Apple(double calories) {
        setCalories(calories);
    }

    public  static void removeSeeds() {
        System.out.println("Removing seeds!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Making apple juice!");
    }
}


