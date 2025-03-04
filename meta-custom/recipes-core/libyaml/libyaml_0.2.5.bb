SUMMARY = "LibYAML is a YAML 1.1 parser and emitter written in C"
HOMEPAGE = "https://pyyaml.org/wiki/LibYAML"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c08c70873951b392e04ab2de5f8fc0f4"

SRC_URI = "https://github.com/yaml/libyaml/releases/download/0.2.5/yaml-0.2.5.tar.gz"
SRC_URI[md5sum] = "8b0a93d5bc736251c9613c45038b9e9d"
SRC_URI[sha256sum] = "70a3966594c3655442b1fe0ec273c20fa4b68a8b25aeff9b0f3c98627c467b50"

S = "${WORKDIR}/yaml-0.2.5"

inherit autotools

EXTRA_OECONF = "--disable-dependency-tracking --enable-shared"

