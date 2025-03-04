SUMMARY = "Google Drive direct download of big files"
HOMEPAGE = "https://github.com/wkentaro/gdown"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b56e19185b3243a5c7e7938b5ed64a"

SRC_URI = "git://github.com/wkentaro/gdown.git;branch=master;protocol=https"
SRCREV = "latest"

DEPENDS = "python3-setuptools"

inherit setuptools3

S = "${WORKDIR}/git"

