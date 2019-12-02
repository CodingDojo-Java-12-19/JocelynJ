public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project(){
        this("The Wall", "Application where user can post and view messages and comments with other users.", 789.75);
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getInitialCost(){
        return this.initialCost;
    }

    public String elevatorPitch(){
        return(this.name + "(" + this.initialCost + "): " + this.description);
    }

}