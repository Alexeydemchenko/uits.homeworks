package oop_0.product;
import java.util.Random;

public class ProductApp {
    public static Random rand = new Random();
        
    public static long randUpc() {
        long randomVal = (long)(Math.random() * 1000000000);
        return randomVal;
    };
//       (int id, String name, long upc, String manufacturer, double price,
//            int shelfLife, int amount)
    public static Product[] product = {
       new Product(0, "Хлеб белый", randUpc(), "Салтовский", 10.30, 5, 5),
       new Product(0, "Хлеб черный", randUpc(), "Салтовский", 9.40, 5, 8),
       new Product(0, "Хлеб белый", randUpc(), "Европейский", 9.80, 5, 7),
       new Product(0, "Хлеб черный", randUpc(), "Европейский", 8.30, 5, 6),
       new Product(0, "Вода", randUpc(), "Миргородская", 8.50, 150, 10),
       new Product(0, "Вода", randUpc(), "Моршинская", 9.80, 150, 10),
       new Product(0, "Чай черный", randUpc(), "Griendfield", 10.30, 240, 6),
       new Product(0, "Чай зеленый", randUpc(), "Griendfield", 9.20, 240, 7),
       new Product(0, "Кофе", randUpc(), "Black Map", 10.30, 190, 3),
       new Product(0, "Сахар", randUpc(), "Тросниковый", 10.30, 350, 5)
    };
           
    public static void main(String[] args){
        System.out.println("\n=============================================\n");
        System.out.println("ВСЕ ПРОДУКТЫ: ");
        System.out.println("\n=============================================\n");
        printProduct();
        System.out.println("\n=============================================\n");
        System.out.println("УКАЗАННЫЕ ПРОДУКТЫ: ");
        System.out.println("\n=============================================\n");
        productName(product, "Вода");
        System.out.println("\n=============================================\n");
        System.out.println("ПРОДУКТЫ, ЦЕНА КОТОРЫХ НЕ ПРЕВЫШАЕТ ЗАДАННУЮ: ");
        System.out.println("\n=============================================\n");
        productPrice("Хлеб черный", 9.50);
        System.out.println("\n=============================================\n");
        System.out.println("ПРОДУКТЫ, СРОК ТОВАРА ВЫШЕ ЗАДАННОГО: ");
        System.out.println("\n=============================================\n");
        productTime(product, 180);
    }
    
    public static void printProduct(){
        for(int i = 0; i < product.length; i++){
            System.out.println(product[i].printProduct());
        }
    }
    
    public static void productName(Product[] product, String name){
        for(int i = 0; i < product.length; i++){
            if(product[i].getName() == name){
                System.out.println(product[i].printProduct());
            }
        }
    }
    
    public static void productPrice(String name, double price){
        for(int i = 0; i < product.length; i++){
            if((product[i].getName() == name) && 
               (product[i].getPrice() < price)){
                System.out.println(product[i].printProduct());
            }
        }
    }
    
    public static void productTime(Product[] product, int time){
        for(int i = 0; i < product.length; i++){
            if(product[i].getShelfLife() > time){
                System.out.println(product[i].printProduct());
            }
        }
    }
    
    
}
