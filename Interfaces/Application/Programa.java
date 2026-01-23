package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Entities.Contract;
import Entities.InstalIment;
import Service.ContractService;
import Service.PaypalService;

public class Programa {
    public static void main(String[] args) {
          DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Contract obj= new Contract(8028,LocalDate.parse("20/06/2020",fmt), 600.00);
    ContractService contractService=new ContractService(new PaypalService());
    contractService.ProcessContract(obj, 3);
    
    for(InstalIment instalIment: obj.getInstalIment()){
       System.out.println(instalIment);
    }
    }
}
