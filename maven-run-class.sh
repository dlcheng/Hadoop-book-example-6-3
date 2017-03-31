#!/usr/bin/env bash
#this run the class
#since there is no package specified
mvn exec:java -Dexec.mainClass="$1"
