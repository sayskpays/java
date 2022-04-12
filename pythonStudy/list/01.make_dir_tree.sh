#!/usr/bin/env bash

CheckUser=`whoami`

# If you need to input other TIBCO Version Please Change Version Using Ctrl + h
# Ex) 8.4.4 -> 9.0.0
RvPath=tibco_install/1.package/01.TIB_rv_8.4.4
EmsPath=tibco_install/1.package/02.TIB_ems_8.4.0
TraPath=tibco_install/1.package/03.TIB_TRA_5.11.0
BwPath=tibco_install/1.package/04.TIB_BW_5.14.0
AdminPath=tibco_install/1.package/05.TIB_TIBCOAdmin_5.11.0
DbDriversPath=tibco_install/1.package/06.TIB_dbdrivers_2.0.6

if [ ${CheckUser} != "root" ]; then
  echo "${CheckUser} Directory Create..."

  if [ -d /home/hong/tibco/tibco_install/1.package/ ]; then
    echo "Directory Exsist !!!!"
  fi
  echo "${CheckUser} Successful Create Directory"
  mkdir /home/${CheckUser}/tibco
  mkdir /home/${CheckUser}/tibco_install
  mkdir /home/${CheckUser}/tibco_install/1.package
  mkdir /home/${CheckUser}/tibco_install/2.hotfix

  mkdir /home/${CheckUser}/${RvPath}
  mkdir /home/${CheckUser}/${EmsPath}
  mkdir /home/${CheckUser}/${TraPath}
  mkdir /home/${CheckUser}/${BwPath}
  mkdir /home/${CheckUser}/${AdminPath}
  mkdir /home/${CheckUser}/${DbDriversPath}
  exit
fi
echo "Please Change root User"
