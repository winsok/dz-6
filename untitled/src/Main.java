import java.lang.reflect.Array;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Масива для Задачі №1:
        int[] numbers = new int[]{3,7,9,11,2,4,6,8};
       // Викликаємо метод по задачі №1
        checkNumbers(numbers);

        //Стрінга для задачі №2
        String myString = "My String 123444 My";
        //Викликаємо метод по задачі №2
         checkTheString(myString);

    }

    //Логіка по задачі №1
    public static int checkNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num %2 == 0) {
               sum += num;

            }
        }

        System.out.println(sum);
        return sum;
    }

   // Логіка задачі №2
    public static void checkTheString(String myString) {


        char[] letters = myString.toCharArray();
        HashSet<Character> myChars = new HashSet<Character>();


        for (Character letter : letters) {
            myChars.add(letter);

        }

        for (Character setCharacters : myChars) {
            System.out.println(setCharacters);

        }


    }

}