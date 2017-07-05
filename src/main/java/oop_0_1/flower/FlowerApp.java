package oop_0_1.flower;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FlowerApp {
    private List<Flower> flowers = new ArrayList<Flower>();
    public static Bouquet[] bouquet;
    public static Random rand = new Random();
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Bouquet> bouquetList = new ArrayList<Bouquet>();
    
    public static void main(String[] args) {
        System.out.println("МЕНЮ:");
        System.out.println("1 - Создать новый букет");
        System.out.println("2 - Показать созданные букеты");
                
        int indexOfMenu = scan.nextInt();
        switch(indexOfMenu){
            case 1:{
                createNewBouquet();
            }break;
            case 2:{
                System.out.println(bouquetList);
            }break;
            case 3:{
                
            }break;
        }
    }
    
    //Создать новый букет
    public static void createNewBouquet(){
        Bouquet bouquet = new Bouquet();
        bouquet.addFlowers(createFlowers());
        System.out.println("ЦЕНА БУКЕТА: ");
        System.out.println(bouquet.getPrice());
        bouquetList.add(bouquet);
    }
    




    
    
    
    
    //Создать конкретный цветок
    public static Flower createSingleFlower(Flower flower){
        flower.setPrice(rand.nextInt(20) + 1);
        flower.setStalkLength(rand.nextInt(25) + 1);
        flower.setFreshness(rand.nextInt(5) + 1);
        return flower;
    }
    
    
    //Выбрать цветок
    public static Flower pickFlower(int flowerPosition){
        System.out.println("ВЫБЕРЕТЕ ЦВЕТОК:");
        System.out.println("1 - Астры");
        System.out.println("2 - Гиацинт");
        System.out.println("3 - Роза");
        System.out.println("4 - Гвоздика");
        int indexOfFlower = scan.nextInt();
        switch(indexOfFlower){
            case 1: {
                return createSingleFlower(new Aster());
            }
            case 2: {
                return createSingleFlower(new Hyacints());
            }
            case 3: {
                return createSingleFlower(new Rose());
            }
            case 4: {
                return createSingleFlower(new Carnation());
            }
            default: {
                throw new NumberFormatException();
            }
        }
    }
    
    //Создать массив цветов
    public static Flower[] createFlowers(){
        System.out.println("Сколько необходимо цветов? Введите кол-во.");
        int numOfFlowers = scan.nextInt();
        Flower[] flowers = new Flower[numOfFlowers];
        for(int i = 0; i < numOfFlowers; i++){
            flowers[i] = pickFlower(i);
        }
        return flowers;
    }
    
    //Меню управления букетом
    public static void bouquetControl(Bouquet bouquet){
        System.out.println("ВЫБЕРЕТЕ ПАРАМЕТРЫ БУКЕТА:");
        System.out.println("1- Сортировка по свежести");
        System.out.println("2- Поиск по длине стебля");
        System.out.println("3- Стоимость букета");
        int indexOfMenu = scan.nextInt();
        switch(indexOfMenu){
            case 1:{
                bouquet.freshnessSort();
                bouquet.showFlower();
            }break;
            case 2:{
                sortStalkLength(bouquet);
            }break;
            case 3:{
                System.out.println("СТОИМОСТЬ:");
                bouquet.getPrice();
            }break;
        }
    }
    
    //Сортировка по длине стеблей
    public static void sortStalkLength(Bouquet bouquet){
        System.out.println("ВВЕДИТЕ ДАННЫЕ СТЕБЛЯ");
        double startPoint = scan.nextDouble();
        double finalPoint = scan.nextDouble();
        if((startPoint > 0) || (finalPoint > 25) || (finalPoint > startPoint)){
            bouquet.showStalkLength(startPoint, finalPoint);
        }
    }
    
    
}
