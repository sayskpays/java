# for 문

"""
for문의 기본 구조

for 변수 in 리스트(또는 튜플, 문자열):
    수행할 문장1
    수행할 문장2
    
"""

# 1. 전형적인 for문

test01 = ['one','two','three']

for i in test01:
    print(i)

# 2. 다양한 for문의 사용

test02 = [(1,2), (3,4), (5,6)]
for (first,last) in test02:
    print(first + last)
# (first , last) = (1,2)


# 3. for문의 응용

marks = [90,25,67,45,80]

number = 0

for mark in marks:
    number += 1
    if mark >= 60:
        print("%d번 학생은 합격입니다." % number)
    else:
        print("%d번 학생은 불합격 입니다." % number)


# 4. for문과 continue

marks_ = [90,25,67,45,80]

number = 0
for mark_ in marks_:
    number += 1
    if mark_ < 60:
        continue
    print("%d번 학생 축하합니다. 합격입니다." % number)


# 5. for문과 함꼐 자주 사용하는 range 함수

test05 = range(10) # >> 0부터 10 미만의 숫자를 포함
range(1,11) # >> 1부터 11 미만의 숫자를 포함


# 6. range 함수의 예시 살펴보기

# 1 부터 10 까지 더하기

add = 0 
for i in range(1,11):
    add = add + i


# range 함수 예제

range_marks = [90,25,67,45,80]
for number in range(len(range_marks)):
    if range_marks[number] < 60:
        continue
    print("%d번 학생 축하합니다. 합격입니다." % (number+1))
    
# for와 range를 이용한 구구단

for i in range(2,10):
    for j in range(1,10):
        print(i*j, end=" ") # end를 넣어준 이유 : 그 줄에 계속 출력
    print('') # 2단 , 3단 넘어갈때 다음 줄 부터 출력하게 해주는 문장
    

# 리스트 내포 사용하기

list_com = [1,2,3,4]
result = []

for num in list_com:
    result.append(num*3) # >> [3,6,9,12]





    





    
     