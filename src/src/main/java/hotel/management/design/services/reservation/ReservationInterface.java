package hotel.management.design.services.reservation;

import hotel.management.design.models.Customer;
import hotel.management.design.models.ReservationEntity;

import java.util.Date;

public interface ReservationInterface {
    void reserve(ReservationEntity reservationEntity, Customer customer, Date startDate, Date endDate);

    void cancel(ReservationEntity reservationEntity, Customer customer);

    void getStatus(ReservationEntity reservationEntity, Customer customer);

}
