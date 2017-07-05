package oop_0_1.flower;
import java.util.Arrays;

public class Bouquet {
    public Flower[] flowers;
    public Accessories[] acc;
    public double price = 0.0;
    
    //Цена букета
    public double getPrice(){
        return price;
    }
    
    //Добавление цветов в букет
    public void addFlowers(Flower[] flowers){
        for(Flower flower : flowers){
            price += price + flower.getPrice();
        }
        this.flowers = flowers;
    }
    
    //Добавление аксессуаров в букет
    public void addAccessories(Accessories[] accessories){
        for(Accessories accessory : accessories){
            price += accessory.getAccPrice();
        }
    }
    
    //Показать все цветы
    public void showFlower(){
        for(Flower flower : flowers){
            System.out.println(flower);
        }
    }
    
    //Сортировка по свежести
    public void freshnessSort(){
        Arrays.sort(flowers);
    }
    
    //Сравнить цветы по длине стебля
    public void showStalkLength(double startPoint, double finalPoint){
        for(Flower flower : flowers){
            if(flower.getStalkLength() >= startPoint &&
               flower.getStalkLength() <= finalPoint){
                System.out.println(flower);
            }
        }
    }
}
