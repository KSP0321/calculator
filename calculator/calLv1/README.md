계산에 필요한 변수를 입력 받기 위한 변수 num1, num2
나눗셈 실행시 소수점을 표현하기 위해 result는 double 형으로
연산자를 입력 받을 a
while 문을 제어하기 위한 불리언 flag
마지막 추가 실행 및 종료 여부를 위한 문자열 str을 먼저 변수로 선언

while 문으로 묶어 하나의 큰 반복문으로 처리

조건문으로 입력받은 변수가 요구 조건(0이상의 정수, 사칙연산 이외의 문자...)에 부합하는지 확인
부합하지 않을 시, continue 문으로 조건문 재실행

switch 문으로 각 사칙연산에 맞는 case 작성

.equals(exit) 가 true 일 경우 flag = false 로 while 문 종료
