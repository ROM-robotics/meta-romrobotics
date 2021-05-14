<h2> meta-rom </h2>   
    <h3>bblayers.conf</h3>
    	<p>
    	BBLAYERS ?= " \<br>
  		/home/rom/Desktop/yocto/poky/meta \<br>
  		/home/rom/Desktop/yocto/poky/meta-poky \<br>
  		/home/rom/Desktop/yocto/poky/meta-yocto-bsp \<br>
  		/home/rom/Desktop/yocto/layers/meta-raspberrypi \<br>
 		/home/rom/Desktop/yocto/layers/meta-gstreamer \<br>
  		/home/rom/Desktop/yocto/layers/meta-openembedded/meta-oe \<br>
  		/home/rom/Desktop/yocto/layers/meta-openembedded/meta-python \<br>
  		/home/rom/Desktop/yocto/layers/meta-openembedded/meta-multimedia \<br>
  		/home/rom/Desktop/yocto/layers/meta-openembedded/meta-networking \<br>
  		/home/rom/Desktop/yocto/layers/meta-qt5 \<br>
  		/home/rom/Desktop/yocto/custom-layers/meta-romrobotics \<br>
  		"<br>
  		</p>

  	<h3>bblayers.conf</h3>
  		<p>
		MACHINE ??= "raspberrypi4-64"<br>

		DISTRO_FEATURES_remove = "x11 wayland"<br>
		DISTRO_FEATURES_remove = "X11 wayland vulkan directfb"<br>
		DISTRO_FEATURES_append = "alsa opengl"<br>
		DISTRO_FLAGS_WHITELIST = "commercial"<br>
		</p>
	    
	<h3>rom-qt-image.bb</h3>
		<p>
			DESCRIPTION = "A Qt5 minimal image by ROM ROBOTICS"<br>
			LINCENSE = "MIT"<br>
			inherit core-image<br>

			include recipes-core/images/core-image-minimal.bb<br>

			#IMAGE_INSTALL += "libstdc++ mtd-utils"<br>
			#IMAGE_INSTALL += "openssh openssl openssh-sftp-server"<br>

			IMAGE_INSTALL_append = "packagegroup-core-ssh-openssh openssh-sftp-server qtbase qtdeclarative \<br>
			qtquickcontrols qtquickcontrols2 qtgraphicaleffects qtimageformats qtmultimedia qtserialport \<br>
			qtquickcontrols-qmlplugins qtquickcontrols-qmlplugins"

			PACKAGECONFIG[eglfs] = "-eglfs, -no-eglfs, drm"<br>
			PACKAGECONFIG[gl] = "-opengl desktop, virtual/libgl"<br>
			PACKAGECONFIG[gles2] = "-opengl es2, virtual/libgles2 virtual/egl"<br>
			PACKAGECONFIG[tslib] = "-tslib, no-tslib, tslib"<br>
		

			# qtquickl error
		</p>
		
	<h3>qtbase_1.0.bb</h3>
		<p>
			PACKAGECONFIG_append = "gles2"<br>
			PACKAGECONFIG_append = "sql-lite"<br>

			IMAGE_INSTALL_append = "qtserialport"<br>
			IMAGE_INSTALL_append = "qtvirtualkeyboard"<br>
		</p>