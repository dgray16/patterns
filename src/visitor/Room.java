package visitor;

/**
 * Created by Administrator on 13.05.2015.
 */
public class Room implements Place {
    private boolean web;

    public Room(boolean web){
        this.web = web;
    }

    public int roomNumber;
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.check(this);
    }

    public boolean hasWebDeveloper(){
        if (web == true) return true;
        else return false;
    }
}
