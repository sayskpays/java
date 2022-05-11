# 04-1 함수

""" 
def 함수명(매개변수):
    <수행할 문장1>
    <수행할 문장2>
"""

def add(a,b): # > 매개변수
    return a+b

a = 3
b = 4
c = add(a,b) # > 인수
print(c)

# 매개변수 지정하여 호출하기

def add(a,b):
    return a+b

result = add(a=3,b=7)

# 입력값이 몇 개가 될지 모를 때

"""
def 함수이름(*매개변수):
    <수행할 문장>
"""

def add_many(*args):
    result = 0
    for i in args:
        result = result + i
    return result

result = add_many(1,2,3)

def add_mul(choice, *args):
    if choice == "add":
        result = 0
        for i in args:
            result = result + i
    elif choice == "mul":
        result = 1
        for i in args:
            result = result * i
    return result

result = add_mul('add', 1,2,3,4,5)
print("result : %d" % result)

# 키워드 파라미터 
# 매개변수 이름 앞에 **을 붙이면 key=value 형태의 딕셔너리에 저장된다.

def print_kwargs(**kwargs):
    print(kwargs)
    
print_kwargs(a=1) # >> {'a':1}
print_kwargs(name='foo',age=3) # >> {'age':3,'name':'foo'}

# 함수의 결괏값은 언제나 하나이다.

def add_and_mul(a,b):
    return a+b, a*b # >> 해당 return 값은 (a+b, a*b) 튜플로 돌려준다.

result = add_and_mul(3,4) 
result1 , result2 = add_and_mul(3,4) # result1 = 3 , result2 = 4


"""
return의 또 다른 쓰임새
특별한 상황일 때 함수를 빠져나가고 싶다면 return을 단독으로 써서
함수를 즉시 빠져 나갈 수 있다.
"""

def say_nick (nick):
    if nick == "바보":
         return
    print("나의 별명은 %s 입니다." % nick)
    

# 매개변수에 초깃값 미리 설정하기

def say_myself(name,old,man=True):
    print("나의 이름은 %s 입니다." % name)
    print("나이는 %d살 입니다." % old)
    if man:
        print("남자입니다.")
    else:
        print("여자입니다.")
        
    
# 함수 안에서 선언한 변수의 효력 범위

a = 1

def vartest(a):
    a = a+1













