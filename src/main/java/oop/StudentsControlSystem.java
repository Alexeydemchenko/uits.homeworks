package oop;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
public class StudentsControlSystem {
    private int id;
    private String name;
    private String surName;
    private String middleName;
    private Date dateOfBirth;
    private String adress;
    private int tel;
    private String group;
    private String faculty;
    private int course;
    
    // get and set id
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    // get and set name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    // get and set surname
    public String surName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    
    // get and set middlename
    public String middleName(){
        return middleName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    
    // get and set date
    public void getDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void seDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    // get and set adress
    public String getAdress(){
        return adress;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    // get and set tel
    public int getTel(){
        return tel;
    }
    public void setTel(int tel){
        this.tel = tel;
    }
    
    // get and set group
    public String getGroup(){
        return group; 
    }
    public void setGroup(String group){
        this.group = group;
    }
    
    // get and set faculty
    public String getFaculty(){
        return faculty;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    
    // get and set course
    public int getCourse(){
        return course;
    }
    public void setCourse(int course){
        this.course = course;
    }
    
    public String toString(){
        return ("Фамилия: " + surName + "\n" + "Имя: " + name + "\n" + 
                "Отчество: " + middleName + "\n" + "Id: " + id + "\n" + 
                "Дата рождения: " + dateOfBirth + "\n" + "Адрес: " + adress + "\n" 
                + "Факультет: " + faculty + "\n" + "Группа: " + group + "\n" +
                "Телефон: " + tel);
                
    }
    public static void main(String[] args) {
        StudentsControlSystem[] std = new StudentsControlSystem[5];
        std[0] = new StudentsControlSystem();
        std[0].setId(1);
        std[0].setName("Василий");
        std[0].setSurName("Иванов");
        std[0].setMiddleName("Петрович");
        Calendar c = Calendar.getInstance();
        c.set(1993, 8, 25);
        std[0].getDateOfBirth(c.getTime());
        std[0].setAdress("Miami");
        std[0].setFaculty("Computer Science");
        std[0].setGroup("JV - 1614");
        std[0].setCourse(4);
        std[0].setTel(480949234);
        System.out.println(std[0].toString());
        
        std[1] = new StudentsControlSystem();
        std[1].setId(2);
        std[1].setName("Дмитрий");
        std[1].setSurName("Петров");
        std[1].setMiddleName("Константиновис");
        Calendar c1 = Calendar.getInstance();
        c.set(1994, 12, 14);
        std[1].getDateOfBirth(c.getTime());
        std[1].setAdress("LA");
        std[1].setFaculty("Mechanical Engineering");
        std[1].setGroup("ME - 1213");
        std[1].setCourse(3);
        std[1].setTel(245893899);
        System.out.println(std[1].toString());
        
        std[2] = new StudentsControlSystem();
        std[2].setId(3);
        std[2].setName("Олег");
        std[2].setSurName("Соколов");
        std[2].setMiddleName("Андреевич");
        Calendar c2 = Calendar.getInstance();
        c.set(1991, 9, 9);
        std[2].getDateOfBirth(c.getTime());
        std[2].setAdress("NY");
        std[2].setFaculty("Psychology");
        std[2].setGroup("P - 0911");
        std[2].setCourse(6);
        std[2].setTel(1231312313);
        System.out.println(std[2].toString());
        
        std[3] = new StudentsControlSystem();
        std[3].setId(4);
        std[3].setName("Владимир");
        std[3].setSurName("Олейников");
        std[3].setMiddleName("Вячеславович");
        Calendar c3 = Calendar.getInstance();
        c.set(1992, 29, 23);
        std[3].getDateOfBirth(c.getTime());
        std[3].setAdress("DC");
        std[3].setFaculty("Sociology");
        std[3].setGroup("SC - 1012");
        std[3].setCourse(6);
        std[3].setTel(551312313);
        System.out.println(std[2].toString());
        
        std[4] = new StudentsControlSystem();
        std[4].setId(1);
        std[4].setName("Василий");
        std[4].setSurName("Иванов");
        std[4].setMiddleName("Петрович");
        Calendar c4 = Calendar.getInstance();
        c.set(1995, 9, 12);
        std[4].getDateOfBirth(c.getTime());
        std[4].setAdress("Alabama");
        std[4].setFaculty("Computer Science");
        std[4].setGroup("JV - 1614");
        std[4].setCourse(4);
        std[4].setTel(481239234);
        System.out.println(std[4].toString());
    }
}
