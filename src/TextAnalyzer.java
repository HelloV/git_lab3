/**
 * Created by ����� on 24.03.2015.
 */
import java.util.ArrayList;

public class TextAnalyzer {
    public static void main(String[] args) {
        //������ �����������
        Mood positive = new Mood("�������");
        Mood negative = new Mood("�������");


        //������ ���� ����
        ArrayList<Word> wordList = new ArrayList<Word>();

        wordList.add(new Word("������", positive, +1));
        wordList.add(new Word("����", positive, +1));
        wordList.add(new Word("������", positive, +2));
        wordList.add(new Word("��������", positive, +2));
        wordList.add(new Word("��", positive, +1));

        wordList.add(new Word("���", negative, -1));
        wordList.add(new Word("�������", negative, -1));
        wordList.add(new Word("�����", negative, -3));
        wordList.add(new Word("����������", negative, -2));
        wordList.add(new Word("����", negative, -2));
    }
}
