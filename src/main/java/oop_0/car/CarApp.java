package oop_0.car;
import java.util.Random;

public class CarApp {
    public static Random rand = new Random();
//    Car(int id, String mark, String model, int year, String color, int price, 
//        int registrationNum)
    public static Car[] car = {
        new Car(0, "BMW", "X5", 2012, "Black", 57595, 2122185),
        new Car(1, "BMW", "X6", 2016, "White", 60995, 1562185),
        new Car(2, "BMW", "I8", 2015, "Black", 144395, 2122185),
        new Car(3, "Tesla", "Model S", 2016, "Red", 57700, 3122175),
        new Car(4, "Tesla", "Model X", 2016, "White", 153000, 4123175),
        new Car(5, "Mercedes Benz", "G-class", 2008, "Black", 123325, 2422275)
    };
    
    public static void main(String[] args){
        System.out.println("\n=============================================\n");
        System.out.println("ВСЕ МАШИНЫ: ");
        System.out.println("\n=============================================\n");
        showCar(car);
        System.out.println("\n=============================================\n");
        System.out.println("МАШИНЫ ОПРЕДЕЛЕННОЙ МАРКИ(Mercedes Benz): ");
        System.out.println("\n=============================================\n");
        showMark(car, "Mercedes Benz");
        System.out.println("\n=============================================\n");
        System.out.println("МАШИНЫ КОТОРЫЕ ЭКСПЛУАТИРУЮТСЯ БОЛЬШЕ N-ЛЕТ: ");
        System.out.println("\n=============================================\n");
        exploitationYear(car, 2017, 4);
        System.out.println("\n=============================================\n");
        System.out.println("МАШИНЫ ОПРЕДЕЛЕННОГО ГОДА ВЫПУСКА, ЦЕНА КОТОРЫХ " + 
                           "ВЫШЕ ПРЕДЕЛА: ");
        System.out.println("\n=============================================\n");
        yearAndPrice(car, 2015, 100000);
        
    }
    
    public static void showCar(Car[] car){
        for(int i = 0; i < car.length; i++){
            System.out.println(car[i].printCar());
        }
    }
    
    public static void showMark(Car[] car, String mark){
        for(int i = 0; i < car.length; i++){
            if(car[i].getMark() == mark){
                System.out.println(car[i].printCar());
            }
        }
    }
    
    public static void exploitationYear(Car[] car, int currentYear, 
                                        int expYears){
        for(int i = 0; i < car.length; i++){
            if((currentYear - car[i].getYear()) > expYears){
                System.out.println(car[i].printCar());
            }
        }
    }
    
    public static void yearAndPrice(Car[] car, int year, int price){
        for(int i = 0; i < car.length; i++){
            if((car[i].getYear() == year) && (car[i].getPrice() > price)){
                System.out.println(car[i].printCar());
            }
        }
    }
}
