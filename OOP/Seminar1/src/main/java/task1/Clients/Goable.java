package task1.Clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable  {
   // public static final List<Integer> pi = new ArrayList<>();
//    Serializable
    void toGo();

    /**
     * По умолчанию возвращает 10, но можно переопределить в любом классе, где 'implements Goable';
     * @return
     */
    default double getRunSpeed(){
        return 10D;
    }

}
