package Interfaces.Modelos.Services;

public class PayService implements PaymentService {

    public double fee(double amount){
     return amount*0.02;
    }
}
