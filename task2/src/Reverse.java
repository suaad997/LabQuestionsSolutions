import java.util.Random;

/**
 * Created by HOSHIBA on 02/3/2021.
 */
public class Reverse {
    int[] b = {22, 44, 55, 66, 77};
    int[] c = new int[b.length];

    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) System.out.print(c[i]);
            else System.out.print(c[i] + " , ");
        }
        System.out.print(" ]");
    }


    public void dep() {
        for (int i = 0; i < c.length; i++) {
            c[i] = b[i];

        }

    }


    public static void main(String[] args) {
        Reverse x = new Reverse ();
        x.print();
        x.dep();
        x.print();
    }
}
