package com.car.rentservice.dto;

import com.car.rentservice.utils.CommonConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

/**
 * Created By Shameera.A on 4/1/2020
 */
@Getter
@AllArgsConstructor
public class UserOutputDTO {

    private final String firstName;
    private final String secondName;
    @JsonFormat(pattern = CommonConstants.DATE_FORMAT)
    private final LocalDate registrationDate;
}
