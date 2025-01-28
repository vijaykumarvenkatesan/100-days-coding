import java.util.*;

public class day8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pre = Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            int num = in.nextInt();
            if(num>pre && num>max) {
                System.out.print(num+ " ");
                max = num;
            }
            pre = num;
        }
    }
}
