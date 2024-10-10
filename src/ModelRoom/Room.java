package ModelRoom;

public class Room {
 private String type;
    private String description;
    private double price;
    private int maxGuests;
    private boolean isAvailable;

    public Room(String type, String description, double price, int maxGuests) {
        this.type = type;
        this.description = description;
        this.price = price;
        this.maxGuests = maxGuests;
        this.isAvailable = true;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }   
    
}
