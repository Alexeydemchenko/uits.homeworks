package oop_0.phone;
import java.util.Random;
import java.util.Arrays;

public class PhoneApp {
    public static Random rand = new Random();
    static PhoneSubscriber[] phoneSub;
    
    public static String[] surName = {
        "Иванов",
        "Петров",
        "Сидоров",
        "Васильев",
        "Дмитриевский",
        "Скворцов"
    };
    
    public static String[] name = {
        "Андрей",
        "Иван",
        "Дмитрий",
        "Сергей",
        "Антон",
        "Владимир"
    };
    
    public static String[] middleName = {
        "Владимирович",
        "Петрович",
        "Александрович",
        "Васильевич",
        "Николаевич",
        "Сергеевич"
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
        createSubscriber();
        showSubscriber();
        System.out.println("\n==================================\n");
        System.out.println("ВРЕМЯ ВНУТРИГОРОДСКИХ ЗВОНКОВ ПРЕВЫШАЕТ ЗАДАННОЕ: ");
        System.out.println("\n==================================\n");
        showCityCalls(phoneSub, 70);
        System.out.println("\n==================================\n");
        System.out.println("АБОНЕНТЫ, КОТОРЫЕ ПОЛЬЗОВАЛИСЬ МЕЖДУНАРОДНОЙ СВЯЗЬЮ: ");
        System.out.println("\n==================================\n");
        showInterCityCalls(phoneSub);
        System.out.println("\n==================================\n");
        System.out.println("СОРТИРОВКА В АЛФАВИТНОМ ПОРЯДКЕ: ");
        System.out.println("\n==================================\n");
        Arrays.sort(phoneSub);
        showSubscriber();
    }
    
    public static void createSubscriber(){
        phoneSub = new PhoneSubscriber[10];
        for(int i = 0; i < phoneSub.length; i++){
            PhoneSubscriber ph = new PhoneSubscriber();
            ph.setId(i);
            ph.setSurName(surName[rand.nextInt(surName.length)]);
            ph.setName(name[rand.nextInt(name.length)]);
            ph.setMiddleName(middleName[rand.nextInt(middleName.length)]);
            ph.setAdress(adress[rand.nextInt(adress.length)]);
            ph.setCardNum(rand.nextInt(1000000));
            ph.setDebit(rand.nextInt(1000));
            ph.setCredit(rand.nextInt(1000));
            ph.setCityCalls(rand.nextInt(100));
            ph.setInterCityCalls(rand.nextInt(100));
            phoneSub[i] = ph;
        }
    }
    
    public static void showSubscriber(){
        for(int i = 0; i < phoneSub.length; i++){
            System.out.println(phoneSub[i].printPhoneSubscriber());
        }
    }
    
    public static void showCityCalls(PhoneSubscriber[] phoneSub, int limit){
        for(int i = 0; i < phoneSub.length; i++){
            if(phoneSub[i].getCityCalls() > limit){
                System.out.println(phoneSub[i].printPhoneSubscriber());
            }
        }
    }
    
    public static void showInterCityCalls(PhoneSubscriber[] phoneSub){
        for(int i = 0; i < phoneSub.length; i++){
            if(phoneSub[i].getInterCityCalls() > 0){
                System.out.println(phoneSub[i].printPhoneSubscriber());
            }
        }
    }
}
