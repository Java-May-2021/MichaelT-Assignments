public class HumanTest{
    public static void main(String[] args){
        Human mike = new Human(3, 3, 3, 100);
        Human elvis = new Human(3, 3, 3, 100);

        elvis.attack(mike);
        System.out.println(mike.getHealth());

    }
}