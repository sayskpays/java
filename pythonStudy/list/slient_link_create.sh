#!/usr/bin/env bash

if [ ${CheckUser} != "root" ]; then
  ln -s silent_install ./tibco/tibco_install/1.package/01.TIB_rv_8.4.4/

fi
 echo "Please Change root User"