package creational.abstract_factory.factory;

import creational.abstract_factory.banks.Bank;
import creational.abstract_factory.factory.AbstractFactory;
import creational.abstract_factory.loans.BussinessLoan;
import creational.abstract_factory.loans.EducationLoan;
import creational.abstract_factory.loans.HomeLoan;
import creational.abstract_factory.loans.Loan;

public class LoanFactory extends AbstractFactory {
           public Bank getBank(String bank){
                return null;  
          }  
        
     public Loan getLoan(String loan){
      if(loan == null){  
         return null;  
      }  
      if(loan.equalsIgnoreCase("Home")){  
         return new HomeLoan();
      } else if(loan.equalsIgnoreCase("Business")){  
         return new BussinessLoan();
      } else if(loan.equalsIgnoreCase("Education")){  
         return new EducationLoan();
      }  
      return null;  
   }  
     
}  