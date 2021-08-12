import java.util.Scanner;

public class Bai3b {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.format("arr[%d] = ",i);
            arr[i] = sc.nextInt();
        }
        sumArray(arr);
        System.out.println(sumArray(arr));

    }
    public static int sumArray(int[] arr){
        int sum = 0;
        int count ;
        for (int i = 0; i < arr.length; i++){
            count = 0;
            if (arr[i] < 2){
                continue;
            } else {
                for (int j = 2; j < arr[i]; j++){
                    if (arr[i] % j ==0){
                        count ++;
                    }
                }
            }
            if(count == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
