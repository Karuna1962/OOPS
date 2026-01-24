public class ControlStatementsDemo {

    public static void main(String[] args) {

        int marks = 75;
        int choice = 2;

        // 1️⃣ Selection Statement (if–else)
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // 2️⃣ Switch Statement
        switch (choice) {
            case 1:
                System.out.println("Choice: Science");
                break;

            case 2:
                System.out.println("Choice: Commerce");
                break;

            case 3:
                System.out.println("Choice: Arts");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        // 3️⃣ Iteration with Jump Statements (for + continue + break)
        for (int i = 1; i <= 5; i++) {

            if (i == 2) {
                continue;   // skips number 2
            }

            if (i == 4) {
                break;      // stops loop at 4
            }

            System.out.println("Number: " + i);
        }
    }
}
