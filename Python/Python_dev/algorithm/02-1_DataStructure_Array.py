# Array -> List and Tuple

print('학생 그룹 점수의 합계와 평균을 구합니다.')

score1 = int(input('1번 학생의 접수를 입력하세요: '))
score2 = int(input('2번 학생의 접수를 입력하세요: '))
score3 = int(input('3번 학생의 접수를 입력하세요: '))
score4 = int(input('4번 학생의 접수를 입력하세요: '))
score5 = int(input('5번 학생의 접수를 입력하세요: '))

total = 0

total += score1
total += score2
total += score3
total += score4
total += score5

print(f'합계 {total}')
print(f'평균 {total/5}')



