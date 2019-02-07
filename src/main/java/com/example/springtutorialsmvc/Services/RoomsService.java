package com.example.springtutorialsmvc.Services;


import com.example.springtutorialsmvc.Models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomsService {

    public List<Room> populateRooms(){
        List<Room> roomsList = new ArrayList<>();
        for(int i=0;i<10;i++){
            roomsList.add(new Room(1,"Room" + i, String.valueOf(i),"Desc for room:" + i));
        }
        return roomsList;
    }

}
