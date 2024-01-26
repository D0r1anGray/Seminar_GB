package Task2;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

/**
 * Задача2
 * На входе произвольные алфавитно-цифровые символы.(fjsklfjlsfjk.fjksdjflksj)
 * Требуется программа, которая будет печатать последовательность строчных
 * английских букв ('a', 'b', 'c') из входной последовательности и частот их
 * повторения.
 * Печать должна происходить в алфавитном порядке. Например, на входе следующие
 * символы:
 * fhb5kbfsh.fmsdfsdf.
 * '.' - завершение последовательности.
 * Программа должна вывести:
 * b2
 * f3
 * h2
 * k1
 * m1
 * s1
 */

public class Program {
    public static void main(String[] args) throws IOException { // Пусть исключения обрабатвает тот, кто вызывает
        File file = new File("log.txt"); // метод main
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file, true);

        System.out.println("Введите строку: ");
        char c = 'a';
        int codeA = c;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] statistic = new int[26];

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) <= 'z' && s.charAt(i)>= 'a'){
                statistic[s.charAt(i) - codeA]++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < statistic.length; i++){
            if(statistic[i] >0){
                stringBuilder.append( (char)(i + codeA) )
                        .append(statistic[i])
                                .append('\n');
            }
        }
        String str = stringBuilder.toString();
        System.out.println(str);
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + s +  "\n" + str);
        fileWriter.close();
    }
}
