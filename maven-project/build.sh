#!/bin/bash
EXEC_SCRIPT_DIR=$(cd $(dirname $0); pwd)
mvn clean compile
mvn clean package