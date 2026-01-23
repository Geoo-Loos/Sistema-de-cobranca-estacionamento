package Interfaces.Modelos.Services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Interfaces.Modelos.Entities.Invoice;

public class InvoiceFile {
    
  public void Save(Invoice invoice, RentalService rentalService, String path) {
    
    try (BufferedWriter bw =new BufferedWriter(new FileWriter(path,true))){
          bw.newLine();
        bw.write(invoice.toString());
         bw.newLine();
         bw.write(rentalService.toString());
         bw.newLine();
        
    } catch (IOException e) {
        System.out.println("ERROR");
    }


  } 
        
    }


