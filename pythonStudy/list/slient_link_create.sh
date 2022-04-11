#!/usr/bin/env bash



CheckUser=`whoami`

# If you need to input other TIBCO Version Please Change Version Using Ctrl + h
# Ex) 8.4.4 -> 9.0.0

RvPath='tibco/tibco_install/1.package/01.TIB_rv_8.4.4/'
EmsPath='tibco/tibco_install/1.package/02.TIB_ems_8.4.0/'
TraPath='tibco/tibco_install/1.package/03.TIB_TRA_5.11.0/'
BwPath='tibco/tibco_install/1.package/04.TIB_BW_5.14.0/'
AdminPath='tibco/tibco_install/1.package/05.TIB_TIBCOAdmin_5.11.0/'
DbDriversPath='tibco/tibco_install/1.package/06.TIB_dbdrivers_2.0.6/'


if [ ${CheckUser} != "root" ]; then
  if [ ! -f /home/${CheckUser}/tibco/tibco_install/1.package/01.TIB_rv_8.4.4/silent_install.sh  ]; then

  ln -s silent_install.sh /home/${CheckUser}/${RvPath}
  ln -s silent_install.sh /home/${CheckUser}/${EmsPath}
  ln -s silent_install.sh /home/${CheckUser}/${TraPath}
  ln -s silent_install.sh /home/${CheckUser}/${BwPath}
  ln -s silent_install.sh /home/${CheckUser}/${AdminPath}
  ln -s silent_install.sh /home/${CheckUser}/${DbDriversPath}

  sleep 2.0

  # shellcheck disable=SC2225
  cp /home/${CheckUser}/${RvPath}/TIBCOUniversalInstaller-rv.silent 01.TIB_rv_8.4.4.silent
  cp /home/${CheckUser}/${EmsPath}/TIBCOUniversalInstaller-ems.silent 02.TIB_ems_8.4.0.silent
  cp /home/${CheckUser}/${TraPath}/TIBCOUniversalInstaller_TRA_5.11.0.silent 03.TIB_TRA_5.11.0.silent
  cp /home/${CheckUser}/${BwPath}/TIBCOUniversalInstaller-BW_5.14.0.silent 04.TIB_BW_5.14.0.silent
  cp /home/${CheckUser}/${AdminPath}/TIBCOUniversalInstaller_TIBCOAdmin_5.11.0.silent 05.TIB_TIBCOAdmin_5.11.0.silent
  cp /home/${CheckUser}/${DbDriversPath}/TIBCOUniversalInstaller-dbdrivers_2.0.6.silent 06.TIB_dbdrivers_2.0.6.silent
  fi
   echo "silent file exsist"
fi
 echo "Please Change root User"