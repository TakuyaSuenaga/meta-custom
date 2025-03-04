DESCRIPTION = "Colcon build tool for ROS2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=<hash値>"

SRC_URI = "git://github.com/colcon/colcon-core.git;branch=master"
SRCREV = "latest_commit_hash"

DEPENDS = "python3-setuptools python3-pyyaml python3-argcomplete"

S = "${WORKDIR}/git"

inherit setuptools3

