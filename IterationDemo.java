public class IterationDemo {

    public static void main(String[] args) {

        // 1️⃣ FOR LOOP – Print numbers, squares, and cubes
        System.out.println("FOR LOOP: Numbers, Squares and Cubes");
        for (int i = 1; i <= 6; i++) {
            System.out.println(
                "Number: " + i +
                " Square: " + (i * i) +
                " Cube: " + (i * i * i)
            );
        }

        // 2️⃣ WHILE LOOP – Sum of first 10 natural numbers
        System.out.println("\nWHILE LOOP: Sum of first 10 numbers");
        int n = 1;
        int sum = 0;
        while (n <= 10) {
            sum = sum + n;
            n++;
        }
        System.out.println("Sum = " + sum);

        // 3️⃣ DO-WHILE LOOP – Multiplication table of 5
        System.out.println("\nDO-WHILE LOOP: Table of 5");
        int i = 1;
        do {
            System.out.println("5 x " + i + " = " + (5 * i));
            i++;
        } while (i <= 10);

        // 4️⃣ FOR LOOP – Print even numbers from 2 to 20
        System.out.println("\nFOR LOOP: Even Numbers");
        for (int e = 2; e <= 20; e = e + 2) {
            System.out.println(e);
        }

        // 5️⃣ WHILE LOOP – Reverse counting
        System.out.println("\nWHILE LOOP: Reverse Counting");
        int r = 10;
        while (r >= 1) {
            System.out.println(r);
            r--;
        }

        // 6️⃣ DO-WHILE LOOP – Print alphabets using ASCII values
        System.out.println("\nDO-WHILE LOOP: Alphabets A to E");
        char ch = 'A';
        do {
            System.out.println(ch);
            ch++;
        } while (ch <= 'E');
    }
}
