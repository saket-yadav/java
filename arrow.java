public class arrow {
    public static void main(String[] args) {
        int size = 6;

        // upper part of heart
        for (int i = size / 2; i <= size; i += 2) {
            // left spaces
            for (int j = 1; j < size - i; j += 2)
                System.out.print(" ");

            // left half
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            // middle spaces
            for (int j = 1; j <= size - i; j++)
                System.out.print(" ");

            // right half
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        // lower part
        for (int i = size; i >= 1; i--) {
            // leading spaces
            for (int j = i; j < size; j++)
                System.out.print(" ");

            // pattern
            for (int j = 1; j <= (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println("fucking heart pattern");
    }
}
