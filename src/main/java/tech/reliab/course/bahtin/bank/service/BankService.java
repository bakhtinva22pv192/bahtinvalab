package tech.reliab.course.bahtin.bank.service;
import tech.reliab.course.bahtin.bank.entity.Bank;

public interface BankService {
    Bank create(String name);
    Bank read();
    void update(Bank bank);
    void delete(Bank bank);
}
