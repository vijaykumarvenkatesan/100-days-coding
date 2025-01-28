import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),counter=0;

        for(int i=1; i<=n;i++){
            counter += String.valueOf(i).length();
            System.out.println(String.valueOf(i).getClass());
        }
        System.out.println(counter);

    }
}
