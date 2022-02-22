package com.example.antoni_cichy_2tc.hotel.remote.response;

import java.util.List;

public class reservationsByStatusDto {
    public List<reservationsDto> reservations;

    public reservationsByStatusDto() {
    }

    public reservationsByStatusDto(List<reservationsDto> reservations) {
        this.reservations = reservations;
    }

    public List<reservationsDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<reservationsDto> reservations) {
        this.reservations = reservations;
    }
}
