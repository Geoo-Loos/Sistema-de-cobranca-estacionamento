package Interfaces.Modelos.Services;

import java.time.Duration;

import Interfaces.Modelos.Entities.CarRental;
import Interfaces.Modelos.Entities.Invoice;

public class RentalService {
    private Double PricePhour;
    private Double PricePDay;
    private Tax tax;
    private PaymentService paymentService;
    
    

    public RentalService(Double pricePhour, Double pricePDay, Tax tax, PaymentService paymentService) {
        PricePhour = pricePhour;
        PricePDay=pricePDay;
        this.tax = tax;
        this.paymentService=paymentService;
    }
 

    public Double getPricePhour() {
        return PricePhour;
    }







    public void setPricePhour(Double pricePhour) {
        PricePhour = pricePhour;
    }







    public Double getPricePDay() {
        return PricePDay;
    }







    public void setPricePDay(Double pricePDay) {
        PricePDay = pricePDay;
    }




    public Tax getTax() {
        return tax;
    }




    public void setTax(Tax tax) {
        this.tax = tax;
    }

   
     public PaymentService getPaymentService() {
        return paymentService;
    }


    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void ProcessInvoice(CarRental carRental){

        double Hour=Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes()/60.0;
        
        Double BasicPayment;
        if (Hour<=12.0) {
            BasicPayment=PricePhour*Math.ceil(Hour);
        } else {
            BasicPayment=PricePDay*Math.ceil(Hour/24);           
        }

        Double TAX=tax.tax(BasicPayment);//O valor de BasicPayment entra no método tax com o nome amount.
        Double Pay=paymentService.fee(BasicPayment);
        carRental.setInvoice(new Invoice(BasicPayment, TAX, Pay));
    }

   
    public String toString(){
        return "Preço por hora"+getPricePhour()+", preço por dia "+getPricePDay();
    }
   
}
