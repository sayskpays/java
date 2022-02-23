# URL에서 추출한 JSON 텍스트를 파이썬 자료구조로 변환

import webbrowser
import json
from urllib.request import urlopen

print("Let's find an old Website")
# URL 입력 내용을 출력하고, 사용자에게 URL을 입력 받아서 site 변수에 저장한다.
site = input("Type a website URL: ")
era = input("Type a year, month , and dat, like 20210223 : ")
# 입력한 사이트와 날짜를 토대로 문자열 변수 URL을 구성한다. ?[var_name=%s]&[var_name2=%s]
url = "http://archive.org/wayback/available?url=%s&timestamp=%s" %(site,era)
# 해당 URL의 웹서버에 연결하여 웹서비스를 요청한다.
response = urlopen(url)
contents = response.read()
text = contents.decode("utf-8")
data = json.load(text)
try:
    old_site = data["archived_snapshots"]["closest"]["url"]
    print("Found this copy : , old site")
    print("It should appear in yor browser now.")
    webbrowser.open(old_site)
except:
    print("Error exist")

