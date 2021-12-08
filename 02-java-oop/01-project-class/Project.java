class Project {
    // Member Variables
    private String name;
    private String description;
    private double initialCost;

    // Constructor Method
    public Project() {}
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    // Getters & Setters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getInitialCost() {
        return initialCost;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDecsription(String description) {
        this.description = description;
    }
    public void setInitialCost(double cost) {
        initialCost = cost;
    }

    // Methods
    public String elevatorPitch() {
        return name + " : " + description;
    }
}
