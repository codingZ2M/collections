package collections.projectmanagement;

class Project {
	
    private String name;
    private String owner;
    private int priority;
    private double budget;

    public Project(String name, String owner, int priority, double budget) {
        this.name = name;
        this.owner = owner;
        this.priority = priority;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getPriority() {
        return priority;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return name + " (Owner: " + owner + ", Priority: " + priority + ", Budget: $" + budget + ")";
    }
}
