package tech.reliab.course.bahtinva.bank.service;

import tech.reliab.course.bahtinva.bank.entity.PaymentAccount;
import tech.reliab.course.bahtinva.bank.entity.User;


public interface PaymentAccountService {
    PaymentAccount create(User user, String bankName);
    PaymentAccount read();
    void update(PaymentAccount paymentAccount);
    void delete(PaymentAccount paymentAccount);
}
