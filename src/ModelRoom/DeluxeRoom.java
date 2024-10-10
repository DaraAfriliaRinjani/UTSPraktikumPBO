package ModelRoom;

public class DeluxeRoom extends RoomType {
     public DeluxeRoom(int numberOfRooms) {
        super("Deluxe", 950.000, 15, numberOfRooms); // Set harga dan kapasitas tamu
    }

    @Override
    public String getDescription() {
        return "Kamar Deluxe dengan fasilitas lebih baik.";
    }
    
}
