package oop_0.abiturient;
import java.util.Random;

public class AbiturientApp {
    public static Random rand = new Random();
    public static Abiturient[] abiturient;
    
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
    
    public static int[] marks = {
        5,
        4,
        3,
        2
    };
    
    public static void main(String[] args){
        createAbiturient();
        showAbiturient();
        System.out.println("\n==================================\n");
        System.out.println("СТУДЕНТЫ С НИЗКОЙ УСПЕВАЕМОСТЬЮ: ");
        System.out.println("\n==================================\n");
        lowMarks(abiturient, 2);
    }

    
    public static void createAbiturient(){
        abiturient = new Abiturient[10];
        for(int i = 0; i < abiturient.length; i++){
            Abiturient a = new Abiturient();
            a.setId(i);
            a.setSurName(surName[rand.nextInt(surName.length)]);
            a.setName(name[rand.nextInt(name.length)]);
            a.setMiddleName(middleName[rand.nextInt(middleName.length)]);
            a.setAdress(adress[rand.nextInt(adress.length)]);
            a.setPhoneNum("+380" + (rand.nextInt(1000000000)));
            a.setChemistry(marks[rand.nextInt(marks.length)]);
            a.setComputerScience(marks[rand.nextInt(marks.length)]);
            a.setHistory(marks[rand.nextInt(marks.length)]);
            a.setMathematics(marks[rand.nextInt(marks.length)]);
            a.setPhylosophy(marks[rand.nextInt(marks.length)]);
            a.setPhysics(marks[rand.nextInt(marks.length)]);
            abiturient[i] = a;
        }
    }
    
    public static void showAbiturient(){
        for(int i = 0; i < abiturient.length; i++){
            System.out.println(abiturient[i].printAbiturient());
        }
    }
    
    public static void lowMarks(Abiturient[] ab, int limit){
        for(int i = 0; i < abiturient.length; i++){
            if((abiturient[i].getChemistry() == limit) ||
               (abiturient[i].getPhysics() == limit) ||
               (abiturient[i].getHistory() == limit) ||
               (abiturient[i].getComputerScience() == limit) ||
               (abiturient[i].getPhylosophy() == limit)&&
               (abiturient[i].getComputerScience() == limit)){
                    System.out.println(abiturient[i].printAbiturient());
            }
        }
    }
}
