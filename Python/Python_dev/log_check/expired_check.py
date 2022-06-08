import os
import subprocess

def searchFile():
    # Local Variable
    # /home/tibco/test/hello.txt
    read_file_path = "/home/tibco/test/hello.txt"
    flag = False
    
    with open(read_file_path,'r')as f:
        for line in f:
            list_all = list(line.lower().split("\n"))
            
            for data in list_all:
                print(data)
                if data.find('sche') != -1 :
                    flag = True
                else:
                    break
    return flag

searchFile()

def excute(flag):
    if flag == True:
        os.chdir('/home/tibco/tibco/tra/5.11/bin/')
        print('====================EAI Process Stop===================')
        os.system('./AppManage -stop -app EAI_FBL -user a -pw a -domain eai_domain')
        
        
        print('=======================EMS KILL=======================')
        values = os.system("kill $(ps -ef | grep 'tibemsd_8111' | grep -v 'color' | awk '{print $2}')")
        os.system("kill $(ps -ef | grep 'tibemsd.conf' | grep -v 'color' | awk '{print $2}')")
        print('CHECK VALUE ================== : %s' %values)
        
        os.chdir('/home/tibco/tibco/ems/8.4/bin/')
        print('====================EMS RESTART======================')
        subprocess.call(['sh ./tibemsd_8111.sh &'],shell=True)
        
        print('=====================EAI Process restart===================')
        os.chdir('/home/tibco/tibco/tra/5.11/bin/')
        os.system('./AppManage -start -app EAI_FBL -user a -pw a -domain eai_domain')
        print("=====================RESTART COMPLETED========================")
    else:
        print('Not Exsist Expired Error Message')

excute(searchFile())