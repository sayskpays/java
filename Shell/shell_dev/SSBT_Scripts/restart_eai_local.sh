#!/bin/bash

CheckUser=$(whoami)
TraPath="/home/hong/tibco/tra/5.11/bin/"
ScriptPath="/home/hong/shell_script/"

if [ ${CheckUser} == "hong" ]; then

        # Process Stop
        cd ${TraPath}
        ./AppManage -stop -app TEST -user admin -pw admin -domain eai_test_1 &

        # Ems Kill
        kill $(ps -ef | grep 'tibemsd' | grep -v 'color' | awk '{print $2}')
        kill $(ps -ef | grep 'tibemsd.conf' | grep -v 'color' | awk '{print $2}')
        
        # Ems Start
        cd ${ScriptPath}
        ./active_ems_7444.sh &

        # Process Start
        cd ${TraPath}
        ./AppManage -start -app TEST -user admin -pw admin -domain eai_test_1 &

        exit
fi
    echo "Please Chage User"