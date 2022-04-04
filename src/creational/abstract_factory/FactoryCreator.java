package creational.abstract_factory;

import creational.abstract_factory.factory.AbstractFactory;
import creational.abstract_factory.factory.BankFactory;
import creational.abstract_factory.factory.LoanFactory;

class FactoryCreator {
     public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("Bank")){  
         return new BankFactory();
      } else if(choice.equalsIgnoreCase("Loan")){  
         return new LoanFactory();
      }  
      return null;  
   }  
}//End of the FactoryCreator.  