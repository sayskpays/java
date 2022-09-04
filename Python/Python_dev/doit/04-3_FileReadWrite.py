# 04-3 File Read Write

# File Create
# 프로그램을 실행한 디렉토리에서 파일 생성
f = open("new_file.txt",'w')
f.close()

# 파일 열기 모드 종류
# r - 읽기모드 w - 쓰기모드 a - 파일의 마지막에 새로운 내용을 추가 시킬 때
# / or \\ 로 경로 지정
f = open("C:/doit/새파일.txt", 'w')
f.close()



# 파일을 쓰기 모드로 열어 출력값 적기

f = open("C:/doit/새파일.txt", 'w')
for i in range(1,11):
    data = "%d번째 줄 입니다. \n" % i
    f.write(data)
f.close()

# 프로그램의 외부에 저장된 파일을 읽는 여러 가지 방법

# 1. readline 함수 이용하기

f = open("C:/doit/새파일.txt", 'r')
line = f.readline() 
print(line) # 가장 첫 번째 줄이 화면에 출력된다.
f.close()

# 2. readline 모든 줄 화면 출력

f = open("C:/doit/새파일.txt", 'r')
while True:
    line = f.readline() 
    if not line:break # readline()은 더 이상 읽을 줄이 없을 경우 빈 문자열("") 리턴
    print(line) # 모든 줄이 출력된다.
f.close()

# 3. readlines 함수 사용하기

f = open("C:/doit/새파일.txt", 'r')
lines = f.readlines()
for line in lines:
    line = line.strip() # 줄 끝의 줄 바꿈 문자를 제거한다.
    print(line)
f.close() # >> 모든 줄 읽어서 출력

# 4. read 함수 사용하기

f = open("C:/doit/새파일.txt", 'r')
data = f.read()
print(data) # >> 파일 전체 내용 출력
f.close()

# 파일에 새로운 내용 추가하기
# 쓰기 모드 'w'로 파일을 열 때 이미 존재하는 파일을 열면 그 파일의 내용이 모두 사라짐
# 원래 있던 값을 유지하면서 단지 새로운 값만 추가해야 할 경우 'a'로 열면 된다.

f = open("C:/doit/새파일.txt",'a')
for i in range(11,20):
    data = "%d번째 줄입니다.\n" %i
    f.write(data)
f.close()

# with문과 함꼐 사용하기
f = open("foo.txt", 'w')
f.write("life is too short, you need python")
f.close()

# 자동으로 열고 닫기
with open("foo.txt",'w')as f:
    f.write("life is too short, you need python")
    
# sys 모듈로 매개변수 주기
# argv[0]은 파일이름이 되고 argv[1] 부터는 뒤에 따라오는 인수가 차례대로 argv 요소가 된다.
# ex) python sys1.py aaa bbb ccc

import sys

args = sys.argv[1:]
for i in args:
    print(i)


    











