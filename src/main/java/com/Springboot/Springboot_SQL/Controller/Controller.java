package com.Springboot.Springboot_SQL.Controller;


import com.Springboot.Springboot_SQL.Entity.Room;
import com.Springboot.Springboot_SQL.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/alldata")
    public List<Room> alldata() {
        return service.alldata();

    }

    @PostMapping("/alldata/adddata")
    public String adddata(@RequestBody Room room) {
        service.adddata(room);
        return "Successfully added";
    }


    @DeleteMapping("/alldata/{Id}")
    public String deleteData(@PathVariable int Id) {
        service.deletedataById(Id);
        return "Successfully deleted";
    }

    @PutMapping("/alldata/update")
    public String updateData(@RequestBody Room room) {
        service.updateData(room);
        return "successfully updated";
    }

}
