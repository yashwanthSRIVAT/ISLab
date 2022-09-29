import java.io.*;

public class SubstitutionCipher {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String args[]) throws IOException{
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zyxwvutsrqponmlkjihgfedcba";

        System.out.println("Enter the Input string: ");
        String str = br.readLine().toLowerCase();
        String cipher = "", decrypt = "";
        char c;
        
        // Encryption
        for(int i = 0; i <str.length(); i++) {
            c = str.charAt(i);
            int j = a.indexOf(c);
            cipher = cipher + b.charAt(j);
        }

        System.out.println("The encrypted data is " + cipher);

        // Decryption
        for(int i = 0; i < cipher.length(); i++) {
            c = cipher.charAt(i);
            int j = b.indexOf(c);
            decrypt = decrypt + a.charAt(j);
        }
        System.out.println("The decrypted data is " + decrypt);
    }
}