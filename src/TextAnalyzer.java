/**
 * Created by Вадим on 24.03.2015.
 */
import java.util.ArrayList;

public class TextAnalyzer {
    public static void main(String[] args) {
        //Создаём настороения
        Mood positive = new Mood("Позитив");
        Mood negative = new Mood("Негатив");


        //Создаём банк слов
        ArrayList<Word> wordList = new ArrayList<Word>();

        wordList.add(new Word("привет", positive, +1));
        wordList.add(new Word("пока", positive, +1));
        wordList.add(new Word("хорошо", positive, +2));
        wordList.add(new Word("идеально", positive, +2));
        wordList.add(new Word("да", positive, +1));

        wordList.add(new Word("нет", negative, -1));
        wordList.add(new Word("никогда", negative, -1));
        wordList.add(new Word("дурак", negative, -3));
        wordList.add(new Word("катастрофа", negative, -2));
        wordList.add(new Word("буря", negative, -2));
    }
}
