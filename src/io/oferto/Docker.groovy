#!/usr/bin/env groovy
package io.oferto

class Docker {
  def build(String image, String version= '1.1.0') {
    echo "Building image ${image}:${version} ..."
  }
}