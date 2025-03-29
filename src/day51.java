import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            if(n <2) System.out.println("You cannot generate Christmas tree");
            else if(n > 20) System.out.println("Tree is no more");
            else{
                for(int i=0; i<n;i++) System.out.print(" ");
                System.out.print("*");
                System.out.println();
                int N =n;
                while(n >= 2){
                    for(int i=1; i<=n; i++){
                        for(int j =0; j < N-i; j++){
                            System.out.print(" ");
                        }
                        for(int k = 0; k < i*2+1; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    n--;
                }
                for(int i=0; i<2; i++){
                    for(int j = 0 ; j < N; j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
        }
    }
}
