package arrays;
import java.util.*;
public class Task5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int ln = scan.nextInt();
        System.out.println("Введите количество столбцов");
        int col = scan.nextInt();
        int[][] mat = createNewMatrix(ln, col);
        System.out.println("\n---Начальная матрица (1 вариант)---\n");
        viewMatrix(mat);
        System.out.println("\n---Начальная матрица (2 вариант)---\n");
        viewMatrix2(mat);
        System.out.println("\n---Перестановка строк и элементов---\n");
        reverseMatrix(mat);
        System.out.println("\n---Перестановка элементов---\n");
        reverseMatrix2(mat);
        System.out.println("\n---Четные элементы---\n");
        evenMatrixElement(mat);
        System.out.println("\n---Нечетные элементы---\n");
        oddMatrixElement(mat);
        System.out.println("\n---Кратные семи элементы---\n");
        multipleSeven(mat);
        System.out.println("\n---Произведение трех---\n");
        multipleThree(mat);
    }
    
    //метод для создания матрицы
    static int[][] createNewMatrix(int lines, int columns){
        int[][] mat = new int[lines][columns];
        Random random = new Random();
        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++){
                mat[i][j] = random.nextInt(10);
            }
        }
        return mat;
    }
    
    // метод для выведения всех элементов матрицы (1 вариант)
    static void viewMatrix(int[][] arr){
        for(int[] lines : arr){
            for(int element : lines){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
    // метод для выведения всех элементов матрицы (2 вариант)
    static void viewMatrix2(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // метод для выведения матрицы в обратную сторону
    static void reverseMatrix(int[][] arr){
        for(int i = arr.length-1; i >= 0; i--){
            for(int j = arr[i].length - 1; j >=0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // метод для выведения матрицы в обратную сторону
    static void reverseMatrix2(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i].length - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // метод для четных элемнтов матрицы
    static void evenMatrixElement(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if((i % 2 == 0) && (arr[i][j] % 2 == 0)){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    // метод для нечетных элемнтов матрицы
    static void oddMatrixElement(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i % 2 != 0 && arr[i][j] % 2 != 0){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    // метод для кратных семи
    static void multipleSeven(int[][] arr){
        int multSevSum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if((i % 2 == 0) && (arr[i][j] % 7 == 0) && (arr[i][j] > 0)){
                    multSevSum += arr[i][j];
                }
            }
        }
        System.out.println("summa " + multSevSum);
    }
    
    // метод для трех
    static void multipleThree(int[][] arr){
        int multThreeSum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if((i % 2 != 0) && (arr[i][j] % 3 == 0) && (arr[i][j] > 0)){
                    multThreeSum += arr[i][j];
                }
            }
        }
        System.out.println("summa " + multThreeSum);
    }
    
}