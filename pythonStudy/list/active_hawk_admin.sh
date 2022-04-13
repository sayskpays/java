#!/usr/bin/env bash

CheckUser=$(whoami)

if [ ${CheckUser} != "hong" ]; then
  echo "${CheckUser}"

  if [ -d /home/${CheckUser}/tibco/tra/domain/ ]; then
  cd /home/${CheckUser}/tibco/tra/domain/*/
  ./hawkagent_* &

  sleep 15.0

  cd /home/${CheckUser}/tibco/administrator/domain/*/bin/
  ./tibcoadmin_* &

  exit
  fi
  echo "Please Create Domain"
  exit
fi
echo "Please Change root User"
