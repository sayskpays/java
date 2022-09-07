
score = float(input("학점 입력 > "))

# 틀린 코드
if score == 4.5:
    pass
elif 4.2 <= score < 4.5:
    pass
elif 3.5 <= score < 4.2:
    pass

# 옳은 코드
if score == 4.5:
    pass
elif 4.2 <= score:
    pass
elif 3.5 <= score:
    raise NotImplementedError