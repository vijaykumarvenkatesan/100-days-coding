import java.util.*;

public class day4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean step = true;
        int dig1,dig2;
        dig1 = num%10;
        num /=10;
        while(num >0){
            dig2 = num%10;
            if(Math.abs(dig1-dig2)!=1) {
                step = false;
                break;}
            dig1 = dig2;
            num/=10;
        }
        if(step) System.out.println("yes");
        else System.out.println("no");
    }
}
