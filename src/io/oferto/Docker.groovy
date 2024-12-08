package io.oferto

class Docker {
  def build(String image, String version) {
    echo "Building image ${image}:${version} ..."
  }
}