# Copyright (C) 2011 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "bootloader for imx platforms"
require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c6cde5df68eff615d36789dc18edd3b"

# TODO: add support for safe boot stream
# DEPENDS = "elftosb-native"

PR = "r2"

SRC_URI = "git://opensource.freescale.com/pub/scm/imx/uboot-imx.git;tag=rel_imx_2.6.35_11.09.01;protocol=http"

S = "${WORKDIR}/git"
