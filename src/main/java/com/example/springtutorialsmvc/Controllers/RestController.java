package com.example.springtutorialsmvc.Controllers;

import com.example.springtutorialsmvc.Models.Room;
import com.example.springtutorialsmvc.Services.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private RoomsService roomsService;

    @RequestMapping("/rooms")
    public List<Room> sayHai(){
        return roomsService.populateRooms();
    }

}
