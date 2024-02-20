package task1;

import javax.naming.AuthenticationNotSupportedException;
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematics m = Double::sum;

        Mathematics x = (y, z) -> y + z;

        System.out.println(x.add(34D, 56D));

    }
}

interface Mathematics{
    double add(double a, double b);
}

class Calculator{

    static Map<Character,Calculable> map = new HashMap<>();
    static{
        map.put('+',arr -> arr[0]+arr[1]);
        map.put('-', arr -> arr[0]-arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('r', arr -> Math.sqrt(arr[0]));
    }
    public static void main(String ... args) {
        System.out.println(calculate('r',9, 78));

    }
    public static double calculate(char op, double ... arr){
        return map.get(op).calc(arr);
    }
}

interface Calculable{
    double calc(double ... arr);
}
