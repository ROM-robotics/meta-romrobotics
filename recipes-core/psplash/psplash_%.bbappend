FILESEXTRAPATHS_prepend_poky := "${THISDIR}/files:"

SPLASH_IMAGES_append = " file://romlogo.png;outsuffix=bar"
ALTERNATIVE_PRIORITY_psplash-bar[psplash] = "200"