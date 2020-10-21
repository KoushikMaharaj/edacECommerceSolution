package pojo;

public class Money {

    String currency;
    int  value;
   
    public Money(String cur, int val)
    {
        this.currency=cur;
        this.value=val;

    }

    public  String getCurrency(){
           return currency; 
    }
    public  void setCurrency(String cur){
            this.currency=cur; 
    }
    
    public  int getValue(){
            return value; 
    }
 
    public  void setValue(int val){
      this.value=val; 
    }
}