# While 문

tree_hit = 0
while tree_hit < 10:
    tree_hit += 1
    print("나무를 %d번 찍었습니다." % tree_hit)
    if tree_hit == 10:
        print("나무 넘어갑니다.")



prompt = """
    1.Add
    2.Del
    3.List
    4.Quit
Enter number : """
number = 0
while number != 4:
    print(prompt)
    number = int(input())
    
# While문 강제로 빠져나가기 (break)

coffee = 10
money = 300
while money:
    print("돈을 받았으니 커피를 줍니다.")
    coffee = coffee -1 
    print("남은 커피의 양은 %d개 입니다." % coffee)
    if coffee == 0:
        print("커피가 다 떨어졌습니다. 판매를 중지합니다.")
        break
    
# While문의 맨 처음으로 돌아가기 (continue)

num_continue = 0
while num_continue < 10:
    num_continue += 1
    if num_continue % 2 == 0: continue
    print(num_continue)
    
# While 무한 루프 
# while True:

