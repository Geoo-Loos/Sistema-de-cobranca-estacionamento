package Interfaces.Modelos.Entities;

public class Invoice {
    private Double BasicPayment;
    private Double Tax;
    private Double Pay;
    
    public Invoice(Double basicPayment, Double tax, Double pay) {
        BasicPayment = basicPayment;
        Tax = tax;
        Pay= pay;
    }

    public Double getBasicPayment() {
        return BasicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        BasicPayment = basicPayment;
    }

    public Double getTax() {
        return Tax;
    }

    public void setTax(Double tax) {
        Tax = tax;
    }

    public Double getPay() {
        return Pay;
    }

    public void setPay(Double pay) {
        Pay = pay;
    }

   public String toString(){
    return "Taxa: "+getTax()+"Taxa de pagamento de "+getBasicPayment();
   }
}
