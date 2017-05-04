package oop_0.house;
import java.util.Random;

public class HouseApp {
    public static Random rand = new Random();
    public static House[] house;
    
    public static String[] street = {
        "Пушкинская",
        "Петровского",
        "Артема",
        "Академика Волкова",
        "Луи Пастера",
        "пер. Людвика Свободы"
    };
    
    public static String[] typeOfBuilding = {
        "Административное",
        "Коммерческое",
        "Производственное",
        "Жилое",
    };
    
    public static void main(String[] args){
        createHouse();
        showHouse();
        System.out.println("\n==================================\n");
        System.out.println("СПИСОК КВАРТИР С ЗАДАННЫМ КОЛИЧЕСТВОМ КОМНАТ: ");
        System.out.println("\n==================================\n");
        identifyRooms(house, 5);
        System.out.println("\n==================================\n");
        System.out.println("КВАРТИРЫ С НЕОБХОДИМОЙ КОМНАТОЙ В ЗАДАННОМ ПРОМЕЖУТКЕ: ");
        System.out.println("\n==================================\n");
        roomsAndFloorGap(house, 3, 3, 8);
        System.out.println("\n==================================\n");
        System.out.println("КВАРТИРЫ С ПРЕВОСХОДЯЩЕЙ ПЛОЩАДЬЮ: ");
        System.out.println("\n==================================\n");
        overSquare(house, 100);
    }
    
    public static void createHouse(){
        house = new House[10];
        for(int i = 0; i < house.length; i++){
            House h = new House();
            h.setId(i);
            h.setHouseNum(rand.nextInt(100));
            h.setFloor(rand.nextInt(6) + 1);
            h.setRooms(rand.nextInt(10));
            if(h.getRooms() > 3){
                h.setHouseSquare(rand.nextInt(150) + 10);
            }else{
                h.setHouseSquare(rand.nextInt(40) + 10);
            }
            h.setStreet(street[rand.nextInt(street.length)]);
            if(h.getHouseSquare() > 100){
                h.setTypeOfBuilding(typeOfBuilding[2]);
            }else if(h.getHouseSquare() < 100 && h.getHouseSquare() > 70){
                h.setTypeOfBuilding(typeOfBuilding[0]);
            }else if(h.getHouseSquare() < 90 && h.getHouseSquare() > 60){
                h.setTypeOfBuilding(typeOfBuilding[1]);
            }else{
                h.setTypeOfBuilding(typeOfBuilding[3]);
            }
            h.setLifetime(rand.nextInt(100));
            house[i] = h;
        }
    }
    
    public static void showHouse(){
        for(int i = 0;  i < house.length; i++){
            System.out.println(house[i].printHouse());
        }
    }
    
    public static void identifyRooms(House[] house, int numOfRooms){
        for(int i = 0; i < house.length; i++){
            if(house[i].getRooms() == numOfRooms){
                System.out.println(house[i].printHouse());
            }
        }
    }
    
    public static void roomsAndFloorGap(House[] house, int numOfRooms, 
                                        int startPoint, int endPoint){
        for(int i = 0; i < house.length; i++){
            if((house[i].getRooms() == numOfRooms) && 
               (house[i].getFloor() > startPoint && house[i].getFloor() < endPoint)){
                System.out.println(house[i].printHouse());
            }
        }                                        
    }
    
    public static void overSquare(House[] house, int squareLimit){
        for(int i = 0; i < house.length; i++){
            if(house[i].getHouseSquare() > squareLimit){
                System.out.println(house[i].printHouse());
            }
        }
    }
}
