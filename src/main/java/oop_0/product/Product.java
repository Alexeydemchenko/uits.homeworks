package oop_0.product;

public class Product {
    private int id;
    private String name;
    private long upc;
    private String manufacturer;
    private double price;
    private int shelfLife;
    private int amount;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public long getUpc(){
        return upc;
    }
    
    public void setUpc(long upc){
        this.upc = upc;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getShelfLife(){
        return shelfLife;
    }
    
    public void setShelfLife(int shelfLife){
        this.shelfLife = shelfLife;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void setAmount(int amount){
        this.amount = amount;
    }
    
    Product(){
    
    }

    Product(int id, String name, long upc, String manufacturer, double price,
            int shelfLife, int amount){
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.amount = amount;
    }
    
    public String printProduct(){
        return "Product:\n" + "id: " + id + "\nName: " + name + "\nUPC: " + upc 
                + "\nManufacturer: " + manufacturer + "\nPrice: " + price + 
                "\nShelf life: " + shelfLife + " дней"+ "\nAmount: " + amount 
                + "\n";
    }
}
