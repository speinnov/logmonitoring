#!/usr/bin/env bash

VERSION=$(xmlstarlet sel -N x="http://maven.apache.org/POM/4.0.0" -t -v "x:project/x:version" target/checkout/pom.xml)

echo "RELEASE_VERSION=$VERSION" > version.properties

