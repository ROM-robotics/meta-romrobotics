DESCRIPTION = "A Qt5 minimal image by ROM ROBOTICS"
LINCENSE = "MIT"
inherit core-image

include recipes-core/images/core-image-minimal.bb

#IMAGE_INSTALL += "libstdc++ mtd-utils"
#IMAGE_INSTALL += "openssh openssl openssh-sftp-server"

IMAGE_INSTALL_append = "packagegroup-core-ssh-openssh openssh-sftp-server qtbase qtdeclarative \
qtquickcontrols qtquickcontrols2 qtgraphicaleffects qtimageformats qtmultimedia qtserialport \
qtquickcontrols-qmlplugins qtquickcontrols-qmlplugins"

PACKAGECONFIG[eglfs] = "-eglfs, -no-eglfs, drm"
PACKAGECONFIG[gl] = "-opengl desktop, virtual/libgl"
PACKAGECONFIG[gles2] = "-opengl es2, virtual/libgles2 virtual/egl"
PACKAGECONFIG[tslib] = "-tslib, no-tslib, tslib"


# qtquickl error