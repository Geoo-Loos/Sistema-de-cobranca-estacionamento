package Interfaces.Application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Interfaces.Modelos.Entities.CarRental;
import Interfaces.Modelos.Entities.Invoice;
import Interfaces.Modelos.Entities.Vehicle;
import Interfaces.Modelos.Services.BrazilTax;
import Interfaces.Modelos.Services.InvoiceFile;
import Interfaces.Modelos.Services.PayService;
import Interfaces.Modelos.Services.RentalService;


public class Programa {
    public static void main(String[] args) {
        
        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

      LocalDateTime start=LocalDateTime.parse("05/01/2026 10:30", fmt);
      LocalDateTime finish=LocalDateTime.parse("25/06/2018 14:40",fmt);

      Vehicle v=new Vehicle("Civic");
      Invoice I=new Invoice(50.00, 10.00,30.0);

      CarRental cr= new CarRental(start, finish, v);

      RentalService RS=new RentalService(10.00, 130.00,new BrazilTax(), new PayService());

      InvoiceFile invoiceFile=new InvoiceFile();
      invoiceFile.Save(I, RS, "texto.csv");
        
      System.out.println(cr.getInvoice().getTax());
      System.out.println(cr.getInvoice().getBasicPayment());
       System.out.println(cr.getInvoice().getPay());
      System.out.println(RS);
      System.out.println(cr.getInvoice());
      
      

    }
    
    
}
