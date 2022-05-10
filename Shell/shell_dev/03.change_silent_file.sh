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

if [ ! -f /home/${CheckUser}/${RvPath}/rv_install.silent ]; then
  echo "Please Make rv_install.silent file"
  exit
fi

if [ "${CheckUser}" != "root" ]; then
  sed -i 's\opt/tibco\home/'"$CheckUser"'/tibco\' /home/${CheckUser}/${RvPath}/rv_install.silent

  sed -i 's\opt/tibco\home/'"$CheckUser"'/tibco\' /home/${CheckUser}/${EmsPath}/ems_install.silent
  sed -i 's\user\tibco\' /home/${CheckUser}/${EmsPath}/ems_install.silent

  # If change User name , /home/tibco/ -> /home/{Changed User Name}/ Need to Change.
  sed -i 's\"emsConfigDir"><\"emsConfigDir">/home/'"$CheckUser"'/tibco/ems/8.4<\' /home/${CheckUser}/${TraPath}/tra_install.silent
  sed -i 's\opt/tibco\home/'"$CheckUser"'/tibco\' /home/${CheckUser}/${TraPath}/tra_install.silent
  sed -i 's\user\tibco\' /home/${CheckUser}/${TraPath}/tra_install.silent

  sed -i 's\opt/tibco\home/'"$CheckUser"'/tibco\' /home/${CheckUser}/${BwPath}/bw_install.silent

  sed -i 's\opt/tibco\home/'"$CheckUser"'/tibco\' /home/${CheckUser}/${AdminPath}/admin_install.silent

  sed -i 's\opt/tibco\home/'"$CheckUser"'/tibco\' /home/${CheckUser}/${DbDriversPath}/dbdrivers_install.silent
  sed -i 's%c:\\%/home/'"$CheckUser"'/%' /home/${CheckUser}/${DbDriversPath}/dbdrivers_install.silent

  echo "Successful change"
  exit
fi
echo "Please Change User"

exit
