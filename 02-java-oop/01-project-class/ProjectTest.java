public class ProjectTest{
    public static void main(String[] args){
        Project testOne = new Project();
        Project testTwo = new Project("Michael");
        Project testThree = new Project("Michael", "Greatest Ever");

        System.out.println(testOne.elevatorPitch());
        System.out.println(testTwo.elevatorPitch());
        System.out.println(testThree.elevatorPitch());

        testOne.setName("Elvis");
        System.out.println(testOne.getName());
        testOne.setDescription("The Gawd");
        System.out.println(testOne.getDescription());

        testTwo.setName("Ian");
        System.out.println(testTwo.getName());
        testTwo.setDescription("The Young Beast");
        System.out.println(testTwo.getDescription());

        testThree.setName("Ellie");
        System.out.println(testThree.getName());
        testThree.setDescription("The Tiny Monster");
        System.out.println(testThree.getDescription());

    }
}