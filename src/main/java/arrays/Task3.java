package arrays;
import java.util.*;
public class Task3 {
    public static void main(String[] args){
        String[] firstWord = {"Дорогие друзья!", " с другой стороны","равным "
                               + " образом"," Таким образом, "};
        String[] secondWord = {" рамки и место обучения кадров", " новая модель",
                                " укрепления и развития структуры"};
        String[] thirdWord = {" позволяет оценить значение ", " позволяет выполнить ",
                              " требуют от нас анализа "};
        String[] fourthWord = {" системы массового участия", " новых предложений",
                              " соответствующих условий активизации"};
        
        int firstLength = firstWord.length;
        int secondLength = fourthWord.length;
        int thirdLength = thirdWord.length;
        int fourthLength = fourthWord.length;
        
        int rand1 = (int) (Math.random() * firstLength);
        int rand2 = (int) (Math.random() * secondLength);
        int rand3 = (int) (Math.random() * thirdLength);
        int rand4 = (int) (Math.random() * fourthLength);
        
        String phrase = firstWord[rand1] + secondWord[rand2] + thirdWord[rand3] 
                        + fourthWord[rand4];
        System.out.println(phrase);
    }
}
