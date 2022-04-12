#!/usr/bin/env bash

CheckUser=`whoami`

# If you need to input other TIBCO Version Please Change Version Using Ctrl + h
# Ex) 8.4.4 -> 9.0.0
RvPath=/tibco_install/1.package/01.TIB_rv_8.4.4/
EmsPath=/tibco_install/1.package/02.TIB_ems_8.4.0/
TraPath=/tibco_install/1.package/03.TIB_TRA_5.11.0/
BwPath=/tibco_install/1.package/04.TIB_BW_5.14.0/
AdminPath=/tibco_install/1.package/05.TIB_TIBCOAdmin_5.11.0/
DbDriversPath=/tibco_install/1.package/06.TIB_dbdrivers_2.0.6/

if [ ${CheckUser} != "root" ]; then
  /home/${CheckUser}${RvPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile='rv_install.silent'

  /home/${CheckUser}${EmsPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile='ems_install.silent'

  /home/${CheckUser}${TraPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile='tra_install.silent'

  /home/${CheckUser}${BwPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile='bw_install.silent'

  /home/${CheckUser}${AdminPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile='admin_install.silent'

  /home/${CheckUser}${DbDriversPath}/TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile='dbdrivers_install.silent'

  echo "Successful BW Install"
  exit
fi
echo "Please Change User"