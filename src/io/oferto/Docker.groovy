package io.oferto

class Docker {
  def build(String image, String version="latest") {
    return "Building image ${image}:${version} ..."
  }
}