#!/usr/bin/env bash

CheckUser=`whoami`

unzip /home/${CheckUser}/bw_install* -d /home/tibco/tibco_install
sleep 2.0

# If you need to input other TIBCO Version Please Change Version Using Ctrl + h
# Ex) 8.4.4 -> 9.0.0
RvPath=/tibco_install/1.package/01.TIB_rv_8.4.4/
EmsPath=/tibco_install/1.package/02.TIB_ems_8.4.0/
TraPath=/tibco_install/1.package/03.TIB_TRA_5.11.0/
BwPath=/tibco_install/1.package/04.TIB_BW_5.14.0/
AdminPath=/tibco_install/1.package/05.TIB_TIBCOAdmin_5.11.0/
DbDriversPath=/tibco_install/1.package/06.TIB_dbdrivers_2.0.6/

CheckRV=`find * -name 'TIB_rv*' -type f`
CheckEMS=`find * -name 'TIB_ems*' -type f`
CheckTRA=`find * -name 'TIB_TRA*' -type f`
CheckBW=`find * -name 'TIB_BW*' -type f`
CheckAdmin=`find * -name 'TIB_TIBCOAdmin*' -type f`
CheckDB=`find * -name 'TIB_dbdrivers*' -type f`

if [ ${CheckUser} != "root" ]; then
    echo "${CheckUser} Successful Unzip File"

        if [ -d /home/${CheckUser}/tibco_install/1.package/ ]; then
            echo "Directory Exsist OK !!!!"

            unzip /home/${CheckUser}/${CheckRV} -d /home/${CheckUser}/${RvPath}
            sleep 2.0
            unzip /home/${CheckUser}/${CheckEMS} -d /home/${CheckUser}/${EmsPath}
            sleep 2.0
            unzip /home/${CheckUser}/${CheckTRA} -d /home/${CheckUser}/${TraPath}
            sleep 2.0
            unzip /home/${CheckUser}/${CheckBW} -d /home/${CheckUser}/${BwPath}
            sleep 2.0
            unzip /home/${CheckUser}/${CheckAdmin} -d /home/${CheckUser}/${AdminPath}
            sleep 2.0
            unzip /home/${CheckUser}/${CheckDB} -d /home/${CheckUser}/${DbDriversPath}
            sleep 5.0

            # 84-64 bin copy
            cp /home/${CheckUser}/${EmsPath}/TIBCOUniversalInstaller-lnx* /home/${CheckUser}/${RvPath}

            cp /home/${CheckUser}${RvPath}/*rv.silent /home/${CheckUser}/${RvPath}/rv_install.silent
            cp /home/${CheckUser}${EmsPath}/*ems.silent /home/${CheckUser}/${EmsPath}/ems_install.silent
            cp /home/${CheckUser}${TraPath}/*TRA*.silent /home/${CheckUser}/${TraPath}/tra_install.silent
            cp /home/${CheckUser}${BwPath}/*BW*.silent /home/${CheckUser}/${BwPath}/bw_install.silent
            cp /home/${CheckUser}${AdminPath}/*Admin*.silent /home/${CheckUser}/${AdminPath}/admin_install.silent
            cp /home/${CheckUser}${DbDriversPath}/*dbdrivers*.silent /home/${CheckUser}/${DbDriversPath}/dbdrivers_install.silent

            exit
        fi
            echo "package folder Not Exsist"
    exit

fi
    echo "Please Change root User"