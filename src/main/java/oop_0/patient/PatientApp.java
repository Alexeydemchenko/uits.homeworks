package oop_0.patient;
import java.util.Random;

public class PatientApp {
    public static Patient[] patient;
    public static Random rand = new Random();
    
    public static String[] surName = {
        "Иванов",
        "Петров",
        "Сидоров",
        "Васильев",
        "Дмитриевский",
        "Скворцов"
    };
    
    public static String[] name = {
        "Андрей",
        "Иван",
        "Дмитрий",
        "Сергей",
        "Антон",
        "Владимир"
    };
    
    public static String[] middleName = {
        "Владимирович",
        "Петрович",
        "Александрович",
        "Васильевич",
        "Николаевич",
        "Сергеевич"
    };
    
    public static String[] adress = {
        "г.Харьков, пр.Науки, 24",
        "г.Львов, ул.Галицкая, 18",
        "г.Львов, ул.Левицкого, 12",
        "г.Харьков, ул.Бучмы, 8",
        "г.Киев, ул.Академика Стражеско, 9",
        "г.Киев, ул.Лаврская, 19"
    };
    
    public static String[] diagnosis = {
        "Растяжение связок",
        "Эндартериит",
        "Флебит",
        "Неврит",
        "Артрит",
        "Подагра"
    };
    
    public static void main(String[] args){
        createPatient();
        showPatient();
        System.out.println("\n==================================\n");
        System.out.println("ПАЦИЕНТЫ С ОПРЕДЕЛЕННЫМ ДИАГНОЗОМ (НЕВРИТ): ");
        System.out.println("\n==================================\n");
        compareDiagnoses(patient, "Неврит");
        System.out.println("\n==================================\n");
        System.out.println("НОМЕРА КАРТ В ОПРЕДЕЛЕННОМ ПРОМЕЖУТКЕ: ");
        System.out.println("\n==================================\n");
        medCardGap(patient, 20000, 40000);
    }
    
    public static void createPatient(){
        patient = new Patient[10];
        for(int i = 0; i < patient.length; i++){
            Patient p = new Patient();
            p.setId(i);
            p.setSurName(surName[rand.nextInt(surName.length)]);
            p.setName(name[rand.nextInt(name.length)]);
            p.setMiddleName(middleName[rand.nextInt(middleName.length)]);
            p.setAdress(adress[rand.nextInt(adress.length)]);
            p.setPhoneNum("+380" + (rand.nextInt(1000000000)));
            p.setMedicalCardNum(rand.nextInt(100000));
            p.setDiagnosis(diagnosis[rand.nextInt(diagnosis.length)]);
            patient[i] = p;
        }
    }
    
    public static void showPatient(){
        for(int i = 0; i < patient.length; i++){
            System.out.println(patient[i].printPatient());
        }
    }
    
    public static void compareDiagnoses(Patient[] patient, String diagnosis){
        for(int i = 0; i < patient.length; i++){
            if(patient[i].getDiagnosis().equals(diagnosis)){
                System.out.println(patient[i].printPatient());
            }
        }
    }
    
    public static void medCardGap(Patient[] patient, int startPoint, int endPoint){
        for(int i = 0; i < patient.length; i++){
            if(patient[i].getMedicalCardNum() > startPoint &&
               patient[i].getMedicalCardNum() < endPoint){
                System.out.println(patient[i].printPatient());
            }
        }
    }
}
