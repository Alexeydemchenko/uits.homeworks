package oop_0.student;
import com.sun.media.sound.SoftAbstractResampler;
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
            std.setDateOfBirth(creatDateOfBirth());
            std.setAdress(adress[random.nextInt(6)]);
            std.setFaculty(faculty[random.nextInt(3)]);
            std.setGroup(group[random.nextInt(5)]);
            std.setCourse(course[random.nextInt(6)]);
            std.setPhoneNumber(createPhoneNumber());
            student[i] = std;
        }
    }
    
    public static void main(String[] args){
        createStudents();
        showAllStudents(student);
        System.out.println("=======================================");
        facultyChoose(student , "ФК");
        System.out.println("=======================================");
        facultyAndCourse(student, "ФК", 4);
        System.out.println("=======================================");
        chooseCourse(student, "02");
        System.out.println("=======================================");
        chooseYear(1993);
    }
    
    // Метод для создания студентов.
    public static void showAllStudents(StudentsControl[] student){
        System.out.println("ALL STUDENTS \n");
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i].printStudent() + "\n");
        }
    }
    
    // Метод для создания номера телефона
    public static String createPhoneNumber(){
        return "+380" + (random.nextInt(2) + (random.nextInt(1000000000)));
    }
    
    // Метод для создания даты рождения
    public static String creatDateOfBirth(){
        int month = random.nextInt(12);
        int day;
        String birthday;
            if(month==2){
                day = random.nextInt(28);
            }
            else{
                day = random.nextInt(31);
            }
        int year = random.nextInt(20)+1980;
        return birthday = day + "." + month + "." + year;
    }
    
    //Метод для выведения студентов определенной группы
    public static void facultyChoose(StudentsControl[] student, String faculty){
        System.out.println("СТУДЕНТЫ ВЫБРАННОГО ФАКУЛЬТЕТА " + faculty);
        for(int i = 0; i < student.length; i++){
            if(student[i].getFaculty().equals(faculty)){
                System.out.println(student[i].printStudent() + "\n");
            }
        }
    }
    
    //Метод для выведения студентов определенной группы и курса
    public static void facultyAndCourse(StudentsControl[] student, String faculty,
                                        int course){
        System.out.println("СТУДЕНТЫ ФАКУЛЬТЕТА " + faculty + "\n" +
                            "И КУРСА " + course);
        for(int i = 0; i < student.length; i++){
            if((student[i].getFaculty().equals(faculty)) && 
               (student[i].getCourse() == course)){
                System.out.println(student[i].printStudent()  + "\n");
            }
        }
    }
    
    //Метод для выведения студентов после указанного года
    public static void chooseYear(int year){
        System.out.println("СТУДЕНТЫ ПОСЛЕ УКАЗАННОГО ГОДА " + year);
        for(int i = 0; i < student.length; i++){
            if(student[i].getDateOfBirth().get(Calendar.YEAR) > year){
                System.out.println(student[i].printStudent() + "\n");
            }
        }
    }
    
   //Метод для выведения студентов указанного курса
    public static void chooseCourse(StudentsControl[] student, String group){
        System.out.println("СТУДЕНТЫ ГРУППЫ " + group + "\n");
        for(int i = 0; i < student.length; i++){
            if(student[i].getGroup().equals(group)){
                System.out.println(student[i].printStudent());
            }
        }
    }
}