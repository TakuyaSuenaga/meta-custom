inherit setuptools3

DESCRIPTION = "A tool for running Docker containers with GPU support"
HOMEPAGE = "https://github.com/osrf/rocker"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_URI = "git://github.com/osrf/rocker.git;branch=master;protocol=https"
SRCREV = "latest"

S = "${WORKDIR}/git"

RDEPENDS:${PN} += "python3 python3-pip docker"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/rocker.py ${D}${bindir}/rocker
}

FILES:${PN} += "${bindir}/rocker"
