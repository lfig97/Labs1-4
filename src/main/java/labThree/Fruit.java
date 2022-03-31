package labThree;

public abstract class Fruit {
    private double calories;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Make Juice. ");
    }

}
