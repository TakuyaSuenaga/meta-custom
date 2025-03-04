SUMMARY = "A tool to run Docker containers with customized settings"
HOMEPAGE = "https://github.com/osrf/rocker"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_URI = "git://github.com/osrf/rocker.git;branch=master;protocol=https"
SRCREV = "latest"

DEPENDS = "python3-pip"

inherit setuptools3

S = "${WORKDIR}/git"

