# Ticket Management System 

### Functional requirements 
***
Figuring out functional requirements is difficult in this system, but what really 
ticket service means. One thing is sure, user should be able to 
book tickets for -
* Bus 
* Train 
* Hotels
* Flights

In this case tickets should be consistent, once booked 
should reflect back in all systems
> Now once tickets are booked you have to see them right !?

So now writing the whole functional requirements 

* User should be able to view tickets of 
  * Hotels 
  * Flights
  * Trains
  * Bus
* User should be able to select date, time, and venue(source to destination)
* User should be able to reserve, cancel the booking
* User should be able to see the status of the reservation 
* User should get a acknowledgment
* System should be able to handle concurrent requests. 
* System should be eventual available.
* Consistency matters here due to concurrent calls.
* System should be partition tolerance
* User should be able to pay thru 
  * CC
  * DC 
  * UP

***
### Database Designing 

While designing database one thing should be kept in mind,
System should be consistent all the time, for concurrent requests it 
should acquire lock and treat requests based on FCFS. 
So Obvious choice would be using a SQL here, because it provides the 
properties of ACID. Really helpful here. 
> What system really needs BASE properties here then ?
> Think of something like Analytics Service, where you just need 
> a load of data, but you don't need to service real-time, but then this could be 
> done using **SQL** too, now what if you got hundreds of filters, how would you power that !?
> Now in this case you should separate your systems, use elasticSearch. 
> Fetching all the documents can be a trade-off 
> 
