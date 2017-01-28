package basitypes;

import java.util.Scanner;
import java.lang.*;

public class Task3 {
    public static void main(String[] args){
        while(true){
            menu();
            int op = readMenuValue();
            if(op > 0 && op < 10){
                mathOper(op);
            }else{
                break;
            }
        }
         System.out.println("Bye");
 }

    static void menu(){
        System.out.println("1. Объем цилиндра");
        System.out.println("2. объем полного цилиндра");
        System.out.println("3. площадь боковой поверхности цилиндра");
        System.out.println("4. объем шара");
        System.out.println("5. площадь поверхности шара");
        System.out.println("6. площадь параллелепипеда");
        System.out.println("7. объем параллелепипеда");
        System.out.println("8. объем тетраэдра");
        System.out.println("9. площадь тетраэдра");
        System.out.println("10. Выход");

    }
    
    static void mathOper(int op){
        switch(op){
            case 1:{
            }break;
            case 2:{
                hollowCylinderVolume();
            }break;
            case 3:{
                hollowCylinderSideSquare();
            }break;
            case 4:{
                ballVolume();
            }break;
            case 5:{
                ballSurfaceSquare();
            }break;
            case 6:{
                paralSquare();
            }break;
            case 7:{
                paralVolume();
            }break;
            case 8:{
                tetraVolume();
            }break;
            case 9:{
                tetraSquare();
            }break;
        }
    }
        
    static int readMenuValue(){
        Scanner sc = new Scanner(System.in);
        String result = sc.next();
        int x = Integer.parseInt(result);
        return x;
    }
    
    static double readValue(){
        Scanner sc = new Scanner(System.in);
        String result = sc.next();
        double x = Double.parseDouble(result);
        return x;
    }
    
    static void cylinderVolume(){
        System.out.println("Вы выбрали объем цилиндра");
        System.out.println("Введите радиус:");
        double radius = readValue();
        System.out.println("Введите высоту:");
        double height = readValue();
        if(radius > 0 && height > 0){
            double volume = Math.PI * Math.pow(radius , 2) * height;
            System.out.println("Объем цилиндра равен " + volume);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }
    
    static void hollowCylinderVolume(){
        System.out.println("Вы выбрали объем полного цилиндра");
        System.out.println("Введите внешний радиус:");
        double radiusR2 = readValue();
        System.out.println("Введите внутренний радиус:");
        double radiusR1 = readValue();
        System.out.println("Введите высоту:");
        double height = readValue();
        if((radiusR2 > 0 && radiusR1 > 0 && height > 0) && (radiusR2 > radiusR1)){
            double volume = Math.PI * height * (Math.pow(radiusR2 , 2) - Math.pow(radiusR1 , 2));
            System.out.println("Объем цилиндра полного равен " + volume);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }
    
    static void hollowCylinderSideSquare(){
        System.out.println("Вы выбрали площадь боковой поверхности цилиндра");
        System.out.println("Введите внешний радиус:");
        double radiusR2 = readValue();
        System.out.println("Введите внутренний радиус:");
        double radiusR1 = readValue();
        System.out.println("Введите высоту:");
        double height = readValue();
        if((radiusR2 > 0 && radiusR1 > 0 && height > 0) && (radiusR2 > radiusR1)){
            double square = 2.00 * Math.PI * height * (radiusR1 + radiusR2);
            System.out.println("Площадь боковой поверхности равна " + square);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }
    
    static void ballVolume(){
        System.out.println("Вы выбрали объем шара");
        System.out.println("Введите радиус:");
        double radius = readValue();
        System.out.println("Введите высоту:");
        double height = readValue();
        if(radius > 0 && height > 0){
            double volume = 4.0 * Math.PI * (Math.pow(radius , 3)/ 3.0);
            System.out.println("Объем шара равен " + volume);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }
    
    static void ballSurfaceSquare(){
        System.out.println("Вы выбрали площадь поверхности шара");
        System.out.println("Введите радиус:");
        double radius = readValue();
        System.out.println("Введите высоту:");
        double height = readValue();
        if(radius > 0 && height > 0){
            double square = 4.0 * Math.PI * Math.pow(radius , 2);
            System.out.println("Площадь поверхности шара равна " + square);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }
    
    static void paralSquare(){
        System.out.println("Вы выбрали площадь параллелепипеда");
        System.out.println("Введите сторону a:");
        double aSide = readValue();
        System.out.println("Введите сторону b:");
        double bSide = readValue();
        System.out.println("Введите сторону c:");
        double cSide = readValue();
        if(aSide > 0 && bSide > 0 && cSide > 0){
            double sqaure = 2.0 * ((aSide * bSide) + (bSide * cSide) + (aSide * cSide));
            System.out.println("Площадь параллелепипеда равна " + sqaure);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }
    
    static void paralVolume(){
        System.out.println("Вы выбрали объем параллелепипеда");
        System.out.println("Введите сторону a:");
        double aSide = readValue();
        System.out.println("Введите сторону b:");
        double bSide = readValue();
        System.out.println("Введите сторону c:");
        double cSide = readValue();
        if(aSide > 0 && bSide > 0 && cSide > 0){
            double volume = aSide * bSide* cSide;
            System.out.println("Объем параллелепипеда равен " + volume);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }
    
    static void tetraVolume(){
        System.out.println("Вы выбрали объем тетраэдра");
        System.out.println("Введите ребро a:");
        double aEdge = readValue();
        if(aEdge > 0){
            double volume = (Math.sqrt(2.0) / 12.0) * aEdge;
            System.out.println("Объем тетраэдра равен " + volume);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }

    static void tetraSquare(){
        System.out.println("Вы выбрали площадь тетраэдра");
        System.out.println("Введите ребро a:");
        double aEdge = readValue();
        if(aEdge > 0){
            double volume = Math.pow(aEdge , 2) * Math.sqrt(3);
            System.out.println("Площадь тетраэдра равна " + volume);
            System.out.println();
        }else{
            System.out.println("Параметры введены некорректно");
            System.out.println();
        }
    }
}
