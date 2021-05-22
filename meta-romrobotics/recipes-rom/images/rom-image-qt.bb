# Created By ROM ROBOTICS MYANMAR 
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
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
