#!/usr/bin/env bash

CheckUser=$(whoami)

APP_MANAGE_PATH=/home/${CheckUser}/tibco/tra/5.11/bin
SHELL_SCRIPT_PATH=/home/${CheckUser}/shell_script/
PBRUN_CODE='pbrun -u neaapp'

if [ ${CheckUser} != 'root' ]; then
    cd ${APP_MANAGE_PATH}
    echo '=============EAI Process Stop================'
    ./AppManage -stop -app TEST -user admin -pw admin -domain eai_test_1
    sleep 10

    echo '==================EMS KILL=================='
    kill $(ps -ef | grep 'tibemsd.conf' | grep -v 'color' | awk '{print $2}')

    sleep 10
    echo '=================EMS RESTART==================='
    cd ${SHELL_SCRIPT_PATH}
    sh active_ems_7444.sh &

    echo '===============EAI Process restart================'
    cd ${APP_MANAGE_PATH}
    ./AppManage -start -app TEST -user admin -pw admin -domain eai_test_1
fi
