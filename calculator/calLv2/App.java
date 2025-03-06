package calculator.calLv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean flag = true;

        while (flag) {
            System.out.print("Enter num1: ");
            int num1 = scanner.nextInt();
            if (num1 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }
            calc.setNum1(num1);

            System.out.print("Enter num2: ");
            int num2 = scanner.nextInt();
            if (num2 < 0) {
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }
            calc.setNum2(num2);

            System.out.print("Choose operator +, -, *, / : ");
            char operator = scanner.next().charAt(0);
            calc.setOperator(operator);

            if (!calc.calculate()) {
                continue;
            }

            System.out.println("Result: " + calc.getResult());

            System.out.println("더 계산하시려면 아무 키나 입력하세요. (exit 입력 시 종료)");
            String str = scanner.next();
            if (str.equals("exit")) {
                flag = false;
            }
        }

        System.out.println("계산기를 종료합니다.");
    }
}
