package calculator.calLv2;

public class Calculator {
    private int num1;
    private int num2;
    private char operator;
    private double result;


    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    // 연산 수행 메서드
    public boolean calculate() {
        switch (operator) {
            case '+':
                result = num1 + num2;
                return true;
            case '-':
                result = num1 - num2;
                return true;
            case '*':
                result = num1 * num2;
                return true;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
                    return false;
                }
                result = (double) num1 / num2;
                return true;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
                return false;
        }
    }
}
