#!/usr/bin/env bash

CheckUser=$(whoami)

# If you change BW TRA Domain name , change this BwDomainName Variable
# Ex) eai_domain -> {new domain name}
BwDomainName='eai_domain'
EmsPort='8111'

if [ ${CheckUser} != "root" ]; then
  echo "${CheckUser}"

  if [ -d /home/${CheckUser}/tibco/ems/ ]; then
  cd /home/${CheckUser}/tibco/ems/*/bin/

  # ems port default 8111
  sh tibemsd_${EmsPort}.sh

  exit

  fi
  echo "Please Create Domain"
  exit
fi
echo "Please Change root User"
