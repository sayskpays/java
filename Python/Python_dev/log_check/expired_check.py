from asyncio.windows_events import NULL
from datetime import datetime, timedelta
from genericpath import exists
import os
import subprocess

EMS_LOG_PATH = "C:/dev/test/Python/Python_dev/log_check/hello.txt"
PROCESS_LOG_PATH= "C:/dev/test/Python/Python_dev/log_check/process.txt"
EMS_ERROR_MESSAGE = 'error'


# EMS Error Flag 생성 
def searchLog():
    log_flag = False 

    try :
        with open(EMS_LOG_PATH,'r')as f:
            for line in f:
                list_all = list(line.lower().split("\n"))
                
                for data in list_all: 
                    if EMS_ERROR_MESSAGE in data:
                        log_flag = True
                        
    except FileNotFoundError or FileExistsError:
        print('========= Log File Not Exsist ===========')    
        
    return log_flag

# EMS Log 출력 
def searchFile():
    print("========== EMS Log ==============")
    
    try :
        with open(EMS_LOG_PATH,'r')as f:
            for line in f:
                list_all = list(line.lower().split("\n"))
                
                for data in list_all: 
                    if EMS_ERROR_MESSAGE in data:
                        # Expired Error Log
                        print(data)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
                        list_date = datetime.strptime(data[:24],'%Y %b %d %H:%M:%S:%f')
                                                     
    except FileNotFoundError or FileExistsError:
        print('========= Log File Not Exsist ===========')
        
    return list_date                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

# IF ID 찾기
def if_id(list_date,if_id):
    
    flag = True
    print(list_date)    

    # EMS 파일에서 Expired Error 시간
    list_date = list_date

    with open(PROCESS_LOG_PATH,'r')as f:
        for line in f:
            line = list(line.lower().split("\n"))
            
            for data in line: 
                if if_id in data:
                    # IF ID 전체 데이터 출력
                    print(data)
                    data = datetime.strptime(data[:24],'%Y %b %d %H:%M:%S:%f')
                    # 시간 datetime 출력
                    print(data)
                    
                    while(flag):
                        data = data + timedelta(milliseconds=1)
                        if list_date == data:                                                                                                       
                            break
                else:
                    break
 
            
    return "a"

if_id(searchFile(),input("Please Enter the IF ID : "))


# EMS , Process 재기동
    
def excute(log_flag):
    if log_flag == True:
        try : 
            os.chdir('/home/tibco/tibco/tra/5.11/bin/')
            print('=============EAI Process Stop================')
            os.system('./AppManage -stop -app EAI_FBL -user a -pw a -domain eai_domain')
            print('==================EMS KILL==================')
            os.system("kill $(ps -ef | grep 'tibemsd_8111' | grep -v 'color' | awk '{print $2}')")
            os.system("kill $(ps -ef | grep 'tibemsd.conf' | grep -v 'color' | awk '{print $2}')")
            
            print('=================EMS RESTART===================')
            os.chdir('/home/tibco/tibco/ems/8.4/bin/')
            subprocess.call(['sh ./tibemsd_8111.sh &'],shell=True)
            
            print('===============EAI Process restart================')
            os.chdir('/home/tibco/tibco/tra/5.11/bin/')
            os.system('./AppManage -start -app EAI_FBL -user a -pw a -domain eai_domain')
            print("================RESTART COMPLETED===================")
        except FileExistsError or FileExistsError:
            print('=========== EAI File Not Exsist===========') 
    else:
        print('============Does Not Exsist Expired Error Message==============')


