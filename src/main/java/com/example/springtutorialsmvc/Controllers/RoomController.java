package com.example.springtutorialsmvc.Controllers;

import com.example.springtutorialsmvc.Models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoomController {
    private static List<Room> rooms = new ArrayList<>();

    static {
        for(int i=0; i<10 ;i++){
            rooms.add(new Room(i, "Room", "abc", "desc room"));
        }
    }

    @RequestMapping("/rooms")
    public String getAllRooms(Model model){
        model.addAttribute("rooms", rooms);
        return "rooms";
    }

    @RequestMapping("/hotel")
    public String hotel(){
        return "Hotels";
    }

}
