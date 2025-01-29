import java.util.*;
public class day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int num=1;
        for(int i=0; i<n;i++){

            for(int j=0;j<n-i;j++){
                arr[j][i] = num;
//                System.out.print(arr[i][j]);
                num++;
            }
            System.out.println();
        }
        for(int i=0; i<n;i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
