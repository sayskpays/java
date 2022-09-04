# 4 장 연습문제

# # Q1 . 주어진 자연수가 홀수인지 짝수인지 판별해 주는 함수 (is_odd)를 작성해 보자.

# def is_odd(num):
    
#     if num % 2 == 0:
#         print("짝수")
#     else:
#         print("홀수")
    
#     return num

# check_num = is_odd(5)


# # Q2 . 입력으로 들어오는 모든 수의 평균 값을 계산해 주는 함수를 작성해 보자.(단 입력으로 들어오는 수의 개수는 정해져 있지 않다.)
# # * 평균 값을 구할 때 len 함수를 사용해 보자.

# def insert_avg(*args):
#     result = 0
#     for i in args:
#         result = result + i /len(args) 
#     return result

# print(insert_avg(1,2,3,4,5))


# # Q3. 다음은 두 개의 숫자를 입력받아 더하여 돌려주는 프로그램이다.

# input1 = input("첫번째 숫자를 입력하세요:")
# input2 = input("두번쨰 숫자를 입력하세요:")

# total = int(input1) + int(input2)
# print("두 수의 합은 %d" % total)
    
# Q4. 다음 중 출력 결과가 다른 것 한 개를 골라 보자.

# print("you" "need" "python")
# print("you"+"need"+"python")
# print("you","need","python")
# print("".join(["you","need","python"]))

# # Q5. 다음은 "text.txt"라는 파일에 "Life is too short" 문자열을 저장한 후 다시 그 파일을
# # 읽어서 출력하는 프로그램이다.

# with open("C:/text.txt",'w') as f:
#     f.write("Life is too short")

# with open("C:/text.txt",'r')as f:
#     data = f.readline()
#     print(data)

"""
Q6. 
사용자의 입력을 파일(test.txt)에 저장하는 프로그램을 작성해보자.
(단 프로그램을 다시 실행하더라도 기존에 작성한 내용을 유지하고 새로 입력한 내용을 추가해야 한다.)
"""

# with open("C:/test.txt",'a') as f:
#     inputdata = str(input("insert data :"))+'\n'
#     f.write(inputdata)
    
# with open("C:/test.txt",'r')as f:
#     data = f.read()
#     print(data)

"""
Q7. 다음과 같은 내용을 지닌 파일 test.txt가 있다. 이 파일의 내용 중 "java"라는 문자열을
python으로 바꾸어서 저장해 보자.
"""

# q7_data = """
# Life is too short
# you need java
# """
# chage_data = q7_data.replace("java","python")
# print(chage_data)



