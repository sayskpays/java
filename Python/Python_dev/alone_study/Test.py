
# list_a = [1,2,3,4,5]
# list_reversed = reversed(list_a)
#
# print(list(list_reversed))
#
# for i in reversed(list_a):
#     print(i)



example_list = ['a','b','c']
# i = 0
#
# for item in example_list:
#     print(f'{i}번쨰 요소는 {item}입니다.')
#     i += 1
#
# for a in range(len(example_list)):
#     print(f'{a}번쨰 요소는 {example_list[a]}입니다.')

print(example_list)
print(list(enumerate(example_list)))

for i, value in enumerate(example_list):
    print(f'{i}번째 요소는 {value}입니다.')

