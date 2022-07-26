import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {

    public static void main(String[] args) {
            System.out.println("Please provide token length = 5,10 or 15 characters");

            Scanner obj = new Scanner(System.in);
            int tokenLength;

            while (true) {
                tokenLength = obj.nextInt();

                if (tokenLength == 5 || tokenLength == 10 || tokenLength == 15) {
                    System.out.println("Your token length is: " + tokenLength + " characters.");
                    break;
                }
                System.out.println("Your token length is : " + tokenLength + ". Please choose between 5, 10 or 15");
            }

            String allowedCharacters = "abcdefghijklmnoprstuwxyzABCDEFGHIJKLMNOPRSTUWXYZ1234567890!@#$%^&*()";
        Random random = new Random();

        char[] token = new char[tokenLength]; // change intial token length
        for (int j=0; j <= tokenLength-1; j++) {
            int x = random.nextInt(68);
            token[j] = allowedCharacters.charAt(x);
        }
        System.out.println("GENERATED TOKEN: ");
        System.out.println(Arrays.toString(token).replace("[", "").replace("]", "").replace(",", "").replace(" ", ""));
    }

}
