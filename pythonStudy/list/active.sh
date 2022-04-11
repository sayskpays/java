#!/usr/bin/env bash

CheckUser=`whoami`

if [ ${CheckUser} != "root" ]; then
    echo ${CheckUser}

    # /home/hong/active/active_hawk &
    cd /home/hong/

   # /home/hong/active/active_admin &

    exit
fi
  echo "Please Change root User"
