
for i in range(5):
    print(str(i))
print()

for i in range(5, 10):
    print(str(i))
print()

for i in range(0,10,3):
    print(str(i))
print()

# 몇번째 반복인지 확인하는 코드

array = [273,32,103,57,52]

for i in range(len(array)):
    print("{}번째 반복: {}".format(i, array[i]))

