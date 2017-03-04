package arrays;
import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите размер теругольного массива");
        triangle(scanner());
        System.out.println("Введите размер перевернутого массива");
        revTriangle(scanner());
    }
    
    static int scanner(){
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt();
        return sc;
    }
    
    static int[][] triangle(int lines){
        int[][] arr = new int[lines][];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[i + 1];
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = count++;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    return arr;
    }
    
    static int[][] revTriangle(int lines){
        int[][]arr = new int[lines][];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[lines - i];
        }
        
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = count++;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    return arr;
    }

       
    }