package oop_0_1.flower;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private double cost;
    private List<Flower> flowers = new ArrayList<Flower>(); 
    
    public double getCost(){
        return cost;
    }
    
    public Bouquet addFlower(Flower flower){
        flowers.add(flower);
        cost += flower.getCost();
        return this;
    }
}
