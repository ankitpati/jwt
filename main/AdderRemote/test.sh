#!/bin/bash

test $# -ne 2 && {
    printf 'Usage:\n\t ./test.sh <number 1> <number 2>\n' >&2
    exit 1
}

javac -Xlint:all "AdderRemote.java" &&
javac -Xlint:all "AdderServer.java" &&
javac -Xlint:all "AdderClient.java" &&
rmic AdderRemote &>/dev/null &&
rmiregistry 2>/dev/null &

sleep 5

java AdderServer 2>/dev/null &

sleep 1

java AdderClient $@ 2>/dev/null
