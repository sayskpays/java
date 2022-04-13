#!/usr/bin/env bash

# If you need to input other TIBCO Version Please Change Version Using Ctrl + h !!!
  # Ex) 8.4.4 -> 9.0.0

CheckUser=$(whoami)

dateTime=date +"%y%m%d"

if [ ${CheckUser} != "hong" ]; then

  # CreateDomain , DeleteDomain file Copy
  cp /home/${CheckUser}/tibco/tra/5.11/template/domainutility/cmdline/CreateDomain.xml /home/${CheckUser}/tibco/tra/5.11/bin/CreateDomain_${dateTime}
  cp /home/${CheckUser}/tibco/tra/5.11/template/domainutility/cmdline/DeleteDomain.xml /home/${CheckUser}/tibco/tra/5.11/bin/DeleteDomain_${dateTime}

  # tibemsd.conf file copy
  cp /home/${CheckUser}/tibco/tibco/cfgmgmt/ems/data/tibemsd.conf /home/${CheckUser}/tibco/tibco/cfgmgmt/ems/data/tibemsd_${EmsPath}.conf
  # tibemsd.sh file copy
  cp /home/${CheckUser}/tibco/ems/8.4/bin/tibemsd.sh /home/${CheckUser}/tibco/ems/8.4/bin/tibemsd_${EmsPath}.sh

  exit
fi
echo "Please Change root User"