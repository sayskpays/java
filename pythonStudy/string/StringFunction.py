# 문자열 함수


# 문자 개수 세기
a = "hobby"
bCount = a.count('b')
print(bCount)

# 문자 위치 알려주기 1
# 만약 문자나 문자열이 존재하지 않는다면 -1 반환
b = "Python is best choice"
bFind = b.find('b')
print(bFind)

# 문자 위치 알려주기 2
# 문자나 문자열이 존재하지 않을 경우 Error 발생
c = "Life is too short"
cFind = c.index("t")
print(cFind)

# 문자열 삽입
f = ","
print(f.join('abcd'))

# 소문자를 대문자로 바꾸기
d = "hi"
print(d.upper())

# 대문자를 소문자로 바꾸기
g = "HI"
print(g.lower())

# 공백 지우기
h = "      hi  "
print(h.lstrip())
print(h.rstrip())
print(h.strip())

# 문자열 바꾸기
j = "Life is too long"
j.replace("Life" , "Your leg")

# 문자열 나누기
k = "Where is my company"
k.split()
k1 = "Where:is:my:company"
k.split(':')
print(k.split(':'))    







