require recipes-core/images/core-image-minimal.bb


KERNEL_EXTRA = " \
    kernel-modules \
"
EXTRA_TOOLS = " \
    ntp ntp-tickadj \
"

WIFI = " \
    crda \
    iw \
    dhcpcd \
    linux-firmware-rpidistro-bcm43455 \
    linux-firmware-rpidistro-bcm43430 \
    wpa-supplicant \	
"


IMAGE_INSTALL += " \
    ${KERNEL_EXTRA} \
    ${WIFI} \ 
    ${EXTRA_TOOLS} \
"

set_local_timezone() {
    ln -sf /usr/share/zoneinfo/EST5EDT ${IMAGE_ROOTFS}/etc/localtime
}

ROOTFS_POSTPROCESS_COMMAND += " \
    set_local_timezone ; \
"

export IMAGE_BASENAME = "digger-image"


