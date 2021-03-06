package com.car.rentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created By Shameera.A on 4/2/2020
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedPersonOutputDTO {

    private String email;
    private String firstName;
    private String secondName;
    private String phone;

}
