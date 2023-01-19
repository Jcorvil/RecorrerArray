package RecorrerArrayImprime;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] a = {2,4,6,8,10};
        metodo(a);
        System.out.println(Arrays.toString(a));
    }

    static void metodo(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}