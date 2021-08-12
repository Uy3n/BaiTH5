import java.util.Scanner;

public class Bai2b {
    public static void main (String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++){
            System.out.format("arr[%d] =  ", i);
            arr[i] = sc.nextInt();

        }
        isPrimenum(arr);
        System.out.println(isPrimenum(arr));
      }

    public static boolean isPrimenum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2) {
                return false;
            } else {
                for (int j = 2; j < arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}