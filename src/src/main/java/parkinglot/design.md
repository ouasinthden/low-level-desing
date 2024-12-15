# Welcome to designing parking lot 

## Let's start
***
### Functional requirements
***
***
How do you even think about functional requirements, think about what do 
you do and what do it let's you do.

So i enter, i take ticket, i park my car, bike, scooty. After some time i leave that is exit 
This statement can be crafted as 
* User should be able to enter/exit the lot
* User should get a parking ticket 
* User should be able to park its car to the place it got allocated.
* User should be able to park multiple types of vehicles in it. 
* Two types of user 
  * Simple User
  * Handicapped User

<em>Now this was what you do, Lets talk about the System</em>

* System should calculate the total fees when user is exiting on the gate
* System should gradually available all the time
  * Tickets should be allocated if there is space
* System should stay consistent
  * Tickets should be generated unique everytime 
* System should be partition tolerance

***
***

### Class Object and Entities Relationship

***
***

**Data Objects classes** 

* Ticket
  * `ID, parkingId, entryTime, entryGate, vehicleNumber`
* ParkingSpace
  * `ParkingId, Ticket, parkingType, totalSlotsAvailable`
* Parking Lot
  * `List<ParkingSpace>, ParkingLotId, totalOccupancy`
* ParkingType 
  * Classes - `Bike, Car, Trucks, HandicappedSection`

**Relations Between Objects**

* ReservationClass

```java
import java.util.MissingResourceException;

class ReservationClass {
  public Ticket reserveVehicle(String vehicleNumber, Parkingtype parkingType) {
    if (reserveParkingSpot(parkingType)) {
      return new Ticket(Math.random(), findAvailableParkingSpot(), new Date(), 1, vehicleNumber);
    }
    throw new MissingResourceException();
  }

  public boolean reserveParkingSpot(ParkingType parkingType) {
    if (parkingSpace.totalSlotAvailable > 0) {
      parkingSpace.totalSlotAvailable--;
      return true;
    }
  }
  
  public void removeVehicle(Ticket ticket){
      //calculate amount
    // remove that from the system 
    // Payment class should be called
  }
}
```

* Payment Class

```java
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

class Payment {
  public void pay(int amount, Ticket ticket) {
    //paid
    Supplier supplier = new Supplier(()->{
        return true;    
    });
    CompletableFuture completableFuture = new CompletableFuture(supplier);
    boolean paid = completableFuture.get();
    if (paid) {
        //yaya
    } else {
      throw new Exception();
    }
  }

}
```



