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
        viewMatrix(mat);
        
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
    
    // метод для выведения всех элементов матрицы
    static void viewMatrix(int[][] array){
        for(int[] lines : array){
            for(int element : lines){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    
}