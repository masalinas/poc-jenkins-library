package io.oferto

class Docker {
  def build(String image, String version) {
    return "Building image ${image}:${version} ..."
  }
}