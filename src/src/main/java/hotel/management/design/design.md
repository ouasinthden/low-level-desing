# Hotel Management Design 
## High level design 
### Services 
1. Reservation-service
2. User-management-service
3. History-management-service
4. Hotels-management-service
5. Status-management-service
6. Acknowledgement-service

### User types
* Owner
* Customer 

### Functional Requirements
* Customer should be able to view available hotels
  * Location Based
  * Time Based
  * Filters ->  
    * Rating
    * Staff
    * Couples Allowed 
    * Pet Filter 
* Customer should be able to book the hotel for the same 
* Customer should get booking status 
* Customer should be able to look to different rooms in a Hotel
* Hotel managers should post their hotels 
* Hotel managers should mark the hotel available or not 
* Hotel managers can edit the hotels configuration 
* Hotel managers should be able to add different rooms in the hotel
* System should be available all the time 
* System should be eventual consistent
* System should be partition tolerance 
* Locking mechanism should be their while booking a room in hotel.
  * Availability Check
  * Update the status 
  * Acknowledgement System
    * Whatsapp 
    * SMS 
    * Email

These all are the requirements of the system, that's how only our system will be good enough. 


### Classes and Entities 
* Data Object Classes 
  * User  
    * Customer
    * Owner
  * Hotel
    * Beach Hotel 
    * Mountain Hotel
  * Room 
    * Duplex Room 
    * Suite Room
    * Single Room 
    * Double Bed Room
    * Cottage
  * Payment
    * Credit Card 
    * UPI 
    * Debit Card 

* Services Classes 
  * Reservation Class
    * Hotels
    * Flights
    * ...
  * Status Class
  * Acknowledgement Class 
> Services class contains Data Object based on the need 




















