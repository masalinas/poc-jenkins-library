package io.oferto

class Kube {
  static def docker(script) {
    script.sh 'curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"'
    script.sh 'chmod u+x ./kubectl'
    script.sh './kubectl get pods'  
  }

  static def helm(script) {
    script.sh 'curl -LO https://get.helm.sh/helm-v3.16.3-linux-amd64.tar.gz'
    script.sh 'tar -zxvf helm-v3.16.3-linux-amd64.tar.gz'
    script.sh './linux-amd64/helm list'
  }
}