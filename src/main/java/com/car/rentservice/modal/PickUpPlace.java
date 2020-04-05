package com.car.rentservice.modal;

import com.car.rentservice.audited.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created By Shameera.A on 4/5/2020
 */

@Entity
@Table(name = "pickup_place")
@Audited
@Getter
@SuperBuilder
@NoArgsConstructor
public class PickUpPlace extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String placeId;
    private BigDecimal latitude;
    private BigDecimal longitude;


}
