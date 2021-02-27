import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HOSHIBA on 02/23/2021.
 */
public class Reverse {
    public static void main(String[] args) {
        List numbers = new ArrayList(Arrays.asList(1,2,3,4,5));
        System.out.println("Before reversing : "+numbers);
        int j = numbers.size()-1;
        for (int i = 0 ; i <j ; i++) {
            numbers.add(i, numbers.remove(j));
        }
        System.out.println("After reversing : "+ numbers);


    }
}
