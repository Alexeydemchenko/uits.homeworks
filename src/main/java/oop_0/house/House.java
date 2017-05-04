package oop_0.house;

public class House {
    private int id;
    private int houseNum;
    private int houseSquare;
    private int floor;
    private int rooms;
    private String street;
    private String typeOfBuilding;
    private int lifetime;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getHouseNum(){
        return houseNum;
    }
    
    public void setHouseNum(int houseNum){
        this.houseNum = houseNum;
    }
    
    public int getHouseSquare(){
        return houseSquare;
    }
    
    public void setHouseSquare(int houseSquare){
        this.houseSquare = houseSquare;
    }
    
    public int getFloor(){
        return floor;
    }
    
    public void setFloor(int floor){
        this.floor = floor;
    }
    
    public int getRooms(){
        return rooms;
    }
    
    public void setRooms(int rooms){
        this.rooms = rooms;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setStreet(String street){
        this.street = street;
    }

    public String getTypeOfBuilding(){
        return typeOfBuilding;
    }
    
    public void setTypeOfBuilding(String typeOfBuilding){
        this.typeOfBuilding = typeOfBuilding;
    }
    
    public int getLifetime(){
        return lifetime;
    }
    
    public void setLifetime(int lifetime){
        this.lifetime = lifetime;
    }
    
    House(){
    }
    
    public House(int id, int houseNum, int houseSquare, int floor, int rooms, 
          String street, String typeOfBuilding, int lifetime){
        this.id = id;
        this.houseNum = houseNum;
        this.houseSquare = houseSquare;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.lifetime = lifetime;
    }
    
    public String printHouse(){
        return "House:\n" + "id: " + id + "\nHouse number: " + houseNum + 
                "\nHouse square: " + houseSquare + "\nFloor number: " + floor +
                "\nNumber of rooms: " + rooms + "\nStreet: " + street + 
                "\nBuilding type: " + typeOfBuilding + "\nLifetime: " + lifetime
                + " лет\n"; 
    }
}
