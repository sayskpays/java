from datetime import datetime
import os
import subprocess


EMS_LOG_PATH = "/home/tibco/test/hello.txt"
EMS_ERROR_MESSAGE = 'sche'

def inputErrorTime(error_time):
    
    flag = False
    TIME_FORMAT = '%Y %b %d %H'
    error_time = datetime.strptime(error_time,TIME_FORMAT)
    
    try:
       with open(EMS_ERROR_MESSAGE,'r')as f:
           for line in f:
               for data in line:
                   print('리스트로 시간 출력해서 input 값과 비교')
                   time_list = list(datetime.strftime(data[:18],TIME_FORMAT))
                   if data[:18].find(error_time) != 1 :
                       flag = True
                   
    except FileNotFoundError or FileExistsError:
        print('========= Log File Not Exsist ===========')    
        
            
    
    # 입력 받은 시간 후에 EMS LOG에 Expired가 찍힌 시간대가 적힌 로그가 있는지 
    

def searchFile():
    
    flag = False
    
    print("========== EMS Log ==============")
    
    try :
        with open(EMS_LOG_PATH,'r')as f:
            for line in f:
                list_all = list(line.lower().split("\n"))
                
                for data in list_all:
                    print(data)
                    if data.find(EMS_ERROR_MESSAGE) != -1 :
                        flag = True
                    else:
                        break
    except FileNotFoundError or FileExistsError:
        print('========= Log File Not Exsist ===========')    
        
    return flag

searchFile()

def excute(flag):
    if flag == True:
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

excute(searchFile())