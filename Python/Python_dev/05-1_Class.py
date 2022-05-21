
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

