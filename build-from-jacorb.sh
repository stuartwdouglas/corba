#!/bin/sh
#Script to update the jacORB classes to the latest versions provided by JacORB
#The api module must be built first, to make sure that all generated classes are present

rm -r ext-api/src/main/java/*

mkdir -p ext-api/src/main/java/org/omg

cp -r $1/src/generated/org/omg/* ext-api/src/main/java/org/omg
cp -r $1/src/omg-03-01-02/org/omg/*  ext-api/src/main/java/org/omg

for  i in `find api/src/main/java -name \*.java | cut -b 19- `
do
	rm ext-api/src/main/java/$i
done

for  i in `find api/target/generated-sources/idl -name \*.java | cut -b 34- `
do
    rm ext-api/src/main/java/$i
done


rm -r ext-api/src/main/java/org/omg/DynamicAny/*Tie.java
rm -r ext-api/src/main/java/org/omg/PortableServer/*Tie.java
