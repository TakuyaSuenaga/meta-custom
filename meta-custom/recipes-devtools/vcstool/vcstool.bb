DESCRIPTION = "Version Control System Tool for ROS2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=<hash値>"

SRC_URI = "git://github.com/dirk-thomas/vcstool.git;branch=master"
SRCREV = "latest_commit_hash"

DEPENDS = "python3 python3-pyyaml"

S = "${WORKDIR}/git"

inherit setuptools3

