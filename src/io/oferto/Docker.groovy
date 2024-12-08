package io.oferto

class Docker {
  def build(String image, String version=1.1.0) {
    return "Building image ${image}:${version} ..."
  }
}