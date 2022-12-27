package tech.reliab.course.bahtinva.bank.service;
import tech.reliab.course.bahtinva.bank.entity.Bank;

public interface BankService {
    Bank create(String name);
    Bank read();
    void update(Bank bank);
    void delete(Bank bank);
}
