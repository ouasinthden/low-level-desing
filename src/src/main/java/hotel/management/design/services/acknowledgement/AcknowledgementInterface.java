package hotel.management.design.services.acknowledgement;

import hotel.management.design.models.Customer;
import hotel.management.design.models.ReservationEntity;
import hotel.management.design.services.reservation.ReservationInterface;

public interface AcknowledgementInterface {
    void notify(Customer customer, ReservationEntity reservationEntity);
}
