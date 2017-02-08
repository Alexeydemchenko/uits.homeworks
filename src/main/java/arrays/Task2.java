package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){
        System.out.println("Введите число в диапазоне от 0 до 99");
        int readNum = scanNum();
        if(readNum >= 0 && readNum <= 99){
            numToWord(readNum);
        }else{
            System.out.println("Вне диапазона");
        }
    }
    
    static int scanNum(){
        Scanner sc = new Scanner(System.in);
        String result = sc.next();
        int x = Integer.parseInt(result);
        return x;
    }
    
    static void numToWord(int num){
        String[] ones = {
                        " ",
                        "один",
                        "два",
                        "три",
                        "четыре",
                        "пять",
                        "шесть",
                        "семь",
                        "восемь",
                        "девять",
                        "десять",
                        "одиннадцать",
                        "двеннадцать",
                        "тринадцать",
                        "четырнадцать",
                        "пятнадцать",
                        "шестнадцать",
                        "семнадцать",
                        "восемнадцать",
                        "девятнадцать"
                        };
        
        String[] tens = {
                        " ",
                        " ",
                        "двадцать",
                        "тридцать",
                        "сорок",
                        "пятьдесят",
                        "шестьдесят",
                        "семдесят",
                        "восемдесят",
                        "девяносто"
                        };
        if(num > 19){
            System.out.println(tens[num / 10] + " " + ones[num % 10]);
        }else if(num == 0){
            System.out.println("ноль");
        }else{
            System.out.println(ones[num]);
        }
    }
}
