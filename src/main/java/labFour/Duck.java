package labFour;

public class Duck extends Animal implements IAnimalsThatEat {
    @Override
    public void makeSound() {
        System.out.println("Quack, Quack");

    }

    @Override
    public void eat() {
        System.out.println("I Eat Duck Food");
    }


}
