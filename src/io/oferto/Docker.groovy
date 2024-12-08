package io.oferto

public class Docker {
  def build(image, version = '1.1.0') {
    echo 'Building image ${image}:${version} ...'
  }
}