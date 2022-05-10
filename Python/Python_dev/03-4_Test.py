# if , while , for 연습문제

# Q1. 다음 코드의 결괏값은 무엇일까?

st_value = "Life is too short , you need python"

if "wife" in st_value: print("wife")
elif "python" in st_value and "you" not in st_value : print("python")
elif "shirt" not in st_value : print("shirt")
elif "need" in st_value: print("need")
else : print("none")

# Q2. while 문을 사용해 1부터 1000까지의 자연수 중
# 3의 배수의 합을 구해 보자.

flag = True
num = 0
hap = list()
while flag:
    num += 1
    if num  % 3 == 0 :
         hap.append(num)
         print(hap)
    elif num > 1000:
        flag = False
        break
    
# Q3. *찍는 프로그램을 만들어 보자.

star = '*'
flag = True
num = 1 
while flag:
    print(star*num)
    num += 1
    if num > 5 :
        flag = False
        break
    
# Q4. for 문을 사용해 1부터 100까지 숫자를 출력해보자.

result = [x for x in range(1,1000)]
print(result)

"""
Q5. A 학급에 총 10명의 학생이 있다. 이 학생들의
중간고사 점수는 다음과 같다
[70, 60, 55, 75, 95, 90, 80, 80, 85, 100]
for문을 사용하여 A 학급의 평균 점수를 구해보자.
"""

class_list = [70, 60, 55, 75, 95, 90, 80, 80, 85, 100]

for x in class_list:
    
    class_avg = x / len(class_list)
    print(class_avg)    

"""
리스트 중에서 홀수에만 2를 곱하여 저장하는 다음 코드가 있다.
number = [1,2,3,4,5]
result = []

for n in numbers:
    if n % 2 == 1:
        result.append(n*2)
        
위 코드를 리스트 내포를 사용하여 표현해 보자.
"""    

number = [1,2,3,4,5]

result = [num*2 for num in number if num % 2 == 1]

print(result)



    