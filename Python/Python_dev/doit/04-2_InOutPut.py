# 04-2 사용자 입력과 출력

# 사용자 입력
# input에 입력되는 모든 것은 문자열로 취급
a = input()


# 큰따옴표(")로 둘러싸인 문자열은 + 연산과 동일하다.

print("life""is""too short")

# 문자열 띄어쓰기는 콤마로 한다.

print("life","is","too short")

# 한 줄에 결괏값 출력하기 (end)

for i in range(10):
    print(i, end=' ')
# >> 0 1 2 3 4 5 6 7 8 9
