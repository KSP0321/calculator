App 메인 클래스와 Calculator 클래스로 구현

Calculator 클래스에 입력받은 수를 저장할 num1, num2
연산자를 받을 operator, 결과값을 받을 result 선언

App 클래스에서 입력받은 변수를 사용하기 위해 세터 메서드 작성 (setNum1, setNum2, setOperator)
Calculator 클래스에서 실행한 연산 결과를 App 클래스에 출력하기 위해 게터 메서드 작성 (getResult)

Lv1에서는 switch 문으로 연산자에 따른 연산 결과를 result에 저장
Lv2에서는 연산 부분을 calculate 불리언 메서드로 작성
정상적으로 연산이 진행되면 각 연산 결과를 result에 저장후 true 값을 반환
App 클래스에서 !calc.calculate() 부분을 false로 만듬
연산이 정상적으로 작동하지 않아 false를 반환하면 if(!) 조건문이 true가 되어 아래 continue를 실행, 다시 처음부터 실행

마지막으로 getResult 게터 메서드를 통해 결과값을 출력
