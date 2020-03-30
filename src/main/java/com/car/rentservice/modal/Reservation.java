package com.car.rentservice.modal;

import lombok.Builder;
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
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created By Shameera.A on 3/29/2020
 */

@Entity
@Table(name = "reservation")
@Audited
@Getter
@SuperBuilder
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String orderNumber;
    private BigDecimal amount;
    private LocalDateTime bookingDate;

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private User user;

    private String serialNumber;

    @Builder.Default
    private boolean paid = false;

}
