package additionalTasks;
import java.lang.StringBuilder;
public class PhraseGen {
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
        int secondLength = secondWord.length;
        int thirdLength = thirdWord.length;
        int fourthLength = fourthWord.length;
        
        int rand1 = (int) (Math.random() * firstLength);
        int rand2 = (int) (Math.random() * secondLength);
        int rand3 = (int) (Math.random() * thirdLength);
        int rand4 = (int) (Math.random() * fourthLength);
        
        StringBuilder str = new StringBuilder();
        str.append(firstWord[rand1]);
        str.append(" ");
        str.append(secondWord[rand2]);
        str.append(" ");
        str.append(thirdWord[rand3]);
        str.append(" ");
        str.append(fourthWord[rand4]);
        str.append(" ");
        
        String phrase = str.toString();
        System.out.println(phrase);
    }
}

