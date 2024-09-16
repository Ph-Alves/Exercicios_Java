package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

    public void processContract(Contract contract, Integer months) {
        Double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.Interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + fee + interest;
            contract.getInstallments().add(new Installment(quota, dueDate));
        }
    }   
}
