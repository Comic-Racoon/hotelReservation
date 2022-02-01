package model.room;

/**
 * @author Rahul
 */

public interface IRoom {
     String getRoomNumber();
     Double getRoomPrice();
     RoomType getRoomType();
     boolean isFree();
}
