package basitypes;

import java.util.Scanner;
import java.lang.*;

public class Task2{
    public static void main(String[] args){
        while(true){
            menu();
            int op = readMenuValue();
            if(op > 0 && op < 8){
                mathOper(op);
            }else{
                break;
            }
        }
         System.out.println("Bye");
    }
    
    static void menu(){
        System.out.println("1. Длина окружности" + "\t" + " | " + "\t" +"2. Площадь окружности");
        System.out.println("3. Площадь кольца" + "\t" + " | " + "\t" + "4. Периметр треугольника");
        System.out.println("5. Площадь треугольника" + "\t" + " | " + "\t" + "6. Периметр прямоугольника");
        System.out.println("7. Площадь прямоугольника" + "| " +  "\t" + "8. Выход");
    }
    
    static void mathOper(int op){
        switch(op){
            case 1:{
                circleLength();
            }break;
            case 2:{
                circleSquare();
            }break;
            case 3:{
                ringSquare();
            }break;
            case 4:{
                trianglePerimetr();
            }break;
            case 5:{
                triangleSquare();
            }break;
            case 6:{
                rectanglePerimetr();
            }break;
            case 7:{
                rectangleSuare();
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
        Scanner in = new Scanner(System.in);
        String result = in.next();
        double x = Double.parseDouble(result);
        return x;
    }
    
    static void circleLength(){
        System.out.println("Вы выбрали длину окружности:");
        System.out.println("Введите радиус окружности:");
        double circleRad = readValue();
        if(circleRad > 0){
            double circleLen = 2.00 * Math.PI * circleRad;
            System.out.println("Длина окружности равна " + circleLen);
            System.out.println();
        }else{
            System.out.println("Радиус введен некорректно");
        }
    }
    
    static void circleSquare(){
        System.out.println("Вы выбрали площадь окружности:");
        System.out.println("Введите радиус окружности:");
        double circleRad = readValue();
        if(circleRad > 0){
            double circleSqr = Math.PI * Math.pow(circleRad , 2);
            System.out.println("Площадь окружности равна " + circleSqr);
            System.out.println();
        }else{
            System.out.println("Радиус введен некорректно");
        }
    }

    static void ringSquare(){
        System.out.println("Вы выбрали площадь кольца:");
        System.out.println("Введите внешний радиус кольца:");
        double externalRad = readValue();
        System.out.println("Введите внутренний радиус кольца:");
        double interiorRad = readValue();
        if(externalRad >= interiorRad){
            double ringSqr = Math.PI * ((Math.pow(externalRad , 2)) - (Math.pow(interiorRad , 2)));
            System.out.println("Площадь кольца равна " + ringSqr);
            System.out.println();
        } else {
            System.out.println("Внешний радиус меньше чем внутренний");
        }
    }
    
    static void trianglePerimetr(){
        System.out.println("Вы выбрали периметр треугольника:");
        System.out.println("Введите сторону a:");
        double sideA = readValue();
        System.out.println("Введите сторону b:");
        double sideB = readValue();
        if(sideA > 0 && sideB > 0){
            double cathetusC = Math.sqrt(Math.pow(sideA , 2)) + Math.sqrt(Math.pow(sideB , 2));
            double perimetr = sideA + sideB + cathetusC;
            System.out.println("Периметр равен: " + perimetr);
            System.out.println();
        }else{
            System.out.println("Сторонны введены некорректно");
        } 
    }
    
    static void triangleSquare(){
        System.out.println("Вы выбрали площадь треугольника:");
        System.out.println("Введите сторону a:");
        double sideA = readValue();
        System.out.println("Введите высоту h:");
        double height = readValue();
        if(sideA > 0 && height > 0){
            double triangleSqr = 0.5 * sideA * height;
            System.out.println("Площадь треугольника равна " + triangleSqr);
            System.out.println();
        }else{
            System.out.println("Сторонна или высота введена некорректно");
        } 
    }
    
    static void rectanglePerimetr(){
        System.out.println("Вы выбрали периметр прямоугольника:");
        System.out.println("Введите сторону a:");
        double sideAB = readValue();
        double sideBC = readValue();
        if(sideAB > 0 && sideBC > 0){
            double perimetr = (sideAB + sideBC) * 2.00;
            System.out.println("Периметр прямоугольника равен " + perimetr);
            System.out.println();
        }else{
            System.out.println("Сторонны введены некорректно");
        }
    }
    
    static void rectangleSuare(){
        System.out.println("Вы выбрали площадь прямоугольника:");
        System.out.println("Введите длину a:");
        double lengthA = readValue();
        System.out.println("Введите ширину b:");
        double widthB = readValue();
        if(lengthA > 0 && widthB > 0){
            double rectSquare = lengthA * widthB;
            System.out.println("Площадь прямоугольника равна " + rectSquare);
            System.out.println();
        }else{
            System.out.println("Сторонны введены некорректно");
        }
    }
}
