package practicework;

public class ILOVETEXAS {
    public static void main(String[] args) {
        String sentence = "I LOVE TEXAS";
        char targetChar = 'A';
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == targetChar) {
                count++;
            }
        }
        System.out.println("The number of 'A' in the sentence 'I LOVE TEXAS' is: " + count);
    }
}

