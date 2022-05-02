from copy import copy

# 자료형의 값을 저장하는 공간, 변수

# 변수가 가리키는 메모리 주소 확인

a = [1,2,3]
id(a) # >> 357982174981

# 리스트를 복사하고자 할 때

b = [1,2,3]
c = b # c는 b와 완전 동일하다.

id(b)
id(c) # >> 같은 주소를 가리키고 있다.

b is c # >> Ture

b[1] = 4 
b # [1,4,3]
c # [1,4,3]

# c 변수를 생성할 때 b의 값을 가져오면서 b와는 다른 주소를
# 가리키도록 하는 방법

# 1. [:] 이용
z = [1,2,3]
x = z[:]

z[1] = 4 
z # [1,4,3]
x # [1,2,3]

# 2. copy 모듈 이용

q = [1,2,3]
w = copy(q)
w = q.copy()

w is q # >> False

# 변수를 만드는 여러 가지 방법

e , r = ('python','life')
(e,r) = ('python','life')
[e,r] = ('python','life')
e=r='python'

# 두 변수의 값 바꾸기

e = 3
r = 5 
e,r = r,e




 
