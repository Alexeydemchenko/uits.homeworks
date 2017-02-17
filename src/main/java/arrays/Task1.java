package arrays;

public class Task1 {
    public static void main(String[] args){
        int mult2 = 0;
        int mult3 = 0;
        int mult5 = 0;
        int mult7 = 0;
        
        for(int i = 0; i <= 100; i++){
            if(i == 0){
                System.out.println("Ноль кратен нулю");
            }else if(i % 2 == 0){
                System.out.println("Кратно 2-м: " + i);
                mult2 = mult2 + i;
            }else if(i % 3 == 0){
                System.out.println("Кратно 3-м: " + i);
                mult3 = mult3 + i;
            }else if(i % 5 == 0){
                System.out.println("Кратно 5-м: " + i);
                mult5 = mult5 + i;
            }else if(i % 7 == 0){
                System.out.println("Кратно 7-ми: " + i);
                mult7 = mult7 + i;
            }else{
                System.out.println(i);
            }
        }
            System.out.println();
            System.out.println("Сумма чисел кратных двум: " + mult2);
            System.out.println("Сумма чисел кратных трем: " + mult3);
            System.out.println("Сумма чисел кратных пяти: " + mult5);
            System.out.println("Сумма чисел кратных семи: " + mult7);
    }
}
