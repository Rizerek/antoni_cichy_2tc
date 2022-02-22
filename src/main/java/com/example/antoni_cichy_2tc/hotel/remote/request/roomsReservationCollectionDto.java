package com.example.antoni_cichy_2tc.hotel.remote.request;

import java.util.List;

public class roomsReservationCollectionDto {
    public List<RoomsReservationDto> roomsReservation;

    public roomsReservationCollectionDto() {
    }

    public roomsReservationCollectionDto(List<RoomsReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public List<RoomsReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<RoomsReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }
}
