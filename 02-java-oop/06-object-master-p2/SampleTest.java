public class SampleTest{
    public static void main(String[] args){
        Human mike = new Human(3,3,3,100);
        Ninja naruto = new Ninja();
        Samurai oden = new Samurai();
        Wizard harry = new Wizard();

        oden.deathBlow(mike);
        System.out.println("Mike was hit with a death blow. Mikes Health: " + mike.getHealth() + " Odens Health: " + oden.getHealth());
        oden.meditate();
        System.out.println("Odens Health after meditating: " + oden.getHealth());
        System.out.println("Number of samurais: " + oden.howMany());
        naruto.steal(mike);
        System.out.println("Naruto stole some health from Mike. Mikes Health: " + mike.getHealth() + " Narutos Health: " + naruto.getHealth());
        harry.heal(mike);
        harry.heal(mike);
        System.out.println("Mikes health after healing: " + mike.getHealth());
        harry.fireBall(naruto);
        System.out.println("Harry threw fireball at Naruto. Narutos health is: " + naruto.getHealth());
        naruto.runAway();
        System.out.println("After getting hit with the fireball Naruto ran away. Narutos health: " + naruto.getHealth());
    }
}