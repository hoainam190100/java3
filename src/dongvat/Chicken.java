package dongvat;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken:cuc cuc!";
    }

    @Override
    public String howToEat() {
        return "could be dog";
    }
}
