package practicework;

public class sampleJavaAssignment {
    static int findMax(int[] numbers) {
        if (numbers == null) {
            try {
                throw new IllegalAccessException("numbers cannot be null");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 3, 17, 4, 22 };
        System.out.println("max = " + findMax(numbers));
//creating mr request
    }
}

