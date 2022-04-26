# Key , Value

# Key는 변하지 않는 값을 사용하고 , Value에는 변하는 값과 변하지 않는 값 모두 사용할 수 있다.

# Key 값에 리스트는 사용 불가능 하지만, 튜플은 가능하다 mutable, immutable 차이

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




###############딕셔너리 관련 함수들##################

# 1. Key 리스트 만들기 (keys)

b1 = {'name':'pey','phone':'01000000000','birth':'1118'}
b1.keys() # >> dict_keys(['name','phone','birth']) 
# 만약 dict_keys 함수를 리스트로 변경하고 싶으면 list(b1.keys())를 하면 된다.
# dict_keys 함수는 append, insert, pop, remove , sort 함수는 수행할 수 없다.

for k in b1.keys():
    print(k) # name , phone , birth

# 2. Value 리스트 만들기 (values)

b1.values() # >> dict_values(['pey', '0100000000','1118'])


# 3. Key , Value 쌍 얻기 (items)

b1.items() # dict_items([('name','pey'),('phone','01000000'),('birth','1118')])









