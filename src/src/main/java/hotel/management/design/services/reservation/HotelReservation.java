package hotel.management.design.services.reservation;

import hotel.management.design.models.Customer;
import hotel.management.design.models.ReservationEntity;
import hotel.management.design.services.acknowledgement.AcknowledgementInterface;

import java.util.Date;

public class HotelReservation implements ReservationInterface{


    @Override
    public void reserve(ReservationEntity reservationEntity, Customer customer, Date startDate, Date endDate) {
        //use acknowledgement here
    }

    @Override
    public void cancel(ReservationEntity reservationEntity, Customer customer) {

    }

    @Override
    public void getStatus(ReservationEntity reservationEntity, Customer customer) {

    }
}
