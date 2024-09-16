package model.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double Interest (double amount, int months);
}
