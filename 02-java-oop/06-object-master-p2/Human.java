public class Human{
    protected int strength;
    protected int intelligence;
    protected int stealth;
    protected int health;

    public Human(int strength, int intelligence, int stealth, int health){
        this.strength = strength;
        this.intelligence = intelligence;
        this.stealth = stealth;
        this.health = health;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return this.strength;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    public int getIntelligence(){
        return this.intelligence;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }
    public int getStealth(){
        return this.stealth;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }

    public void attack(Human target){
        target.health -= this.strength;
    }
}