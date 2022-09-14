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

number = int(input("정수 입력>"))

if number % 2 == 0:
    print(("입력한 문자열은 {}입니다.\n"
          "{}은 짝수입니다."
          ).format(number,number))
    print(f"입력한 문자열은 {number}입니다.\n"
          f"{number}은 짝수입니다.")


if number % 2 == 0:
    print("\n".join(["입력한 문자열은 {}입니다.",
                     "{}은 짝수 입니다."])
          .format(number,number))