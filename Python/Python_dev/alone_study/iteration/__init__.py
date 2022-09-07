
a, b, c, d, e, f = map(int, input().split(" "))

list_data = list()
right_list = list()
piece = (1, 1, 2, 2, 2, 8)
right_data = None
list_data.append(a)
list_data.append(b)
list_data.append(c)
list_data.append(d)
list_data.append(e)
list_data.append(f)

for i in range(6):

    input_var = list_data[i]
    right_data = -(input_var - piece[i])
    right_list.append(right_data)


print("{} {} {} {} {} {}".format(right_list))

