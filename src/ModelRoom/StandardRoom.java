package ModelRoom;


public class StandardRoom extends RoomType {
    public StandardRoom(int numberOfRooms) {
        super("Standard", 850.0000, 10, numberOfRooms); // Set harga dan kapasitas tamu
    }

    @Override
    public String getDescription() {
        return "Kamar Standard dengan fasilitas dasar.";
    }
    
}
