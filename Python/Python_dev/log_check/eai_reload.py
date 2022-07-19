def excute():
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
    