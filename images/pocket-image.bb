SUMMARY = "A console development image for the pocketbeagle"
HOMEPAGE = "http://www.jumpnowtek.com"

require basic-dev-image.bb

IMAGE_INSTALL += " \
    serialecho \
    spiloop \
"

export IMAGE_BASENAME = "pocket-image"
