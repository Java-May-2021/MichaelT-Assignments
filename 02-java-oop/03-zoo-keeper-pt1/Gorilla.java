public class Gorilla extends Mammal{
    public Gorilla(){
        super(100);
    }

    public void throwSomething(){
        energyLevel -= 5;
        System.out.println("The gorilla threw something. Current energy is: " + this.energyLevel);
    }

    public void eatBanana(){
        energyLevel += 10;
        System.out.println("The gorilla ate a banana. Current energy is: " + this.energyLevel);
    }

    public void climb(){
        energyLevel -= 10;
        System.out.println("The gorilla climbed a tree. Current energy is: " + this.energyLevel);
    }
}