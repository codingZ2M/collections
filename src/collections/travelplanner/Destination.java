package collections.travelplanner;

class Destination {
	
    private String name;
    private String country;
    private int rating;

    public Destination(String name, String country, int rating) {
        this.name = name;
        this.country = country;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " in " + country + " (Rating: " + rating + ")";
    }
}
