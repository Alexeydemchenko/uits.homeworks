package oop_0.customer;
import com.sun.media.sound.SoftAbstractResampler;
import java.util.Random;
import java.util.Arrays;

public class CustomerApp {
    public static Random rand = new Random();
    public static Customer[] customer;
        
    public static String[] surName = {
        "Иванов",
        "Петров",
        "Сидоров",
        "Стругацкий",
        "Васильев",
        "Скворцов"
    };
    
    public static String[] name = {
        "Василий",
        "Алексей",
        "Иван",
        "Петр",
        "Дмитрий",
        "Михаил"
    };
    
    public static String[] middleName = {
        "Иванович",
        "Владимирович",
        "Петрович",
        "Алексеевич",
        "Васильевич",
        "Дмитриевич"
    };
    
    public static String[] adress = {
        "г.Харьков, пр.Науки, 24",
        "г.Львов, ул.Галицкая, 18",
        "г.Львов, ул.Левицкого, 12",
        "г.Харьков, ул.Бучмы, 8",
        "г.Киев, ул.Академика Стражеско, 9",
        "г.Киев, ул.Лаврская, 19"
    };
    
    public static void main(String[] args){
        createCustomer();
        printCustomer(customer);
        System.out.println("\n==================================\n");
        System.out.println("СОРТИРОВКА В АЛФАВИТНОМ ПОРЯДКЕ: ");
        System.out.println("\n==================================\n");
        Arrays.sort(customer);
        printCustomer(customer);
    }
    
   public static void createCustomer(){
       customer = new Customer[10];
       for(int i = 0; i < customer.length; i++){
           Customer c = new Customer();
           c.setId(i);
           c.setSurName(surName[rand.nextInt(surName.length)]);
           c.setName(name[rand.nextInt(name.length)]);
           c.setMiddleName(middleName[rand.nextInt(middleName.length)]);
           c.setAdress(adress[rand.nextInt(adress.length)]);
           c.setCardNum(rand.nextInt(1000000));
           c.setAccountNum(rand.nextInt(1000000));
           customer[i] = c;
       }
   }
   
   public static void printCustomer(Customer[] customer){
       for(int i = 0; i < customer.length; i++){
           System.out.println(customer[i].printCustomer() + "\n");
       }
   }
}
