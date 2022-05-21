
# class CalCulator:
#     def __init__(self):
#         self.result = 0

#     def add(self,num):
#         self.result += num
#         return self.result

# cal1 = CalCulator()
# cal2 = CalCulator()

# print(cal1.add(3))
# print(cal2.add(5))

"""
클래스로 만든 객체를 인스턴스라고 한다. 그렇다면 객체와 인스턴스의 차이는 무엇일까?
a = Cookie() 일때
a는 객체
a 객체는 Cookie의 인스턴스
Cookie는 Class
"""

class Calculator:
    
    def __init__(self,first,second):
        self.first = first
        self.second = second
    
    def add(self):
        result = self.first + self.second
        return result
    
    def sub(self):
        result = self.first - self.second
        return result

    def div(self):
        result = self.first / self.second
        return result
    
test = Calculator(4,2)
print(test.sub())

# 클래스의 상속

# 보통 기존 클래스를 변경하지 않고 기능을 추가하거나 기존 기능을 변경하려고 할때 사용
# 기존 클래스가 라이브러리 형태로 제공되거나 수정이 허용되지 않는 상황이라면 상속 사용

class MoreCalculator(Calculator):
    def pow(self):
        result = self.first ** self.second
        return result

pow_test = MoreCalculator(2,2)
print(pow_test.pow())



# 메소드 오버라이딩
"""
Calculator 객체에 4와 0을 설정하고 div 메서드를 호출하면 에러 발생
0으로 나눌 때 오류가 아닌 0을 돌려주도록 만들고 싶다면 메소드 오버라이딩 적용
"""

class SafeCalculator(Calculator):
    def div(self):
        if self.second == 0:
            return 0
        else:
            return self.first/self.second

"""
SafeCalculator 클래스는 Calculator 클래스에 있는 div 메서드를 동일한 이름으로 다시 작성
부모 클래스에(상속한 클래스) 있는 메서드를 동일한 이름으로 다시 만드는 것을
메서드 오버라이딩(덮어쓰기) 라고 한다.
이렇게 메서드를 오버라이딩 하면 부모클래스의 메서드 대신 오버라이딩한 메서드가 호출된다.
"""

test01 = SafeCalculator(2,0)
print(test01.div())


# 클래스 변수

class Family:
    last_name = "kim"

# 클래스의 변수는 두가지 방법으로 다 사용 가능하다.
print(Family.last_name)

a = Family()
print(a.last_name)

Family.last_name = "park"
print(a.last_name)

# 클래스 변수 값을 변경했더니 클래스로 만든 객체의 last_name 값도 모두 변경된다는 것을
# 확인할 수 있다. 즉 클래스 변수는 클래스로 만든 모든 객체에 공유된다는 특징이 있다.

# ! 하지만 클래스 변수를 바꾸기 위해서는 <클래스명>.<변수명> = <바꾸고자 하는 값>으로
# 바꿔야 한다.


"""
위의 예제에서 a.last_name을 다음처럼 변경하면 어떻게 될까?
a.last_name = "choi"

이렇게 하면 Family 클래스의 last_name이 바뀌는 것이 아니라 a 객체에 last_name이라는 객체변수가
새롭게 생성된다. 
즉 ,객체 변수는 클래스 변수와 동일한 이름으로 생성할 수 있다.
물론 a.last_name은 이제부터 Family 클래스의 last_name이 아닌 객체 a의 객체변수 last_name을 가리킨다.
"""








