import java.util.Arrays;

/**
 * Created by HOSHIBA on 02/3/2021.
 */
public class Remove {
    int[] b = {1, 4, 5};

    public void Remove(int b[], int inx) {
        if (inx >= 0 && inx < b.length) {
            int i = inx;
            while (i < b.length - 1) {
                b[i] = b[i + 1];
                i++;
            }
            b[i] = 0;
        }
    }

    public static void main(String[] args) {
        Remove r = new Remove();
        System.out.println(Arrays.toString(r.b));
        r.Remove(r.b, 2);
        System.out.println(Arrays.toString(r.b));
    }
}