package oop;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class AllStudents{
    public static StudentsControl[] student;
    public static Random random = new Random();
    
    private static String[] name = {
        "Андрей",
        "Владимир",
        "Александр",
        "Дмитрий",
        "Сергей",
        "Артем"
    };
    
    private static String[] surName = {
        "Васильев",
        "Иванов",
        "Петров",
        "Сидоров",
        "Шульга",
        "Штерн"
    };
    
    private static String[] middleName = {
        "Васильевич",
        "Владимирович",
        "Иванович",
        "Александрович",
        "Дмитревич",
        "Адамович"
    };
    
    private static String[] adress = {
        "ул.Артема, 14",
        "ул.Бучмы, 12",
        "пр.Науки, 18",
        "ул.Пушкинская, 21",
        "ул.Мазепы, 34",
        "пр.Московский, 7"
    };
    
    private static String[] faculty = {
        "ФК",
        "ИФ",
        "ЭМ"
    };
    
    private static String[] group = {
        "12",
        "08",
        "02",
        "13",
        "24"
    };
    
    private static int[] course = {
        1,
        2,
        3,
        4,
        5,
        6
    };
    
    public static void createStudents(){
        student = new StudentsControl[10];
        for(int i = 0; i < student.length; i++){
            StudentsControl std = new StudentsControl();
            std.setId(i);
            std.setSurName(surName[random.nextInt(6)]);
            std.setName(name[random.nextInt(6)]);
            std.setMiddleName(middleName[random.nextInt(6)]);
            std.setAdress(adress[random.nextInt(6)]);
            std.setFaculty(faculty[random.nextInt(3)]);
            std.setGroup(group[random.nextInt(5)]);
            std.setCourse(course[random.nextInt(6)]);
            student[i] = std;
        }
    }
    
    public static void main(String[] args){
        createStudents();
        showAllStudents(student);
        
    }
    
    public static void showAllStudents(StudentsControl[] student){
        System.out.println("ALL STUDENTS \n");
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i].printStudent() + "\n");
        }
    }
    
}
