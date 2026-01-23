package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class InstalIment {

    private static DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Double amount;
    private LocalDate dueDate;

    
    public InstalIment(Double amount, LocalDate dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "InstalIment. amount=" +String.format("%.2f",  amount) + "- dueDate=" + dueDate.format(fmt);
    }



    
}
