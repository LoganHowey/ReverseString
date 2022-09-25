import java.util.Arrays;

public class ReverseString {

    public static String[] reverse(String toReverse){
        String[] stringArray = toReverse.split(" ");
        String[] reversedString = new String[stringArray.length];
        int count = 0;
        for (int i = stringArray.length - 1; i >= 0; i--){
            reversedString[i] = stringArray[count];
            count++;
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String[] test = reverse("things go in here");

        System.out.println(Arrays.toString(test));
    }
}
