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
        
    
    