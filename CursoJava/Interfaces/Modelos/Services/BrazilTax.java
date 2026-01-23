package Interfaces.Modelos.Services;

public class BrazilTax implements Tax{
   
    public double tax(double amount){
        if (amount<=100.00){
          return amount*0.2;
        }else {
          return amount*0.15;
        }
      
    }

}
