package oop_0_1.flower;

public enum Accessories {
    RIBBON(2.50), 
    PACKIN_TAPE(3.80),
    LACE(4.0),
    BRANCH(4.0);
    
    private double price;
    Accessories(double price){
        this.price = price;
    }
    
    public double getAccPrice(){
        return price;
    }
}
