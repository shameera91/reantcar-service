package com.car.rentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created By Shameera.A on 4/5/2020
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PickUpPlaceDTO {

    private String placeId;
    private BigDecimal latitude;
    private BigDecimal longitude;

}
