#!/usr/bin/env bash

data=$(ps -ef | grep tibemsd_8111 | grep -v 'color' | awk '{print $2}')
kill -9 ${data}
