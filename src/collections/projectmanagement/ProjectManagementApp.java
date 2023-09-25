package collections.projectmanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProjectManagementApp {
    public static void main(String[] args) {
    	
        Map<String, Project> projects = new HashMap<>();
        projects.put("ProjectA", new Project("ProjectA", "Alice", 3, 10000));
        projects.put("ProjectB", new Project("ProjectB", "Bob", 2, 8000));
        projects.put("ProjectC", new Project("ProjectC", "Charlie", 1, 12000));
        projects.put("ProjectD", new Project("ProjectD", "David", 2, 9500));
        projects.put("ProjectE", new Project("ProjectE", "David", 2, 7500));
        projects.put("ProjectF", new Project("ProjectF", "Eve", 3, 11000));

        
        // Transforming the map values into a list of projects
        List<Project> projectList = projects.values().stream()
                .collect(Collectors.toList());

        System.out.println("All Projects:");
        projectList.forEach(System.out::println);

        
        // Filtering projects with a priority of 2
        List<Project> priority2Projects = projectList.stream()
                .filter(proj -> proj.getPriority() == 2)
                .collect(Collectors.toList());

        System.out.println("\nPriority 2 Projects:");
        priority2Projects.forEach(System.out::println);

        
        // Calculating the total budget of all projects
        double totalBudget = projectList.stream()
                .mapToDouble(Project::getBudget)
                .sum();

        System.out.println("\nTotal Budget of All Projects: $" + totalBudget);

        
        // Grouping projects by owner
        Map<String, List<Project>> projectsByOwner = projectList.stream()
                .collect(Collectors.groupingBy(Project::getOwner));

        System.out.println("\nProjects by Owner:");
        projectsByOwner.forEach((owner, ownerProjects) -> {
            System.out.println(owner + ":");
            ownerProjects.forEach(proj -> System.out.println("  " + proj.getName()));
        });
    }
    
}