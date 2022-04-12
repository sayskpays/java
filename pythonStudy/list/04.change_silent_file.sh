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


if [ ! -f /home/${CheckUser}/${RvPath}/rv_install.silent ]; then
 echo "Please Make rv_install.silent file"

fi
 sed -i 's\opt/tibco\tibco/tibco/rv\' /home/${CheckUser}/${RvPath}/rv_install.silent
  sed -i 's\opt/tibco\tibco/tibco/ems\' /home/${CheckUser}/${EmsPath}/ems_install.silent
  sed -i 's\opt/tibco\tibco/tibco/tra\' /home/${CheckUser}/${TraPath}/tra_install.silent
  sed -i 's\opt/tibco\tibco/tibco/bw\' /home/${CheckUser}/${BwPath}/bw_install.silent
  sed -i 's\opt/tibco\tibco/tibco/admin\' /home/${CheckUser}/${AdminPath}/admin_install.silent
  sed -i 's\opt/tibco\tibco/tibco/dbdrivers\' /home/${CheckUser}/${DbDriversPath}/dbdrivers_install.silent
