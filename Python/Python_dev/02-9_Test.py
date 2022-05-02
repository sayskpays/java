# 홍길동 씨의 과목별 점수는 다음과 같다. 홍길동 씨의 평균 점수를 구해 보자.
# 국어 80 영어 75 수학 55

korean = 80
english = 75
math = 55

print((korean+english+math) // 3)

# 자연수 13이 홀수 인지 짝수인지 판별

number = 13 

if number%2 ==0:
    print("짝수입니다.")
else:
    print("홀수입니다.")
    
# 홍길동 씨의 주민등록번호는 881120-1068234 
# 홍길동 씨의 주민등록 번호를 연월일 yyyymmdd 부분과 그 뒤의 숫자
# 부분으로 나누어 출력해보자

birth_number = "881120-1068234"
birth = birth_number[:6]
number = birth_number[7:]

if birth_number[-7]=='1':
    print("남자입니다.")
    print(birth)
    print(number)

else:
    print("여자입니다.")
    print(birth)
    print(number)
    
# 다음과 같은 문자열 a:b:c:d가 있다. 문자열의 replace 함수를 사용하여
# a#b#c#d 로 바꿔서 출력해보자.

st = "a:b:c:d"
st_replace = st.replace(":","#")

print(st_replace)

# [1,3,5,4,2] 리스트를 [5,4,3,2,1] 로 만들어보자

list_test = [1,3,5,4,2]

test01 = list(list_test.sort())
#complete_list = test01.reverse()

for a in test01:
    print(a)
    


    


