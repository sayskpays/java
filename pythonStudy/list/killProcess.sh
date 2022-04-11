#!/usr/bin/env bash


CheckUser=`whoami`

if [ ${CheckUser} != "hong" ]; then
    echo "${CheckUser}"


    kill -9 $(ps -ef | grep hawk | awk '{print $2}')
    sleep 10

    kill -9 $(ps -ef | grep admin | awk '{print $2}')

    exit
fi
  echo "Please Change root User"
