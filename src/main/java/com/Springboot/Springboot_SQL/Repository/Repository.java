package com.Springboot.Springboot_SQL.Repository;

import com.Springboot.Springboot_SQL.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Room, Integer> {
}
