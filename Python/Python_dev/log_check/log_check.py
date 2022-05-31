# LOG CHECK

from datetime import datetime , timedelta
import fileinput
import glob


# Variable
read_file_path = "C:/dev/hello.txt"


def searchFile(interface_id):
    
    str_data = ""
    flag = True
    
    
    print("Input IF ID : %s" %interface_id.upper())
    
    with fileinput.input(glob.glob(read_file_path)) as f:
        for line in f:
           
            
            # for interface_id in enumerate(line):    
            #     print(interface_id)
                # if line.find(interface_id) !=-1 :
                #     list_data = list()
                #     list_data.append(datetime.strptime(line[:24],'%Y %b %d %H:%M:%S:%f'))
                #     print(list_data)
                # else : 
                #     pass
                       
        #     if line.find(interface_id.casefold()) !=-1 :
        #         str_data = line
                
        #         error_time = datetime.strptime(str_data[:24],'%Y %b %d %H:%M:%S:%f')

        #         print(error_time)               

        #         while(flag):
        #             error_time = error_time + timedelta(milliseconds=1)
        #             time_result = error_time.strftime('%Y %b %d %H:%M:%S:%f')
        #             # print(time_result)
                    
        #             if line.find(time_result) == -1:
        #                 # print(time_result)
        #                 flag = False
        #             else:
        #                 pass
            
        #     else:
        #         pass
            
        # print("Error Occurrence Time : %s " %line[:24])
        # print("Error Data : %s " %line)

searchFile(str(input("insert data: ")))
                

    