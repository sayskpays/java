# ex_dic = {
#     "keyA": "valueA",
#     "keyB": "valueB",
#     "keyC": "valueC"
# }
#
# print("items():" ,ex_dic.items())
#
# for key, element in ex_dic.items():
#     print(f'dic[{key}]={element}')

# array = []
#
# for i in range(0,20,2):
#     print(i)
#     array.append(i*i)
# print(array)
#
# array = [i*i for i in range(0, 20, 2)]
# print(array)

# array = ["사과", "자두", "초콜릿", "바나나", "체리"]
# output = [fruit for fruit in array if fruit != "초콜릿"]
#
# print(output)

# number = int(input("정수 입력>"))
#
# if number % 2 == 0:
#     print(("입력한 문자열은 {}입니다.\n"
#           "{}은 짝수입니다."
#           ).format(number,number))
#     print(f"입력한 문자열은 {number}입니다.\n"
#           f"{number}은 짝수입니다.")
#
#
# if number % 2 == 0:
#     print("\n".join(["입력한 문자열은 {}입니다.",
#                      "{}은 짝수 입니다."])
#           .format(number,number))

# def fac(n):
#     if n == 0:
#         return 1
#     else:
#         return n * fac(n-1)

# print("1!:",fac(1))
# print("2!:",fac(2))
# print("3!:",fac(3))

# def fiboancci(n):
#     if n == 1:
#         return 1
#     if n == 2:
#         return 1
#     else:
#         return fiboancci(n-1) + fiboancci(n-2)

# counter = 0
#
# def fibo(n):
#     print(f"{n}의 피보나치를 구합니다.")
#     global counter
#     counter += 1
#
#     if n == 1:
#         return 1
#     if n == 2:
#         return 1
#     else:
#         return fibo(n-1) + fibo(n-2)
#
# fibo(10)
# print(f"fibo 계산에 활용된 덧셈 횟수는 {counter}번 입니다.")

# dictionary = {
#     1: 1,
#     2: 1
# }
#
# def fibo(n):
#     if n in dictionary:
#         return dictionary[n]
#     else:
#         output = fibo(n-1) + fibo(n-2)
#         dictionary[n] = output
#         return output
#
# print(fibo(2))
# print(fibo(10))

# 리스트 평탄화
#
def flat_array(data):
    output = []

    # 받아온 데이터 요소를 하나씩 확인하면서 리스트인지 리스트가 아닌지 확인
    for item in data:
        if type(item) == list:
            output += flat_array(item)
        else:
            output.append(item)

    return output

example = [[1,2],[3,4]]
print(flat_array(example))
# # >>> [1, 2, 3, 4, 5, 6, 7, 8, 7, 8, 9]


# append와 += 로 list 요소를 추가할때 차이점

a = [1,2,3]
b = [4,5,6]
a += b

print(a)


