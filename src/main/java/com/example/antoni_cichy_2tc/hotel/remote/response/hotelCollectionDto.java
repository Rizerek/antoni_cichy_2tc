package com.example.antoni_cichy_2tc.hotel.remote.response;

import java.util.List;

public class hotelCollectionDto {
    public List<hotelsDto> hotels;

    public hotelCollectionDto() {
    }

    public hotelCollectionDto(List<hotelsDto> hotels) {
        this.hotels = hotels;
    }

    public List<hotelsDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<hotelsDto> hotels) {
        this.hotels = hotels;
    }
}
