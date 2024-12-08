package io.oferto

class Docker {
  def build(String image, String version = '1.1.0') {
    println 'Building image ${image}:${version} ...'
  }
}