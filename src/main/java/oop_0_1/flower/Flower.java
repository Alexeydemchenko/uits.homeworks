package oop_0_1.flower;

public class Flower implements Comparable<Flower>{
    private String color;
    private Integer freshness;
    private double stalkLength;
    private double price;

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
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    Flower(){
    
    }

    Flower(String color, int freshness, double stalkLength, double cost){
        this.color = color;
        this.freshness = freshness;
        this.stalkLength = stalkLength;
        this.price = price;
    }
    
    public String printFlower(){
        return "Flower: \n" + "Свежесть: " + freshness + "\nДлина стебля:" + 
                stalkLength + "\nСтоимость: " + price + "\n";
    }
    
    @Override
    public int compareTo(Flower flower){
        if(this.freshness < flower.freshness){
            return 1;
        }else{
            return 0;
        }
    }
}
