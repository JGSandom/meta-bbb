SUMMARY = "A console development image"
HOMEPAGE = "http://www.jumpnowtek.com"

require basic-dev-image.bb

WIFI = " \
    bbgw-wireless \
    crda \
    iw \
    linux-firmware-wl12xx \
    linux-firmware-wl18xx \
    wpa-supplicant \
"

DEV_EXTRAS = " \
    serialecho \
    spiloop \
"

IMAGE_INSTALL += " \
    emmc-upgrader \
    firewall \
    ${DEV_EXTRAS} \
    ${WIFI} \
    ${SECURITY_TOOLS} \
    ${WIREGUARD} \
"

export IMAGE_BASENAME = "console-image"
