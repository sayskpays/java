#!/usr/bin/env bash

CheckUser=$(whoami)

find ./ \( -name "*.tra" -o -name "*.conf" -o -name "*.cfg" -o -name "*.properties" -o -name "*.sh" -o -name "*.xml" \) -exec sed -i "s\/home/tibco/tibco/\/home/drepozen/tibco/\g" {} \;


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
