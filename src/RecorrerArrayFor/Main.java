package RecorrerArrayFor;

public class Main {
    public static void main(String[] args) {
        int [] a = {7, -2, 5, 0, 6};
        int [] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(metodo(a, b));
    }

    private static int metodo(int[] a, int[] b){
        int sumaArray = 0;
        for (int i = 0; i < a.length; i++) {
            sumaArray += a[i];
        }
        for (int i = 0 ; i < b.length; i++){
            sumaArray += b[i];
        }

        return sumaArray;
    }

}