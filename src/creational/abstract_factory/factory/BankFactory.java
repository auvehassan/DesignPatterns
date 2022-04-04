package creational.abstract_factory.factory;

import creational.abstract_factory.banks.Bank;
import creational.abstract_factory.banks.HDFC;
import creational.abstract_factory.banks.ICICI;
import creational.abstract_factory.banks.SBI;
import creational.abstract_factory.loans.Loan;

public class BankFactory extends AbstractFactory {
   public Bank getBank(String bank){
      if(bank == null){  
         return null;  
      }  
      if(bank.equalsIgnoreCase("HDFC")){  
         return new HDFC();
      } else if(bank.equalsIgnoreCase("ICICI")){  
         return new ICICI();
      } else if(bank.equalsIgnoreCase("SBI")){  
         return new SBI();
      }  
      return null;  
   }  
  public Loan getLoan(String loan) {
      return null;  
   }  
}//End of the BankFactory class.  