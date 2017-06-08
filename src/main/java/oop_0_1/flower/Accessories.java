package oop_0_1.flower;

public enum Accessories {
    RIBBON(2.50), 
    PACKIN_TAPE(3.80),
    LACE(4.0),
    BRANCH(4.0);
    
    private double cost;
    Accessories(double cost){
        this.cost = cost;
    }
}
