import java.util.Scanner;

public class Bai2c {
    public static void main (String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.format("arr[%d] = ",i);
            arr[i] = sc.nextInt();
        }
        isGrowl(arr);
        System.out.println(isGrowl(arr));
    }
    public static boolean isGrowl(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] >= arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
