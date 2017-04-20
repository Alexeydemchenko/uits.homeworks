package oop_0.customer;

public class Customer implements Comparable<Customer> {
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String adress;
    private int cardNum;
    private int accountNum;
    
    Customer(){
    
    }
    
    public Customer(int id, String surName, String name, String middleName,
                    String adress, int cardNum, int accountNum){
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.cardNum = cardNum;
        this.accountNum = accountNum;
    }
    
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
    
    public int getCardNum(){
        return cardNum;
    }
    
    public void setCardNum(int cardNum){
        this.cardNum = cardNum;
    }
    
    public int getAccountNum(){
        return accountNum;
    }
    
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }
    
    public String printCustomer(){
        return "Customer: \n" + "id: " + id + "\n" + "Surname: " + surName + "\n" +
                "Name: " + name + "\n" + "MiddleName: " + middleName + "\n" +
                "Adress: " + adress + "\n" + "Card number: " + cardNum + "\n" + 
                "Account number: " + accountNum;
    }
    
    @Override
    public int compareTo(Customer obj){
        return this.surName.compareTo(obj.surName);
    }
}
