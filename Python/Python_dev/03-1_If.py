# if 문

# and or not 
# x or y : x와 y 둘중에 하나만 참이여도 참이다.
# x and y : x와 y 모두 참이어야 참이다.
# not x : x가 거짓이면 참이다.

from email import message


money = 2000
card = True

if money >= 3000 or card:
    print("Taxi")
else:
    print("Walk")
    
    
# x in s , x not in s

1 in [1,2,3] # >> True
1 not in [1,2,3] # >> False

pocket = ['paper', 'cellphone', 'money']
if 'money' in pocket:
    print("TAXI")
else:
    print("WALK")
    
# 조건문에서 아무 일도 하지 않게 설정하고 싶을 때 (pass)
# 주머니에 돈이 있으면 가만히 있고 주머니에 돈이 없으면 카드를 꺼내라
pocket_pass = ['paper','money','cellphone']
if 'money' in pocket:
    pass
else:
    print("CARD")
    
    
# elif > 이전 조건문이 거짓일 때 수행

pocket_ef = ['paper', 'cellphone']
care = True
if 'money' in pocket_ef:
    print("TAXI")
elif card:
    print("TAXI")
else:
    print("WALK")
    
# 조건부 표현식 
score = 50

if score >= 60:
    message = "success"
else:
    message = "failure"
    
message = "success" if score >= 60 else "failure"



