/**
 * Created by HOSHIBA on 02/3/2021.
 */
public class Clone {
    int a []={1 , 4 , 5};
    int b []= new int [a.length];

    public void backup(){
        for (int i = 0; i <b.length ; i++) {
            b[i]=a[i];
        }
    }
    public void print(){
        System.out.print("[");
        for (int i = 0; i <b.length ; i++) {
            if (i==b.length-1) System.out.print(b[i]);
            else  System.out.print(b[i]+" , ");
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        Clone c= new Clone();
        c.print();
        c.backup();
        c.print();
    }
}
