public class Samurai extends Human{
    private static int counter = 0;
    private static int defaultHealth = 200;

    public Samurai(){
        super(3,3,3,200);
        counter ++;
    }

    public void deathBlow(Human target){
        target.health -= target.health;
        this.health = this.health /2;
    }

    public void meditate(){
        this.health = this.defaultHealth;
    }

    public static int howMany(){
        return counter;
    }
}