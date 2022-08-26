
# 정수 나누기 연산자
print(3 //2 ) # 1

# 문자열

# ============================= format()함수 =============================
# -> 숫자를 문자열로 변환
# 중괄호의 개수와 format 함수 괄호 안 매개변수의 개수는 반드시 같아야 한다.

"{}".format(10)
"{}{}".format(10,20)
format_a = "{}만 원".format(5000)

# :d 를 주면 매개변수로 정수만 올 수 있다.
output_a = "{:d}".format(52)
# + 처럼 기호 붙이기 가능
output_a_1 = "{:-d}".format(52)
# 받는 파라미터의 기호를 그대로 가져옴
output_a_2 = "{: d}".format(-52)

# 5칸 띄고 출력
output_b = "{:5d}".format(52)
# 총 5칸을 0으로 채우고 출력
output_c = "{:05d}".format(52)

# --------------------------------------------------------------------
# 부동 소수점 표현
output_float = "{:f}".format(52.273)
# 소수점 아래 자릿수 지정 (이때 자동 반올림)
output_float_1 = "{:.1f}".format(52.273)
# 의미 없는 소수점 제거하기
output_float_2 = "{:g}".format(59.0)

# =====================================================================


# 문자열의 구성 파악하기 : isXX()
# -> 문자열이 소문자로만 구성되어 있는지, 알파벳으로만 구성되어 있는지, 숫자로만 구성되어 있는지 확인
# -> return type == boolean

# Method 목록은 Notion 참조

# =====================================================================

# 문자열 찾기 : find()와 rfind()
# -> 문자열 내부에 특정 문자가 어디 위치하는지 확인 하고자 할 때

# find() : 왼쪽부터 찾아서 처음 등장하는 위치를 찾습니다.
# rfind() : 오른쪽부터 찾아서 처음 등장하는 위치를 찾습니다.

# =====================================================================

# 문자열 in 연산자

print("안녕" in "안녕하세요") # True

# ====================================================================

# 문자열 자르기 : split()00000000

split_a = "10 20 30 40 50".split(" ")
print(split_a) # return list type

# ====================================================================

"3+4 = " + (3+4) # 문자열과 int 값과 연결 연산자를 사용하면 TypeError 발생
"3+4 = " + str(3+4) # 이렇게 통일 시켜줘야 하는데 이것 보다는
"3+4 = {}".format(3+4)  # 이렇게 코드를 쓰는다






