from datetime import datetime
import os
import subprocess

EMS_LOG_PATH = "/home/tibco/test/hello.txt"
EMS_ERROR_MESSAGE = 'sche'
 
def searchFile():
    
    log_flag = False
    
    print("========== EMS Log ==============")
    
    try :
        with open(EMS_LOG_PATH,'r')as f:
            for line in f:
                list_all = list(line.lower().split("\n"))
                
                for data in list_all:
                    if EMS_ERROR_MESSAGE in data:
                        print(data)
                    if data.find(EMS_ERROR_MESSAGE) != -1 :
                        log_flag = True
                    else:
                        break
    except FileNotFoundError or FileExistsError:
        print('========= Log File Not Exsist ===========')    
        
    return log_flag

searchFile()

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

excute(searchFile())