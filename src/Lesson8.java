import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        StringBuilder sBuild = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < 300000; i++) {
            sBuild.append("a");
        }
        long endTime = System.nanoTime();

        float result = (endTime - startTime) * 0.000000001f;
        //System.out.println(result);

        //new MyWindow();
        //Закомментил инициализацию окна, чтобы не мешала
        //Тут будет игра с угадываением слов

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String word;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        int n = random.nextInt(words.length);
        //System.out.println(words[n]);
        System.out.println("Угадайте загаданное слово!");
        char[] letters = words[n].toCharArray();
        char[] lettersCmp = new char[15];
        Arrays.fill(lettersCmp, '*');

        while (true) {
            System.out.println("Введите слово ('Выход' чтобы выйти): ");
            word = scanner.nextLine();
            if (word.equals("Выход")) {
                break;
            }
            if (word.equals(words[n])) {
                System.out.println("Ответ верный!!! Поздравляем!");
                break;
            } else {
                System.out.println("Ответ неверный");
                char[] lettersWord = word.toCharArray();

                for (int i = 0; i < letters.length; i++) {
                    if (i >= lettersWord.length) {
                        break;
                    }
                    if (letters[i] == lettersWord[i]) {
                        lettersCmp[i] = letters[i];
                    }
                }
                System.out.println(String.valueOf(lettersCmp));
            }
        }

    }
}

//DONE
