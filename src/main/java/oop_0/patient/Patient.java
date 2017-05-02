package oop_0.patient;

public class Patient {
   private int id;
   private String surName;
   private String name;
   private String middleName;
   private String adress;
   private String phoneNum;
   private int medicalCardNum;
   private String diagnosis;
   
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
}
