#!/usr/bin/env bash

BASEDIR=$(dirname "$0")

mvn clean
$BASEDIR/java-repo-tools/scripts/run-localhost.sh appengine .
