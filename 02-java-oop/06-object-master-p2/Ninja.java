public class Ninja extends Human{
    public Ninja(){
        super(3, 3, 10, 100);
    }

    public void steal(Human target){
        target.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runAway(){
        this.health-=10;
    }
}