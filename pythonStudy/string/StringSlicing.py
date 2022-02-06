
a = "Life is too short , You need Python"
b = a[0] + a[1] + a[2] + a[3]

# 문자열 슬라이싱

ab = "Life is too short , You need Python"
print(ab[0:4])
print(ab[19:])

data = "202220206Rainy"
date = data[:9]
weather = data[9:]

print("date : " + date)
print("weather : " + weather)

# 문자열 요소 변경 불가능 에러 발생
# test = "Pithon"
# print(test[1])
# test[1] = 'y'
# print(test)

# 오류가 발생하지 않도록 문자열 변경 방법
test1 = "Pithon"
# P
test1[:1]
# thon
test1[2:]

newData = test1[:1] + 'y' + test1[2:]
print(newData)
