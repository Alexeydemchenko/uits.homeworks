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
   
   public int getMedicalCardNum(){
       return medicalCardNum;
   }
   
   public void setMedicalCardNum(int medicalCardNum){
       this.medicalCardNum = medicalCardNum;
   }
   
   public String getDiagnosis(){
       return diagnosis;
   }
   
   public void setDiagnosis(String diagnosis){
       this.diagnosis = diagnosis;
   }
   
   public Patient(){
   
   }
   
   public Patient(int id, String surName, String name, String middleName, String adress,
                  String phoneNum, int medicalCardNum, String diagnosis){
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phoneNum = phoneNum;
        this.medicalCardNum = medicalCardNum;
        this.diagnosis = diagnosis;
   }
   
   public String printPatient(){
       return "Patient:\n" + "id: " + id + "\n" + "Surname: " + surName + "\n" +
               "Middle name: " + middleName + "\n" + "Adress: " + adress + "\n" +
               "Phone number: " + phoneNum + "\n" + "Medical card number: " + 
               medicalCardNum + "\n" + "Diagnosis: " + diagnosis + "\n";
   }
   
}
