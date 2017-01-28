package basitypes;

import java.util.Scanner;
import java.lang.*;

public class Task3 {
    public static void main(String[] args){
        //cylinderVolume();
        //hollowCylinderVolume();
        hollowCylinderSideSquare();
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
        }else{
            System.out.println("Параметры введены некорректно");
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
        }else{
            System.out.println("Параметры введены некорректно");
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
        }else{
            System.out.println("Параметры введены некорректно");
        }
    }
}
