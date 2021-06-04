public class Bat extends Mammal{
    public Bat(){
        super(300);
    }

    public void fly(){
        energyLevel -= 50;
        System.out.println("**Wings Flapping** Flying used energy. Current energy level: " + this.energyLevel);
    }
    public void eatHumans(){
        energyLevel += 25;
        System.out.println("**Person Screaming** Drank some blood. Current energy level: " + this.energyLevel);
    }
    public void attackTown(){
        energyLevel -= 100;
        System.out.println("**Building Burning** Set town on fire but injured in the process. Current energy level: " + this.energyLevel);
    }

}