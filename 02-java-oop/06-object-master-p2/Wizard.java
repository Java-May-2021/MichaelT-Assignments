public class Wizard extends Human{
    public Wizard(){
        super(3,8,3,50);
    }

    public void heal(Human target){
        target.health += this.intelligence;
    }

    public void fireBall(Human target){
        target.health -= (this.intelligence *3);
    }
}