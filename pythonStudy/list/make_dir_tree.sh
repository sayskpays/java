#!/usr/bin/env bash

CheckUser=`whoami`

if [ ${CheckUser} != "root" ]; then
		echo "${CheckUser} Directory Create..."

	if [ -d /home/hong/tibco/tibco_install/1.package/ ]; then
		echo "Directory Exsist !!!!"
	fi
		 echo "${CheckUser} Successful Create Directory"
    mkdir "/home/${CheckUser}/tibco"
    mkdir "/home/${CheckUser}/tibco/tibco_install_files/"
    mkdir "/home/${CheckUser}/tibco/tibco_install"
    mkdir "/home/${CheckUser}/tibco/tibco_install/1.package"
    mkdir "/home/${CheckUser}/tibco/tibco_install/2.hotfix"

    mkdir "/home/${CheckUser}/tibco/tibco_install/1.package/01.TIB_rv_8.4.4"
    mkdir "/home/${CheckUser}/tibco/tibco_install/1.package/02.TIB_ems_8.4.0"
    mkdir "/home/${CheckUser}/tibco/tibco_install/1.package/03.TIB_TRA_5.11.0"
    mkdir "/home/${CheckUser}/tibco/tibco_install/1.package/04.TIB_BW_5.14.0"
    mkdir "/home/${CheckUser}/tibco/tibco_install/1.package/05.TIB_TIBCOAdmin_5.11.0"
    mkdir "/home/${CheckUser}/tibco/tibco_install/1.package/06.TIB_dbdrivers_2.0.6"
    exit
fi
echo "Please Change root User"