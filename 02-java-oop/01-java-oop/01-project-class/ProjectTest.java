public class ProjectTest {
    public static void main(String[] args) {
        Project tweetP = new Project("Twitter", "twitter clone app", 1000.99);
        String name = tweetP.getName();
        String desc = tweetP.getDescription();
        double cost = tweetP.getInitialCost();
        System.out.println("My project name is: " + name);
        System.out.println("My project description is: " + desc);
        System.out.println("My project initial cost is: " + cost);

        String eP = tweetP.elevatorPitch();
        System.out.println(eP);
        
        Project newP = new Project();
        String newEP = newP.elevatorPitch();
        System.out.println(newEP);
    }
}