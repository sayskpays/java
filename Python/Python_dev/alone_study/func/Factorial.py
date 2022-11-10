#
# def power(item):
#     return item * item
#
# def under_3(item):
#    return item < 3
#
#
# list_input_a = [1,2,3,4,5]
#
# output_a = map(power, list_input_a)
# print(f'map 함수 실행결과 {output_a}') # return 값으로 새로운 리스트를 구성
# print(f'map 함수 list 실행결과 {list(output_a)}')
#
# output_b = filter(under_3, list_input_a)
# print(f'filter 함수 실행결과 {output_b}') # return 값이 true 인것으로 새로운 리스트를 구성
# print(f'filter 함수 list 실행결과 {list(output_b)}')
#
# lambda 매개변수 : 리턴값
power = lambda item : item * item
under = lambda item: item < 3

list_input_a = [1,2,3,4,5]

output_a = map(power,list_input_a)
print(list(output_a))

output_b = filter(under, list_input_a)
print(list(output_b))

