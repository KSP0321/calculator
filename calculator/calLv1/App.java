package calculator.calLv1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        double result;
        String str;
        char a;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter num1 : ");
            num1 = scanner.nextInt();
            if(num1<0){
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            System.out.println("Enter num2 : ");
            num2 = scanner.nextInt();
            if(num2<0){
                System.out.println("양의 정수를 입력하세요.");
                continue;
            }

            System.out.println("choose +, -, *, / : ");
            a = scanner.next().charAt(0);

            if(a=='+' || a=='-' || a=='*' || a=='/'){
                switch (a){
                    case '+':
                        result = num1 + num2;
                        System.out.println("result : " + result);
                        break;

                    case '-':
                        result = num1 - num2;
                        System.out.println("result : " + result);
                        break;

                    case '*':
                        result = num1 * num2;
                        System.out.println("result : " + result);
                        break;

                    case '/':
                        if(num2==0){
                            System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                            continue;
                        }
                        result = (double) num1 / num2;
                        System.out.println("result : " + result);
                        break;

                    default:
                }
            }else {
                System.out.println("다시 입력하세요.");
                continue;
            }

            System.out.println("더 계산하시려면 아무키를 입력하세요. (exit 입력 시 종료)");
            str = scanner.next();
            if(str.equals("exit")){
                flag = false;
            }
        }
    }
}
