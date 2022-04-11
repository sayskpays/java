#!/usr/bin/env bash

echo "StartDate : date "

CURR_PWD=pwd
DATETIME=date +"%Y%m%d%H%M"
RELEASEFILE=log/hostname-silent-Release-${DATETIME}
FILELIST=log/hostname-silent-filelist-${DATETIME}
INSTALL_LOG_DIR=log/hostname-silent-installLog-${DATETIME}

mkdir -p log

PWD="pwd"
LAST_DIR=${PWD##*/}

echo "disk space check...."
df -k /home

echo "if you want to proceed Please Press Enter Key."
read

echo "silent file data print"
grep -v '<!--' ${LAST_DIR}.silent

echo "release note file information backup"
ls -l /home/tibco/tibco/release_notes > ${RELEASEFILE}_OLD.log

echo "Before install file List save"
find /home/tibco/tibco -type f | sed -e 's/^/"/' -e 's/$/"/' | xargs ls -l > ${FILELIST}_OLD.log
ls -l ${FILELIST}_OLD.log



# 디렉토리명과 동일한 *.silent 파일을 이용.

./TIBCOUniversalInstaller-lnx-x86-64.bin -silent -V responseFile="${LAST_DIR}.silent"

echo "EndDate : " date

echo "release note file info check"
ls -l /home/tibco/tibco/release_notes > ${RELEASEFILE}_NEW.log
diff ${RELEASFILE}_OLD.log ${RELEASFILE}_NEW.log

echo "After install file List save"
find /home/tibco/tibco -type f | sed -e 's/^/"/' -e 's/$/"/' | xargs ls -l > ${FILELIST}_NEW.log
ls -l ${FILELIST}_NEW.log

mkdir -p ${INSTALL_LOG_DIR}
cp -Rp ~/.TIBCO			${INSTALL_LOG_DIR}
cp -Rp ~/.TIBCOEnvInfo 		${INSTALL_LOG_DIR}
cp -Rp ~/InstallShield		${INSTALL_LOG_DIR}
cp -Rp ~/vpd.* 			${INSTALL_LOG_DIR}
cp -Rp ~/.sh_history		${INSTALL_LOG_DIR}

print "search error files .... " | tee -a ${INSTALL_LOG_DIR}/search_error.log
find ~/.TIBCO -name "ERROR" | xargs ls -l | tee -a ${INSTALL_LOG_DIR}/search_error.log

print "search error message .... " | tee -a ${INSTALL_LOG_DIR}/search_error.log
find ~/.TIBCO -type f | grep -v "ERROR" | xargs grep ERROR | tee -a ${INSTALL_LOG_DIR}/search_error.log