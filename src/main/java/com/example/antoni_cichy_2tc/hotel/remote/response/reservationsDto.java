package com.example.antoni_cichy_2tc.hotel.remote.response;

import com.example.antoni_cichy_2tc.hotel.domain.StatusEnum;

public class reservationsDto {

    public Integer id;
    public Enum<StatusEnum> status;

    public reservationsDto() {
    }

    public reservationsDto(Integer id, Enum<StatusEnum> status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Enum<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(Enum<StatusEnum> status) {
        this.status = status;
    }
}
