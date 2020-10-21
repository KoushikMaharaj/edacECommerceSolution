package service;
import pojo.*;


public interface IMoneyService {
   
    void addMoney(String cur,int money);
    Money getMoney();
}