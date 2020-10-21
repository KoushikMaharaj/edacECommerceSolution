package hello;

import pojo.Money;
import service.*;

public class Simple{  
        public static void main(String args[])
        {    
            int count=34;   
            System.out.println("Hello Java " + count );  

            IMoneyService svc=new MoneyService();
            svc.addMoney("Rupee",78000);

            Money m=svc.getMoney();
            System.out.println(m.getCurrency() + " , "+ m.getValue());

        }  
    }  