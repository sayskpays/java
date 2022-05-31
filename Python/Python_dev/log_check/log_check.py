# LOG CHECK

from datetime import datetime , timedelta
import fileinput
import glob


# Variable
read_file_path = "C:/dev/hello.txt"


def searchFile(interface_id):
    
    if interface_id != None or '\s'  :
        
        with fileinput.input(glob.glob(read_file_path)) as f:
            for line in f:
            
                str_data = line.lower()
                interface_id = interface_id.lower()
                list_all = list(str_data.split("\n"))
                list_check = list()
                list_check_date = list()
                
                for x in list_all:
                    if interface_id in x:
                        list_check.append(x)
                        
                        for y in list_check:
                            list_check_date.append(y[:24])
                
                print(list_check)        
                print(list_check_date)
                
                # print("%s" %line[:24])
                # print("%s" %line)
                
                # print(str_data)
                # print(type(str_data))
                
                    
                # if line.find(interface_id) !=-1 :
                #     list_data = list()
                #     for interface_id in line:
                #         # datetime.strptime(line[:24],'%Y %b %d %H:%M:%S:%f')
                #         list_data.append(line)
                        
                #     print(list_data)
                # else : 
                #     pass
                        
                # if line.find(interface_id.casefold()) !=-1 :
                #     str_data = line
                    
                #     error_time = datetime.strptime(str_data[:24],'%Y %b %d %H:%M:%S:%f')

                #     print(error_time)               

                #     while(flag):
                #         error_time = error_time + timedelta(milliseconds=1)
                #         time_result = error_time.strftime('%Y %b %d %H:%M:%S:%f')
                #         # print(time_result)
                        
                #         if line.find(time_result) == -1:
                #             # print(time_result)
                #             flag = False
                #         else:
                #             pass
                # else:
                #     pass
    else:
        print("Please Input Data !")
            

searchFile(input("insert data: "))
                

    