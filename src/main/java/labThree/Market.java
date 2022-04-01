package labThree;

public class Market {
    public static void main(String[] args) {

        Banana banana = new Banana(60);
        Apple apple = new Apple(25);

        banana.makeJuice();
        apple.makeJuice();
        apple.removeSeeds();
        banana.peel();

        System.out.println( banana.getCalories());
        System.out.println(apple.getCalories());
    }

}
