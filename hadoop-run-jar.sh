#!/usr/bin/env bash
home=$HOME
jar1=$home/.m2/repository/org/apache/mrunit/mrunit/1.0.0/mrunit-1.0.0-hadoop2.jar

export LIBJARS=$jar1
export HADOOP_CLASSPATH=$jar1
hadoop jar ./target/my-mapreduce-test.jar MaxTemperatureMapperTest -libjars ${LIBJARS}
