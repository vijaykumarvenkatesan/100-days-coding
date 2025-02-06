import java.util.*;

public class day16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String word = in.nextLine();
            String[] letter = word.split(" ");
            for(String l:letter){
                System.out.print((char)(96+l.length()));
            }
            System.out.print(" ");
        }
    }
}
