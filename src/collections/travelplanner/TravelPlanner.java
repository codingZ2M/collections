package collections.travelplanner;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TravelPlanner {
    public static void main(String[] args) {
    	
        Set<Destination> destinations = new HashSet<>();
        destinations.add(new Destination("Paris", "France", 5));
        destinations.add(new Destination("Tokyo", "Japan", 4));
        destinations.add(new Destination("New York", "USA", 4));
        destinations.add(new Destination("California", "USA", 5));
        destinations.add(new Destination("London", "UK", 5));
        destinations.add(new Destination("Sydney", "Australia", 4));

        
        // Filtering destinations with a rating of 4 or higher
        List<Destination> highRatedDestinations = destinations.stream()
                .filter(dest -> dest.getRating() >= 4)
                .collect(Collectors.toList());

        System.out.println("Highly Rated Destinations:");
        highRatedDestinations.forEach(System.out::println);

        
        // Grouping destinations by country
        Map<String, List<Destination>> destinationsByCountry = destinations.stream()
                .collect(Collectors.groupingBy(destination -> destination.getCountry()));

        System.out.println("\nDestinations by Country:");
        destinationsByCountry.forEach((country, countryDestinations) -> {
            System.out.println(country + ":");
            countryDestinations.forEach(dest -> System.out.println("  " + dest.getName()));
        });

        
        // Calculating the average rating of all destinations
        double averageRating = destinations.stream()
                .mapToDouble(Destination::getRating)
                .average()
                .orElse(0);

        System.out.println("\nAverage Rating of All Destinations: " + averageRating);
    }
    
}
