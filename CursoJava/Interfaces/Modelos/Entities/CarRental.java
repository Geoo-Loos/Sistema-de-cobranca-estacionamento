package Interfaces.Modelos.Entities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime Start;
    private LocalDateTime Finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){}
    
    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        Start = start;
        Finish = finish;
        this.vehicle = vehicle;
    }


    public LocalDateTime getStart() {
        return Start;
    }


    public void setStart(LocalDateTime start) {
        Start = start;
    }


    public LocalDateTime getFinish() {
        return Finish;
    }


    public void setFinish(LocalDateTime finish) {
        Finish = finish;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }


    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public Invoice getInvoice() {
        return invoice;
    }


    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
   
    
    
}
