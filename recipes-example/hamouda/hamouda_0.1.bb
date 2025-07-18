SUMMARY = "hamouda demo app"
DESCRIPTION = "hamouda demo app used in linux"
LICENSE = "CLOSED"
SRC_URI="file://hamouda.c"
do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/hamouda.c -o ${WORKDIR}/hamouda
}
do_install(){
    install -d ${D}/usr/bin
    install -m 0744 ${WORKDIR}/hamouda ${D}/usr/bin
    
}

