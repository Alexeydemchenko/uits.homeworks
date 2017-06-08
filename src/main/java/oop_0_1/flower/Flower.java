package oop_0_1.flower;

public class Flower implements Comparable<Flower>{
    private String color;
    private Integer freshness;
    private double stalkLength;
    private double cost;

    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public Integer getFreshness(){
        return freshness;
    }
    
    public void setFreshness(Integer freshness){
        this.freshness = freshness;
    }
    
    public double getStalkLength(){
        return stalkLength;
    }
    
    public void setStalkLength(double stalkLength){
        this.stalkLength = stalkLength;
    }
    
    public double getCost(){
        return cost;
    }
    
    public void setCost(double cost){
        this.cost = cost;
    }
    
    Flower(){
    
    }

    Flower(String color, int freshness, double stalkLength, double cost){
        this.color = color;
        this.freshness = freshness;
        this.stalkLength = stalkLength;
        this.cost = cost;
    }
    
    public String printFlower(){
        return "Flower: \n" + "Свежесть: " + freshness + "\nДлина стебля:" + 
                stalkLength + "\nСтоимость: " + cost + "\n";
    }
    
    @Override
    public int compareTo(Flower flower){
        return this.freshness.compareTo(flower.freshness);
    }
}
