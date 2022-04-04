package creational.abstract_factory.factory;

import creational.abstract_factory.banks.Bank;
import creational.abstract_factory.loans.Loan;

public abstract class AbstractFactory{
  public abstract Bank getBank(String bank);
  public abstract Loan getLoan(String loan);
}  