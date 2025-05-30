import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    /*
     * ( ^ ) dimulai dari string 
     * ( [a-zA-Z] ) first character huruf
     * ( [a-zA-Z0-9_] ) tidak boleh ada selain huruf, angka dan _
     * ( {7,29} ) minimal 8, max 30 character
     * ( $ ) akhir harus string
     */
    
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
