package tech.reliab.course.bahtinva.bank.service;

import tech.reliab.course.bahtinva.bank.entity.Bank;
import tech.reliab.course.bahtinva.bank.entity.BankAtm;
import tech.reliab.course.bahtinva.bank.entity.BankOffice;
import tech.reliab.course.bahtinva.bank.entity.Employee;

public interface BankAtmService {
    BankAtm create(String name, Bank bank, BankOffice bankOffice, Employee employee, double maintenance);
    BankAtm read();
    void update(BankAtm bankAtm);
    void delete(BankAtm bankAtm);
}
