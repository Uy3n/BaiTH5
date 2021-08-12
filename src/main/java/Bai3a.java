import java.util.Scanner;

public class Bai3a {
    public static void main (String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0; i < n; i++){
            System.out.format("arr[%d] = ",i);
            arr[i] = sc.nextInt();
        }
        countArray(arr);
        System.out.format("Co %d so chia het cho 4 nhung ko chia het cho 5",countArray(arr));
    }
    public static int countArray(int [] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 4 == 0 && arr[i] % 5 != 0){
                count += 1;
            } else {
                break;
            }
        }
        return count;
    }
}
