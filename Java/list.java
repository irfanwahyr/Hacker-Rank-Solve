import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            L.add(sc.nextInt());
        }
        
        int p = sc.nextInt();
        
        for(int i = 0; i < p; i++){
            String op = sc.next();
            
            if (op.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                L.add(index, value);
            } else if (op.equals("Delete")) {
                int index = sc.nextInt();
                L.remove(index);
            }
        }
        
        for(int i = 0; i < L.size(); i++){
            System.out.print(L.get(i) + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
