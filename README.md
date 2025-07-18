# meta-hamouda

This is a custom Yocto layer that adds a simple C application called `hamouda` to a core-image-minimal.

## 🔧 What It Does

- Builds a simple `hello hamouda` program
- Includes a custom BitBake recipe
- Adds it to the final image
- Runs successfully in QEMU

## 📘 Step-by-Step Setup (From Scratch)

> Follow these exact steps to build and run it.

```bash
# Clone Poky and enter the build environment
mkdir -p ~/yocto/layers
cd ~/yocto/layers
git clone git://git.yoctoproject.org/poky
cd ~/yocto
source layers/poky/oe-init-build-env build

# Create and add the layer
bitbake-layers create-layer ../layers/meta-hamouda
bitbake-layers add-layer ../layers/meta-hamouda

# Add hamouda.c and recipe (already done)
# Edit conf/local.conf
IMAGE_INSTALL:append = " hamouda"

# Build and run
bitbake core-image-minimal
runqemu qemux86-64
