package oop_0.car;

public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private int registrationNum;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getMark(){
        return mark;
    }
    
    public void setMark(String mark){
        this.mark = mark;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getRegistrationNum(){
        return registrationNum;
    }
    
    public void setRegistrationNum(int registrationNum){
        this.registrationNum = registrationNum;
    }
    
    Car(){
    
    }

    Car(int id, String mark, String model, int year, String color, int price, 
        int registrationNum){
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNum = registrationNum;
    }
    
    public String printCar(){
        return "Car: \n" + "id: " + id + "\n" + "Mark: " + mark + 
                "\n" + "Model: " + model + "\n"+ "Year: " + 
                year + "\n" + "Color: " + color + 
                "\n" + "Price: " + price + "\n" + "Registration number: " + 
                registrationNum + "\n";
    }
}
