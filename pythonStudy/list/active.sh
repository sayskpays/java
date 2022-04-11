#!/usr/bin/env bash


# ln 하드링크 active에 hawk, admin 빼놓는 스크립트 생성 !!!

CheckUser=`whoami`

if [ ${CheckUser} != "root" ]; then
    echo ${CheckUser}

    # /home/hong/active/active_hawk &
    cd /home/hong/

   # /home/hong/active/active_admin &

    exit
fi
  echo "Please Change root User"
