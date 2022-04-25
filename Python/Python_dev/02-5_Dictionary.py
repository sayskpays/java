# Key , Value

# Key는 변하지 않는 값을 사용하고 , Value에는 변하는 값과 변하지 않는 값 모두 사용할 수 있다.

dic = {'name':'pey', 'phone':'0100303030', 'birth':'1118'}

a1 = {'a':[1,2,3]}

# 1. 딕셔너리 쌍 추가, 삭제하기

a2 = {1:'a'}
a2[2] = 'b'
a2 # {1:'a', 2:'b'}

a2['name'] = 'pey'
a2 # >> {1:'a', 2:'b', 'name':'pey'}

a2[3] = [1,2,3]
a2 # >> {1:'a', 2:'b', 'name':'pey', 3:[1,2,3]}

del a2[1] 
a2 # >> {2:'b','name':'pey',3:[1,2,3]}

# 2. 딕셔너리에서 Key 사용해 Value 얻기

grade = {'pey':10 , 'juliet':99}
grade['pey'] # 10
grade['juliet'] # 99


