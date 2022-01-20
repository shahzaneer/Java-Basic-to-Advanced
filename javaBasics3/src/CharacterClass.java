import java.util.Scanner;
public class CharacterClass {
    public static void main(String[] args) {
        char digit = '1';
        char alphaUpper = 'A';
        char alphaLower = 'a';
        char whiteSpace = ' ';

//        Character class methods !

        System.out.println(Character.isLetter(digit));
        System.out.println(Character.isDigit(digit));
        System.out.println(Character.isWhitespace(whiteSpace));
        System.out.println(Character.isLowerCase(alphaLower));
        System.out.println(Character.isUpperCase(alphaUpper));
        System.out.println(Character.toLowerCase(alphaUpper));
        System.out.println(Character.toUpperCase(alphaLower));

        System.out.println(Character.toString(digit).length());

    }
}
