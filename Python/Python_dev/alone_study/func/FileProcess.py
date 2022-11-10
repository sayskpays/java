import random

korean_list = list("가나다라마바사아자차카타파하")


with open("D:\\info.txt", "w") as file:
    for i in range(1000):

        name = random.choice(korean_list) + random.choice(korean_list)
        weight = random.randrange(40, 100)
        height = random.randrange(140, 200)

        file.write(f'{name}, {weight}, {height}\n')

with open("D:\\info.txt", "r") as file:
    for item in file:
        (name, weight, height) = item.strip().split(",")

        if (not name) or (not weight) or (not height):
            continue
        bmi = int(weight) / ((int(height) / 100) ** 2)
        result = ""
        if 25 <= bmi:
            result = "과체중"
        elif 18.5 <= bmi:
            result = "정상 체중"
        else:
            result = "저체중"

        print('\n'.join([
            f'이름:{name}',
            f'몸무게:{weight}',
            f'키:{height}',
            f'bmi:{round(bmi,3)}',
            f'결과:{result}'
        ]))
        print()

