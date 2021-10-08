require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

SUMMARY = "A small image just capable of starting core ROS."
DESCRIPTION = "${SUMMARY}"

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_DISTRO_TYPE}_image

IMAGE_INSTALL:append = " \
    ros-core \
    robot \
    perception \
"
#SPLASH = "psplash-raspberrypi"

#IMAGE_FEATURES += " splash"

IMAGE_INSTALL += "libstdc++ mtd-utils"
IMAGE_INSTALL += "openssh openssl openssh-sftp-server"
