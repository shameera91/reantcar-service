package com.car.rentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created By Shameera.A on 4/4/2020
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationInputDTO {

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private BookedPersonOutputDTO bookedPerson;
}
