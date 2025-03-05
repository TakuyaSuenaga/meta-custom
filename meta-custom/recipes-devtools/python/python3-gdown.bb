SUMMARY = "Google Drive direct download for large files"
HOMEPAGE = "https://github.com/wkentaro/gdown"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b56e19185b3243a5c7e7938b5ed64a"

inherit setuptools3

SRC_URI = "git://github.com/wkentaro/gdown.git;branch=main;protocol=https"
SRCREV = "latest"

S = "${WORKDIR}/git"

RDEPENDS:${PN} += "python3 python3-pip python3-requests"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/gdown/cli.py ${D}${bindir}/gdown
}

FILES:${PN} += "${bindir}/gdown"
