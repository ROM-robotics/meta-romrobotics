require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

SUMMARY = "A small image just capable of starting core ROS."
DESCRIPTION = "${SUMMARY}"

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_DISTRO_TYPE}_image

IMAGE_INSTALL:append = " \
    ros-core \
    robot \
    perception \
    openslam-gmapping \
    open-karto \
    slam-gmapping \
    slam-karto \
    move-basic \
    navigation \
    robot-localization \
    rosserial \
    ros-control \
    actionlib \
    move-base-flex \
    move-base-sequence \
    slam-toolbox-msgs \
    robot-navigation \
    robot-localization \
    robot-controllers \
    amcl \
    global-planner \
    base-local-planner \
    dwa-local-planner \
    dwb-local-planner \
    carrot-planner \
"
SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES += " splash"

IMAGE_INSTALL += "libstdc++ mtd-utils"
IMAGE_INSTALL += "openssh openssl openssh-sftp-server"
