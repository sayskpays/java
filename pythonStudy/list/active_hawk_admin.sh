#!/usr/bin/env bash

CheckUser=$(whoami)

# If you change BW TRA Domain name , change this BwDomainName Variable
# Ex) eai_domain -> {new domain name}
BwDomainName='eai_domain'

if [ ${CheckUser} != "root" ]; then
  echo "${CheckUser}"

  if [ -d /home/${CheckUser}/tibco/tra/domain/ ]; then
  cd /home/${CheckUser}/tibco/tra/domain/*/
  ./hawkagent_${BwDomainName} &

  sleep 15.0

  cd /home/${CheckUser}/tibco/administrator/domain/*/bin/
  ./tibcoadmin_${BwDomainName} &

  exit
  fi
  echo "Please Create Domain"
  exit
fi
echo "Please Change root User"
