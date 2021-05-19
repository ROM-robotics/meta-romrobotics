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

IMAGE_INSTALL_append = "packagegroup-core-ssh-openssh openssh-sftp-server qtbase qtdeclarative \
qtquickcontrols qtquickcontrols2 qtgraphicaleffects qtimageformats qtmultimedia qtserialport \
qtquickcontrols-qmlplugins qtquickcontrols-qmlplugins"

PACKAGECONFIG[eglfs] = "-eglfs, -no-eglfs, drm"
PACKAGECONFIG[gl] = "-opengl desktop, virtual/libgl"
PACKAGECONFIG[gles2] = "-opengl es2, virtual/libgles2 virtual/egl"
PACKAGECONFIG[tslib] = "-tslib, no-tslib, tslib"


# qtquickl error