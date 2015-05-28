#!/bin/bash


temp1=$(grep MemFree /proc/meminfo)

javac -cp src/ src/classes/Main.java
java -cp src/ classes/Main $1 $2 $3 

#temp2=$(grep MemFree /proc/meminfo)

#array1=(${temp1//:/ })
#array2=(${temp2//:/ })

#echo -e "\n"
#echo $((${array1[1]}))
#echo $((${array2[1]}))

#x=$((${array1[1]}))
#z=$((${array2[1]}))

#echo $((x-z))

#echo -e "\n"

