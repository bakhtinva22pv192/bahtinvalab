package tech.reliab.course.bahtinva.bank.service;

import tech.reliab.course.bahtinva.bank.entity.Bank;
import tech.reliab.course.bahtinva.bank.entity.PaymentAccount;
import tech.reliab.course.bahtinva.bank.entity.User;


public interface PaymentAccountService {
    /**
     *
     * @param user - клиент
     * @param bank -  банка
     * @return - возвращает созданный объект платежный счет
     */
    PaymentAccount create(User user, Bank bank);

}
