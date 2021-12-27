import java.util.Scanner;

public class AlphabetOrVowel {

        public static void main(String args[]){
            System.out.println("Enter a character :");
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch == 'I'||ch == 'E'||ch == 'O'||ch == 'U'){
                System.out.println("Given character is an vowel");
            }else{
                System.out.println("Given character is a consonant");
            }
        }

}
