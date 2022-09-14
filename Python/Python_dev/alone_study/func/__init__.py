#
# def print_n_times(n, *values):
#
#     for i in range(n):
#         for value in values:
#             print(value)
#         print()
#
#
# print_n_times(3,"안녕","하이","반갑")

#
# def print_n_times(value, n=2):
#     for i in range(n):
#         print(value)
#
# print_n_times("안녕하세요")

# def print_n_times(n=2, *values):
#     for i in range(n):
#         for value in values:
#             print(value)
#         print()
#
#
# print_n_times("안녕하세요","즐거운")

def sum_all(start,end):
    output = 0

    for i in range(start, end+1):
        output += i

    return output

print(sum_all(500,5015))