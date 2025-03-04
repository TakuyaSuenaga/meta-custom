SUMMARY = "My custom EWAOL image with gdown and rocker"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " python3-gdown python3-rocker"

