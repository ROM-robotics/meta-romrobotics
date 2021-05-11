include recipes-core/images/core-image-minimal.bb
#requires recipes-core/images/core-image-minimal.bb


IMAGE_INSTALL += "libstdc++ mtd-utils"
IMAGE_INSTALL += "openssh openssl openssh-sftp-server"