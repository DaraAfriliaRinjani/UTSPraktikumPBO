package ModelRoom;


public class SuiteRoom extends RoomType{
   public SuiteRoom(int numberOfRooms) {
        super("Suite", 100.000, 20, numberOfRooms); // Set harga dan kapasitas tamu
    }

    @Override
    public String getDescription() {
        return "Kamar Suite dengan fasilitas lengkap.";
    } 
    
}
