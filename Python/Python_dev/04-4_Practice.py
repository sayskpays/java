# 4 장 연습문제

# Q1 . 주어진 자연수가 홀수인지 짝수인지 판별해 주는 함수 (is_odd)를 작성해 보자.

def is_odd(num):
    
    if num % 2 == 0:
        print("짝수")
    else:
        print("홀수")
    
    return num

check_num = is_odd(5)


# Q2 . 입력으로 들어오는 모든 수의 평균 값을 계산해 주는 함수를 작성해 보자.(단 입력으로 들어오는 수의 개수는 정해져 있지 않다.)
# * 평균 값을 구할 때 len 함수를 사용해 보자.

def insert_avg(*args):
    result = 0
    for i in args:
        result = result + args / len(args)
    return result

print(insert_avg(1,2,3,4,5))
    
