package Task1;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        String buf1 = "";

        long startTime = System.currentTimeMillis();

        for(int i = 0; i <= 90_000; i++){
            buf1 += UUID.randomUUID();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endTime - startTime) + " милисекунд");


        StringBuilder buf2 = new StringBuilder("");

        startTime = System.currentTimeMillis();

        for(int i = 0; i <= 90_000; i++){
            buf2.append(UUID.randomUUID());
        }

        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (endTime - startTime) + " милисекунд");

    }
}
