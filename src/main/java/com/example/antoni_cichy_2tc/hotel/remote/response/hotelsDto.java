package com.example.antoni_cichy_2tc.hotel.remote.response;

import java.util.List;

public class hotelsDto {
    public Integer id;
    public String name;
    public List<roomsDto> rooms;

    public hotelsDto() {
    }

    public hotelsDto(Integer id, String name, List<roomsDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<roomsDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<roomsDto> rooms) {
        this.rooms = rooms;
    }
}
