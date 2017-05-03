package oop_0.abiturient;

public class Abiturient {
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String adress;
    private String phoneNum;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getSurName(){
        return surName;
    }
    
    public void setSurName(String surName){
        this.surName = surName;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getMiddleName(){
        return middleName;
    }
    
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getPhoneNum(){
        return phoneNum;
    }
    
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    
    public Abiturient(){

    }
    
    public Abiturient(int id, String surName, String name, String middleName,
                      String adress, String phoneNum){
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phoneNum = phoneNum;
    }
    
    public static String printAbiturient(){
        return ;
    }
}
