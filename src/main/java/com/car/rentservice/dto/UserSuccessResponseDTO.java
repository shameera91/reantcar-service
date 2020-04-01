package com.car.rentservice.dto;

import com.car.rentservice.modal.Car;
import com.car.rentservice.modal.Comments;
import com.car.rentservice.utils.CommonConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Created By Shameera.A on 4/1/2020
 */

@Getter
@AllArgsConstructor
public class UserSuccessResponseDTO {

    private final String firstName;
    private final String secondName;
    @JsonFormat(pattern = CommonConstants.DATE_FORMAT)
    private final LocalDate registrationDate;
    private final List<Comments> comments;
    private final List<Car> ownCars;
    private final List<Car> bookedCars;
    private final Map<String,Object> history;
}
