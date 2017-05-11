package oop_0.phone;

public class PhoneSubscriber implements Comparable<PhoneSubscriber> {
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String adress;
    private int cardNum;
    private int debit;
    private int credit;
    private int cityCalls;
    private int interCityCalls;
    
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
    
    public int getDebit(){
        return debit;
    }
    
    public void setDebit(int debit){
        this.debit = debit;
    }
    
    public int getCredit(){
        return credit;
    }
    
    public void setCredit(int credit){
        this.credit = credit;
    }
    
    public int getCityCalls(){
        return cityCalls;
    }
    
    public void setCityCalls(int cityCalls){
        this.cityCalls = cityCalls;
    }
    
    public int getInterCityCalls(){
        return interCityCalls;
    }
    
    public void setInterCityCalls(int interCityCalls){
        this.interCityCalls = interCityCalls;
    }
    
    public PhoneSubscriber(){
    
    }
    
    public PhoneSubscriber(int id, String surName, String name, String middleName, 
                           String adress, int cardNum, int debit, int credit,
                           int cityCalls, int interCityCalls){
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.cardNum = cardNum;
        this.debit = debit;
        this.credit = credit;
        this.cityCalls = cityCalls;
        this.interCityCalls = interCityCalls;
    }
    
    public String printPhoneSubscriber(){
        return "Phone subscriber: \n" + "id: " + id + "\n" + "Surname: " + surName
                + "\n" + "Name: " + name + "\n" + "Middle name: " + middleName +
                "\n" + "Adress: " + adress + "\n" + "Card number: " + 
                cardNum + "\n" + "Debit: " + debit + "\n" + "Credit: " + 
                credit + "\n" + "City calls: " + cityCalls + "\n" + 
                "Intercity calls: " + interCityCalls + "\n";
    }
    
    @Override
    public int compareTo(PhoneSubscriber obj){
        return this.surName.compareTo(obj.surName);
    } 
}
