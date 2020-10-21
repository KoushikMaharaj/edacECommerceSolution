package service;
import pojo.*;
import dao.*;

public class MoneyService implements IMoneyService {

    @Override
    public void addMoney(String cur,int money){
        MoneyRepo repo=new MoneyRepo();
        repo.add(new Money(cur,money));
        System.out.println("added money");
    }

    @Override
    public Money getMoney() { 
        return new Money("dollar", 75);
    }
}