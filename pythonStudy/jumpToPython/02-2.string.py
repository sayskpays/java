# 문자열 만드는 방법


stringA = '''Life is too short, Yon need python'''
stringB = """Life is too short, Yon need python"""

# 여러 줄인 문자열을 변수에 대입하고 싶을 때

multiline01 = '''
Life is too short
You need Python    
'''

multiline02 = """
Life is too short
You need Python    
"""

# \n 줄바꿈


# 문자열 곱하기

print("=" * 50)
print("My Program")
print("=" * 50)

# 문자열 길이 구하기 -----------------------------------

a = "Life is too short"
len(a)

# 문자열 인덱싱과 슬라이싱

ab = "Life is too short , You need Python"
ab[3]
# 가장 마지막 문자 출력 == n
ab[-1]

# Life 슬라이싱 : [시작번호 : 끝 번호 -1 ] 까지 출력 된다.
ab[0:4]

# 슬라이싱으로 문자열 나누기

abc = "20220417Rainy"
date = a[:8]
weather = a[8:]

# 문자열 바꾸기

abcd = "Pithon"
a[:1]
a[2:]
a[:1]+'y'+a[2:]

# 문자열 포매팅

a01 = "I eat %d apples" % 3
a02 = "I eat %s apples" % "five"

number = 10
day = "three"
print("I ate %d apples. so I was sick for %s days" % (number, day))

# 포맷 코드 숫자와 함께 사용하기










