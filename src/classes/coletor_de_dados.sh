#!/bin/bash

javac -cp ../ Main.java 
java -cp ../ classes/Main $1 $2 $3 
