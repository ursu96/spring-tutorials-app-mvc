package com.example.springtutorialsmvc.Controllers;

import com.example.springtutorialsmvc.Models.Room;
import com.example.springtutorialsmvc.Services.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoomController {

    @Autowired
    private RoomsService roomsService;

    @RequestMapping("/")
    public String getAllRooms(Model model){
        model.addAttribute("rooms", roomsService.populateRooms());
        return "rooms";
    }

}
