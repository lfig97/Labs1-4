package labFour;

public class Pig extends Animal implements IAnimalsThatEat {
    @Override
    public void makeSound() {
        System.out.println("Oink Oink");
    }

    @Override
    public void eat() {
        System.out.println("I eat anything");
    }
}
