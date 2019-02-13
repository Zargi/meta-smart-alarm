require recipes-qt/qt5/qt5.inc
SUMMARY = "Qt5 Smart-Alarm application"
SECTION = "application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# I want to make sure these get installed too.
DEPENDS += "qtbase qtdeclarative qtquickcontrols2"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/Zargi/QtAlarm.git"

S = "${WORKDIR}/git"

do_install() {
      install -d ${D}${bindir}
      install -m 0755 SmartAlarm ${D}${bindir}
}
