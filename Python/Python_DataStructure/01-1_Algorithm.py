# 클래스명 camelCase
# 함수명 snake_case

# 알고리즘이란?

# 세 정수의 최댓값 구하기

# 순차 구조 (Sequential Structure)

"""

print("세 정수의 최댓값을 구합니다.")

a = int(input("정수 a의 값을 입력하세요: "))
b = int(input("정수 b의 값을 입력하세요: "))
c = int(input("정수 c의 값을 입력하세요: "))

maximum = a 

# 선택 구조
if b > maximum :
    maximum = b

if c > maximum:
    maximum = c

print(f'최댓값은 {maximum}입니다.')

"""
# 세 정수의 최댓값 구하기 (올바른 방식)

"""

def max(a,b,c):

    maximum = a
    if b > maximum : maximum = b
    if c > maximum : maximum = c
    return maximum

print(f'max(3,2,1) = {max(3,2,1)}')

"""
# 세 정수의 대소 관계와 중앙값
# 중앙값 : 주어진 값의 크기 순서대로 정렬했을 때 가장 중앙에 위치하는 값

"""

def med(a,b,c):
    # 5 4 3 
    if a>=b:
        if b >= c:
            return b
        elif a <= c:
            return a
        else:
            return c
    elif a > c:
        return a
    elif b > c:
        return c
    else:
        return b

a = int(input('정수 a의 값을 입력하세요: '))
b = int(input('정수 b의 값을 입력하세요: '))
c = int(input('정수 c의 값을 입력하세요: '))

print(f'중앙값은 {med(a,b,c)}입니다.')

"""


# 세 정수를 입력받아 중앙값 구하기 2

"""

def med2(a,b,c):

    if (b >= a and c <= a) or (b <= a and c >= a):
        return a
    elif (a > b and c < b) or (a < b and c > b):
        return b
    return c

"""
"""
중앙값을 구하는 첫번째 코드보다 비효율적

if(b >= a) , if(b <= a) 를 비교 후
elif 에서 다시 한번 (a > b) , (a < b)를 비교한다.

a와 b의 비교를 이미 마친 상태에서 다시 비교하는 것이 비효율적
"""    

# 조건문과 분기

# 입력받은 정숫값의 부호(양수, 음수, 0)을 판단하여 출력하는 프로그램

"""
n = int(input('정수를 입력하세요: '))

if n > 0:
    print('이 수는 양수입니다.')
elif n < 0:
    print('이 수는 음수입니다.')
else:
    print('이 수는 0입니다.')
"""

# 연산자와 피연산자
"""
+ , - 등의 기호를 산술 연산자(Operator)
연산 대상을 피연산자(Operand)

단항 연산자 : 피연산자 1개 : -a
이항 연산자 : 피연산자 2개 : a < b
삼항 연산자 : 피연산자 3개 : a if b else c

이 중에서 조건 연산자인 if~else 문은 파이썬의 유일한 삼항 연산자

a = x if x > y else y
x와 y 중 큰 값을 a에 대입

"""

# 1부터 n까지 정수의 합 구하기 (while)
"""
n = int(input('n값을 입력하세요'))

sum = 0 
i = 1 # count 변수

while i <= n:
    sum += i
    i += 1

print(f'1부터 {n}까지 정수의 합은 {sum}입니다.')
"""

# 1부터 n까지 정수의 합 구하기 (for)

"""

n = int(input('n값을 입력하세요: '))

sum = 0
# Count 변수 i는 1부터 시작하고 n + 1 이 될때까지 반복한다. 
# range(count 시작값 , count 종료값)
for i in range(1, n + 1):
    sum += i

print(f'1부터 {n}까지 정수의 합은 {sum}입니다.')

"""

# 가우스 덧셈으로도 1부터 n까지 정수의 합을 구할 수 있다.
"""
sum = n * (n+1) // 2

12 // 2 == 6
12 % 2 == 0
"""

# range() 함수로 이터러블 객체 생성하기

"""
range(n) : 0 이상 n 미만인 수를 차례로 나열하는 수열
range(a, b) : a 이상 b 미만인 수를 차례로 나열하는 수열
range(a, b, step) : a 이상 b 미만인 수를 step 간격으로 나열하는 수열

이터러블 객체는 반복할 수 있는 객체를 말하며
대표적인 이터러블 자료형으로 list, str, tuple이 있습니다.
"""

# 연속하는 정수의 합을 구하기 위해 값 정렬하기

a = int(input('정수 a를 입력하세요: '))
b = int(input('정수 b를 입력하세요: '))

if a > b:
    a, b = b, a # a와 b를 오름차순으로 정렬

sum = 0
for i in range(a, b+1): # a를 1 b를 2라고 할 시 2번 반복
    sum += i















