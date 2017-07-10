package oop_0_1.flower;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FlowerApp {
    private static Bouquet[] bouquets = new Bouquet[10];
    public static Random rand = new Random();
    public static Scanner scan = new Scanner(System.in);
    public static int countBouquets = 0;
        
    public static void main(String[] args) {
        boolean menuControl = false;
        while(!menuControl){
            System.out.println("МЕНЮ:");
            System.out.println("1 - Создать новый букет");
            System.out.println("2 - Показать созданные букеты");
            System.out.println("3 - ВЫХОД");  
            int indexOfMenu = scan.nextInt();
            switch(indexOfMenu){
                case 1:{
                    createNewBouquet();
                }break;
                case 2:{
                    pickBouquetModule();
                }break;
                case 3:{
                    menuControl = true;
                }break;
            }
        }
    }
    
    //Создать новый букет
    public static void createNewBouquet(){
        boolean isReady = false;
        while(!isReady){
            Bouquet bouquet = new Bouquet();
            bouquet.addFlowers(createFlowersModule());
            System.out.println("ЦЕНА БУКЕТА: ");
            System.out.println(bouquet.getPrice());
            addBouquet(bouquet);
            isReady = true;
        }
    }

    //Добавление букета в массив
    public static void addBouquet(Bouquet bouquet) {
        if (countBouquets >= bouquets.length) {
            int newLength = (bouquets.length * 10);
//            int newLength = (bouquets.length * 3) / 2 + 1;
            bouquets = Arrays.copyOf(bouquets, newLength);
        }
        bouquets[countBouquets++] = bouquet;
    }

    //Создать массив цветов
    public static Flower[] createFlowersModule(){
        System.out.println("================================================");
        System.out.println("Сколько необходимо цветов? Введите кол-во.");
        System.out.println("================================================");
        int numOfFlowers = scan.nextInt();
        Flower[] flowers = new Flower[numOfFlowers];
        for(int i = 0; i < flowers.length; i++){
            flowers[i] = pickFlowerModule(i + 1);
        }
        return flowers;
    }
    
    //Выбрать цветок
    public static Flower pickFlowerModule(int flowerPosition){
        System.out.println("================================================");
        System.out.println("ВЫБЕРЕТЕ ЦВЕТОК:");
        System.out.println("1 - Астры");
        System.out.println("2 - Гиацинт");
        System.out.println("3 - Роза");
        System.out.println("4 - Гвоздика");
        System.out.println("================================================");
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
    
    //Создать конкретный цветок
    public static Flower createSingleFlower(Flower flower){
        flower.setPrice(rand.nextInt(20) + 1);
        flower.setStalkLength(rand.nextInt(25) + 1);
        flower.setFreshness(rand.nextInt(5) + 1);
        return flower;
    }
        
    //Меню для просмотра и выбора соответствующего, 
    //уже созданного букета
    public static void pickBouquetModule(){
        System.out.println("================================================");
        System.out.println("ВЫБЕРЕТЕ НОМЕР БУКЕТА:");
        System.out.println("================================================");
        for(int i = 0; i < countBouquets; i++){
            System.out.println("БУКЕТ №" + (i + 1));
        }
        boolean controller = false;
        int indexInput = scan.nextInt();
        bouquetControlModule(bouquets[indexInput - 1]);
    }
        
    //Меню для управления информацией о букетах
    public static void bouquetControlModule(Bouquet bouquet){
        System.out.println("================================================");
        System.out.println("ВЫБЕРЕТЕ ЖЕЛАЕМУЮ ОПЦИЮ:");
        System.out.println("1 - Сортировка по свежести");
        System.out.println("2 - Поиск по длине стебля");
        System.out.println("3 - Стоимость букета");
        System.out.println("2 - ВЫХОД ИЗ МОДУЛЯ");
        System.out.println("================================================");
        boolean controller = false;
        int indexOfMenu = scan.nextInt();
        while(!controller){
            switch(indexOfMenu){
                case 1:{
                    bouquet.freshnessSort();
                    bouquet.showFlower();
                    controller = true;
                }break;
                case 2:{
                    sortStalkLengthModule(bouquet);
                    controller = true;
                }break;
                case 3:{
                    System.out.println("СТОИМОСТЬ БУКЕТА СОСТАВЛЯЕТ:");
                    System.out.println(bouquet.getPrice());
                    controller = true;
                }break;
                case 4:{
                    controller = true;
                }break;
            }
        }
    }    
    
    //Поиск цветка по длине стебля
    public static void sortStalkLengthModule(Bouquet bouquet){
        System.out.println("================================================");
        System.out.println("ВВЕДИТЕ НЕОБХОДИМЫЙ РАЗМЕР СТЕБЛЯ");
        System.out.println("Размер от:");
        double startPoint = scan.nextDouble();
        System.out.println("Размер до:");
        double finalPoint = scan.nextDouble();
        if((startPoint > 0) || (finalPoint > 25) || (finalPoint > startPoint)){
            bouquet.showStalkLength(startPoint, finalPoint);
        }
        System.out.println("================================================");
    }
}
