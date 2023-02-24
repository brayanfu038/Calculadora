package model;

public class Calculator {
	long total;
	Operation operation;
    public Calculator(){
        total =0;
        operation = new Operation();
    }
     public  void addition(long x,long y){
    	 operation.addAdditionHistory(x, y);
         total = x+y;
     }
     public void substract(long x,long y){
    	 operation.addSubstractHistory(x, y);
         total = x-y;
     }
     public  void Multiplicate(long x,long y){
    	operation.addMultiplicateHistory(x, y);
        total = x*y;
     }
     public  void dividir(long x,long  y){
    	operation.addDivideHistory(x, y);
        total = x/y;
    }
     public long getTotal() {
        return total;
    }
}
