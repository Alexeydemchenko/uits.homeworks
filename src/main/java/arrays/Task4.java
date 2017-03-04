package arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args){
        
        System.out.println("Массив случайных значений ");
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nСортировка массива");
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nСортировка в обратную сторону");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        System.out.println("Четные элементы массива");
//        
//                    if(arr[i] % 2 == 0){
//                System.out.println(i + " Четное число");
//            }else if(arr[i] % 2 != 0){
//                System.out.println(i);
//            }
        
    }
   
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
    

