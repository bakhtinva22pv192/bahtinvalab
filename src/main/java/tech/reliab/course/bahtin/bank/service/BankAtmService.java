package tech.reliab.course.bahtin.bank.service;

import tech.reliab.course.bahtin.bank.entity.Bank;
import tech.reliab.course.bahtin.bank.entity.BankAtm;
import tech.reliab.course.bahtin.bank.entity.BankOffice;
import tech.reliab.course.bahtin.bank.entity.Employee;

public interface BankAtmService {
    BankAtm create(String name, Bank bank, BankOffice bankOffice, Employee employee, double maintenance);
    BankAtm read();
    void update(BankAtm bankAtm);
    void delete(BankAtm bankAtm);
}
