#!/usr/bin/env bash

# You must create User Name with tibco !!!!!

CheckUser=$(whoami)

# If you need to input other TIBCO Version Please Change Version Using Ctrl + h
# Ex) 8.4.4 -> 9.0.0

RvPath=/tibco_install/1.package/01.TIB_rv_8.4.4/
EmsPath=/tibco_install/1.package/02.TIB_ems_8.4.0/
TraPath=/tibco_install/1.package/03.TIB_TRA_5.11.0/
BwPath=/tibco_install/1.package/04.TIB_BW_5.14.0/
AdminPath=/tibco_install/1.package/05.TIB_TIBCOAdmin_5.11.0/
DbDriversPath=/tibco_install/1.package/06.TIB_dbdrivers_2.0.6/

if [ "${CheckUser}" != "root" ]; then
  /home/${CheckUser}${RvPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile=/home/${CheckUser}${RvPath}/rv_install.silent

  /home/${CheckUser}${EmsPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile=/home/${CheckUser}${EmsPath}/ems_install.silent

  /home/${CheckUser}${TraPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile=/home/${CheckUser}${TraPath}/tra_install.silent

  /home/${CheckUser}${BwPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile=/home/${CheckUser}${BwPath}/bw_install.silent

  /home/${CheckUser}${AdminPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile=/home/${CheckUser}${AdminPath}/admin_install.silent

  /home/${CheckUser}${DbDriversPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile=/home/${CheckUser}${DbDriversPath}/dbdrivers_install.silent

  echo "Successful BW Install"
  exit
fi
echo "Please Change User"
