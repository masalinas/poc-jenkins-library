package io.oferto

class Docker {
  def build(String image, String version="latest") {
    echo "Building image ${image}:${version} ..."
  }
}