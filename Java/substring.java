import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareToIgnoreCase(B) > 0) System.out.println("Yes");
        else System.out.println("No");
        
        String capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capitalA + " " + capitalB);
    }
}



