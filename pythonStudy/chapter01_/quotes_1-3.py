# 1장 파이 맛보기 예제 1-3

# 딕셔너리
quotes = {"Moe": "A wise guy, huh?",
          "Larry": "Ow!",
          "Curly": "Nyuk nynu",
          }

stooge = "Curly"
print(stooge, "Says:", quotes[stooge])

a = [2, 4, 6]
b = a

a[0] = 99
print(a)
print(b)

div_data = divmod(9, 5)
print(div_data[0])

if bool(div_data[0]):
    print("HELLO WORLD")
else:
    print("HELLO HELL")

cha_data = 99
print(int(cha_data + cha_data))

sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + \
      5 + 6 + 7 + 8
print(sum)

tweet_limit = 280
tweet_string = "Blash" * 50

diff = tweet_limit - len(tweet_string)


if diff >= 0:
    print()
else:
    print()

# 바다 코끼리 연산자 사용   :=
# 따로 diff 변수를 선언해 주지 않고 한 줄로 처리
tweet_limit = 280
tweet_string = "Blash" * 50
if diff := tweet_limit - len(tweet_string) >= 0:
    print()
else:
    print()
