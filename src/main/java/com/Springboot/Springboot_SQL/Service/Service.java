package com.Springboot.Springboot_SQL.Service;

import com.Springboot.Springboot_SQL.Entity.Room;
import com.Springboot.Springboot_SQL.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Repository repository;

    public List<Room> alldata() {
        return repository.findAll();
    }

    public void adddata(Room room) {
        repository.save(room);
    }

    public void deletedataById(int Id) {
        repository.deleteById(Id);
    }

    public void updateData(Room room) {
        repository.save(room);
    }

}
