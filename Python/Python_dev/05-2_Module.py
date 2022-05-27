# 05-2 모듈

"""
모듈이란 함수나 변수 또는 클래스를 모아 놓은 파일이다.
모듈은 다른 파이썬 프로그램에서 불러와 사용할 수 있게끔 만든
파이썬 파일이라고도 할 수 있다.
"""

# mod1.py
# 파이썬 확장자 .py로 만든 파이썬 파일은 모두 모듈이다.

# def add(a,b):
#     return a+b

# def sub(a,b):
#     return a-b

# 모듈 불러오기

"""
!! 반드시 .py(모듈) 을 저장한 디렉터리로 이동한 다음 
1. python 대화형 인터프리터로 들어간다.
2. import mod1
3. print(mod.add(3,4))
"""

"""
 * import는 현재 디렉터리에 있는 파일이나 , 
 파이썬 라이브러리가 저장된 디렉터리에 있는 모듈만 불러올 수 있다.
 파이썬 라이브러리는 파이썬을 설치할 때 자동으로 설치되는 파이썬 모듈을 말한다.
"""


"""
때로는 함수를 사용할 때 mod1.add , mod1.sub 처럼 쓰지 않고 add, sub 처럼 모듈 이름 없이
함수 이름만 쓰고 싶은 경우도 있다. 
이럴때는 from <모듈이름> import <모듈함수> 를 사용하면 된다.

ex) from mod1 import add, sub
    add(3,4)
    sub(3,4)

"""

# if __name__="__main__": 의 의미

"""
이번에는 mod1.py 파일을 다음과 같이 변경

"""

# def add(a,b):
#     return a+b

# def sub(a,b):
#     return a-b

# print(add(1,4))
# print(sub(4,2))


"""
-- add(1,4) , sub(4,2) 의 결과를 출력하는 다음 문장을 추가

하지만 이렇게 되면
Python 인터프리터에서 import mod1을 하는 순간 print 값이 출력된다.

"""

def add(a,b):
    return a+b

def sub(a,b):
    return a-b

if __name__ == "__main__":
    print(add(1,4))
    print(sub(4,2))

"""
if __name__ == "__main__": 을 사용하면 C:\doit\python mod1.py 처럼 직접 이 파일을 실행 할때는
__name__="__main__"이 참이 되어 if문 다음 문장이 수행된다.

하지만 대화형 인터프리터나 다른 파일에서 이 모듈을 불러서 사용할 때는 거짓이 되어
if문 다음 문장이 수행되지 않는다.

import mod1
mod1.__name__
>> 'mod1' 

"""

# 클래스나 변수 등을 포함한 모듈

# mod2.py

PI = 3.14

class Math:
    def solv(self,r):
        return PI * (r ** 2)
    
def add(a,b):
    return a+b

# 모듈 안에 있는 클래스를 사용하려면 "."(도트 연산자)로 클래스 이름 앞에
# 모듈 이름을 먼저 입력한다.

# print(mod2.add(mod2.PI, 4.4))


# 다른 파일에서 모듈 불러오기
"""
다른 파이썬 파일에서 이전에 만들어 놓은 모듈을 불러와서 사용하는 방법

아래의 예제가 정상적으로 실행되기 위해서는 modtest.py , mod2.py 파일이 동일한
디렉터리에 있어야 한다.
"""

# modtest.py

import mod2

result = mod2.add(3,4)
print(result)

# 모듈을 불러오는 또 다른 방법

"""
모듈을 저장한 디렉터리로 이동하지 않고 모듈을 불러와서 사용하는 방법

1. sys.path.append 사용하기

먼저 sys 모듈을 불러온다.

import sys

sys.path
>> 파이썬 라이브러리가 설치되어 있는 디렉터리를 보여준다. 
만약 파이썬 모듈이 위 디렉터리에 들어 있다면 모듈이 저장된 디렉터리로 이동할 필요 없이
바로 불러서 사용할 수 있다.

소스 코드 내에서 경로는 / or \\를 사용해야 한다.

ex) sys.path.append("C:/dev/test")
>> 이렇게 하면 sys.path에 추가 된다.


* 이렇게 되면 모듈이 있는 디렉터리로 이동하지 않고 모듈을 사용할 수 있다.


2. PYTHONPATH 환경 변수 사용하기

C:\test> set PYTHONPATH=C:\doit\mymod
C:\test> python
>>> import mod2
>>> print(mod2.add(3,4))


"""










