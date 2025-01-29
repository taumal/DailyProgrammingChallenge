package SelfPractice;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ConvertToRomanIterative {
    private static final Map<Integer, String> dictionary = new HashMap<>();
    static {
        dictionary.put(1000, "M");
        dictionary.put(900, "CM");
        dictionary.put(500, "D");
        dictionary.put(400, "CD");
        dictionary.put(100, "C");
        dictionary.put(90, "XC");
        dictionary.put(50, "L");
        dictionary.put(40, "XL");
        dictionary.put(10, "X");
        dictionary.put(9, "IX");
        dictionary.put(5, "V");
        dictionary.put(4, "IV");
        dictionary.put(1, "I");
    };

    public static String convertToRomanIterative(int number) {
        StringBuilder roman = new StringBuilder();
        // Iterate over the HashMap
        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            while (number >= entry.getKey()) {
                roman.append(entry.getValue());
                number -= entry.getKey();
            }
        }

        /*foreach(var item in romanMap) {
            while (number >= item.Key) {
                result += item.Value; // Append Roman numeral
                number -= item.Key; // Reduce the number
            }
        }*/
        return roman.toString();
    }

    public static String convertToRoman(int number) {
        StringBuilder result = new StringBuilder();

        // Iterate over the map entries
        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            while (number >= entry.getKey()) {
                result.append(entry.getValue());
                number -= entry.getKey();
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int number = 1994;
        String romanNumber = convertToRomanIterative(number);
        System.out.printf("The Roman numeral for %d is %s", number, romanNumber);

        int number2 = 1987;
        String romanNumeral2 = convertToRoman(number2);
        System.out.printf("\nThe Roman numeral for %d is %s", number2, romanNumeral2);
    }
}
