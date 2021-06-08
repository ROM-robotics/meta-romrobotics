require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

SUMMARY = "A small image just capable of starting core ROS."
DESCRIPTION = "${SUMMARY}"

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_DISTRO_TYPE}_image

IMAGE_INSTALL_append = " \
	kernel-modules \
    ros-core \
"

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES += " splash"

IMAGE_INSTALL += "libstdc++ mtd-utils"
IMAGE_INSTALL += "openssh openssl "

IMAGE_INSTALL_append = "packagegroup-core-ssh-openssh openssh-sftp-server "
#qtbase qtwebkit qtdeclarative qtquickcontrols qtquickcontrols2 qtgraphicaleffects qtimageformats qtmultimedia qtserialport \
#qtquickcontrols-qmlplugins qtquickcontrols2-qmlplugins" 

PACKAGECONFIG[eglfs] = "-eglfs, -no-eglfs, drm"
PACKAGECONFIG[gl] = "-opengl desktop, virtual/libgl"
PACKAGECONFIG[gles2] = "-opengl es2, virtual/libgles2 virtual/egl"
PACKAGECONFIG[tslib] = "-tslib, no-tslib, tslib"

PACKAGECONFIG_append = "gles2"
PACKAGECONFIG_append = "sql-sqlite"

# qtquickl error

# from jumpnow

QT_TOOLS = " \
    qtbase \
    qt5-env \
    qtserialport \
"

QT_DEV_TOOLS = " \    
    qtserialport-mkspecs \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

TEST_APPS += " \
    qcolorcheck-tools \
    tspress-tools \
"

IMAGE_INSTALL += " \
    ${QT_TOOLS} \
    ${QT_DEV_TOOLS} \
    ${FONTS} \
    ${TSLIB} \
    ${TEST_APPS} \
"

# for QT
QT5_PKGS = " \
    qt3d \
    qtcharts \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtlocation-plugins \
    qtmultimedia \
    qtquickcontrols2 \
    qtsensors-plugins \
    qtserialbus \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtvirtualkeyboard \
    qtxmlpatterns \
"
QT5_DEV_PKGS = " \
    qt3d \
    qt3d-mkspecs \
    qtcharts \
    qtcharts-mkspecs \
    qtconnectivity \
    qtconnectivity-mkspecs \
    qtdeclarative \
    qtdeclarative-mkspecs \
    qtgraphicaleffects \
    qtlocation \
    qtlocation-mkspecs \
    qtmultimedia \
    qtmultimedia-mkspecs \
    qtquickcontrols2 \
    qtquickcontrols2-mkspecs \
    qtsensors \
    qtsensors-mkspecs \
    qtserialbus \
    qtserialbus-mkspecs \
    qtsvg \
    qtsvg-mkspecs \
    qtwebsockets \
    qtwebsockets-mkspecs \
    qtvirtualkeyboard \
    qtxmlpatterns \
    qtxmlpatterns-mkspecs \
"

TEST_APPS += " \
    qmlswipe-tools \
    qt5-opengles2-test \
"

IMAGE_INSTALL += " \
    ${QT5_PKGS} \
    ${QT5_DEV_PKGS} \
    ${TEST_APPS} \
"
DEOM_MODULES = " qt5-opengles2-test "