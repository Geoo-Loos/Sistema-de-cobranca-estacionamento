package Service;

import java.time.LocalDate;

import Entities.Contract;
import Entities.InstalIment;


public class ContractService {
    private OnlinePayService OnlinePayService;

    public ContractService(Service.OnlinePayService onlinePayService) {
        OnlinePayService = onlinePayService;
    }

     public OnlinePayService getOnlinePayService() {
        return OnlinePayService;
    }

     public void setOnlinePayService(OnlinePayService onlinePayService) {
        OnlinePayService = onlinePayService;
    }
    

    public void ProcessContract(Contract contract, Integer months){

       // contract.getInstalIment().add(new InstalIment(206.04,LocalDate.of(2020, 6, 20)));
         // contract.getInstalIment().add(new InstalIment(208.08,LocalDate.of(2020, 7, 26)));

        Double basicQuota= contract.getTotalValue()/months;

         for(int i=1; i<=months;i++){
            LocalDate dueDate= contract.getDate().plusMonths(i);

            Double interest= OnlinePayService.interest(basicQuota, i);

            Double fee=OnlinePayService.paymentFee(basicQuota+interest);

            Double quota= basicQuota+interest+fee;

            contract.getInstalIment().add(new InstalIment(quota, dueDate));
         }

    }



  
}
