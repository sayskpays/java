#!/usr/bin/env bash

# If you need to input other TIBCO Version Please Change Version Using Ctrl + h !!!
  # Ex) 8.4.4 -> 9.0.0

CheckUser=$(whoami)
CheckServerName='eai_domain'
EmsPort='8111'

if [ ${CheckUser} != "root" ]; then

  # CreateDomain , DeleteDomain file Copy
  cp /home/${CheckUser}/tibco/tra/5.11/template/domainutility/cmdline/CreateDomain.xml /home/${CheckUser}/tibco/tra/5.11/bin/CreateDomain_${CheckServerName}
  cp /home/${CheckUser}/tibco/tra/5.11/template/domainutility/cmdline/DeleteDomain.xml /home/${CheckUser}/tibco/tra/5.11/bin/DeleteDomain_${CheckServerName}
  cp /home/${CheckUser}/tibco/tra/5.11/template/domainutility/cmdline/DeleteDomain.xml /home/${CheckUser}/tibco/tra/5.11/bin/DeleteDomain_${CheckServerName}

  # tibemsd.conf file copy
  cp /home/${CheckUser}/tibco/tibco/cfgmgmt/ems/data/tibemsd.conf /home/${CheckUser}/tibco/tibco/cfgmgmt/ems/data/tibemsd_${EmsPort}.conf
  # tibemsd.sh file copy
  cp /home/${CheckUser}/tibco/ems/8.4/bin/tibemsd.sh /home/${CheckUser}/tibco/ems/8.4/bin/tibemsd_${EmsPort}.sh

  echo "Successful config file copy !!! "
  exit
fi
echo "Please Change root User"