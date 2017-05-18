package oop_0.abiturient;

public class Abiturient {
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String adress;
    private String phoneNum;
    private int physics;
    private int chemistry;
    private int mathematics;
    private int computerScience;
    private int history;
    private int phylosophy;
    
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

//--------------------------SUBJECTS AND MARKS---------------------------------
    public int getPhysics(){
        return physics;
    }
    
    public void setPhysics(int physics){
        this.physics = physics;
    }   

    public int getChemistry(){
        return chemistry;
    }
    
    public void setChemistry(int chemistry){
        this.chemistry = chemistry;
    }
    
    public int getMathematics(){
        return mathematics;
    }
    
    public void setMathematics(int mathematics){
        this.mathematics = mathematics;
    }
    
    public int getComputerScience(){
        return computerScience;
    }
    
    public void setComputerScience(int computerScience){
        this.computerScience = computerScience;
    }
    
    public int getHistory(){
        return history;
    }
    
    public void setHistory(int history){
        this.history = history;
    }
    
    public int getPhylosophy(){
        return phylosophy;
    }
    
    public void setPhylosophy(int phylosophy){
        this.phylosophy = phylosophy;
    }
    
    public int getMarksSum(){
        return physics + chemistry + mathematics + computerScience + history + 
               phylosophy;
    }
    //-------------------------------------------------------------------------

    public Abiturient(){

    }
    
    public Abiturient(int id, String surName, String name, String middleName,
                      String adress, String phoneNum, int physics, int chemistry,
                      int mathematics, int computerScience, int history,
                      int phylosophy){
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phoneNum = phoneNum;
        this.physics = physics;
        this.chemistry = chemistry;
        this.mathematics = mathematics;
        this.computerScience = computerScience;
        this.history = history;
        this.phylosophy = phylosophy;
    }
    
    public String printAbiturient(){
        return "=============================================================\n"
                + "Abiturient: \n" + "id: " + id + "\nSurname: " + surName +
                "\nName: " + name + "\nMiddle name: " + middleName + 
                "\nAdress: " + adress + "\nPhone number: " + phoneNum +
                "\n---------------------SUBJECTS AND MARKS---------------------\n" + 
                "Physics: " + physics + "\nChemistry: " + chemistry +
                "\nMathematics: " + mathematics + "\nComputer Science: " + 
                computerScience + "\nHistory: " + history + "\nPhylosophy: " +
                phylosophy + 
                "\n=============================================================";
    }
}
