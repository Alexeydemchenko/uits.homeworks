package oop;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class StudentsControl {
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private Date birthday;
    private String adress;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    StudentsControl(){
    }
    
    public StudentsControl(int id, String surName, String name, String middleName,
                            String birthday, String adress, String phoneNumber,
                            String faculty, int course, String group){
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            this.birthday = sdf.parse(birthday);
        }catch(ParseException e){
            e.printStackTrace();
        }
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.adress = faculty;
        this.course = course;
        this.group = group;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    
    public void setSurName(String surName){
        this.surName = surName;
    }
    
    public String getSurName(){
        return surName;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    
    public String getMiddleName(){
        return middleName;
    }
    
    public void setDateOfBirth(String birthday){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            this.birthday = sdf.parse(birthday);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
    
    public String getDateOfBirth(){
        return dateFormat.format(birthday);
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    
    public String getFaculty(){
        return faculty;
    }
    
    public void setCourse(int course){
        this.course = course;
    }
    
    public int getCourse(){
        return course;
    }
    
    public void setGroup(String group){
        this.group = group;
    }
    
    public String getGroup(){
        return group;
    }
    
   
    public String printStudent(){
        return ("Фамилия: " + surName + "\n" + "Имя: " + name + "\n" + 
                "Отчество: " + middleName + "\n" + "ID: " + id + "\n" + 
                "Дата рождения: " + dateFormat.format(birthday) + "\n" + "Адрес: " + adress + "\n"
                + "Факультет: " + faculty + "\n" + "Группа: " + group + "\n" +
                "Курс: " + course + "\n" + "Телефон: " + phoneNumber);
    }
    
}