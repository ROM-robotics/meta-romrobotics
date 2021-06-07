SUMMARY = "A Qt5 development image"

require rom-image-qt-noetic-base.bb

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

