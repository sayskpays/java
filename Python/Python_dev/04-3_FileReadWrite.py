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




