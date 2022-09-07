
# 끝자리로 짝수와 홀수 구분

number = input("정수 입력>")

# 마지막 자리 숫자를 추출
last_character = number[-1]

# 숫자로 변환
last_number = int(last_character)

# 방법 1번
if last_number % 2 == 0:
    print("짝")
else:
    print("홀")

# 방법 2번
if last_character in "02468":
    print("짝수")
else:
    print("홀수")

