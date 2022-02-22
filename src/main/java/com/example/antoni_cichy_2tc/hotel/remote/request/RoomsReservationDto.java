package com.example.antoni_cichy_2tc.hotel.remote.request;

public class RoomsReservationDto {
    public Integer id;
    public Integer roomId;
    public Integer days;

    public RoomsReservationDto() {
    }

    public RoomsReservationDto(Integer id, Integer roomId, Integer days) {
        this.id = id;
        this.roomId = roomId;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
