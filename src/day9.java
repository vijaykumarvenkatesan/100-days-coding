/* An odd length string S is passed as the input. The program must print the pattern as described below.

Let L be the length of the string and M denote the middle position of the string S. The characters in the string are a(1), . . . , a(M), . . . , a(L).

- The first line will contain the middle letter a(M) of S in the extreme right.

- Then in each subsequent line, the letters after the middle letter from a(M+1) to a(L) is appended to the line output.

- After the end of the string a(L) is reached, in each subsequent line, the letters from the beginning to the middle letter, a(1) to a(M-1) are appended to the line output.

Note: Asterisk * will be used to pad in the front so that each line has L characters

Input Format:

The first line will contain S.

Output Format:

L lines as output where L is the length of the string S.

Boundary Conditions:

3 <= L <= 1001

Example Input/Output 1:

Input:

CRY

Output:

**R
*RY
RYC

Example Input/Output 2:

Input:

PROGRAM

Output:

******G
*****GR
****GRA
***GRAM
**GRAMP
*GRAMPR
GRAMPRO
*/


import java.util.*;
public class day9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int n = word.length();
        String pattern = word.substring(n/2,n)+word.substring(0,n/2);
        for(int i=0; i<n;i++){
            for(int j=0; j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.print(pattern.substring(0,i+1));
            System.out.println();
        }
    }
}
