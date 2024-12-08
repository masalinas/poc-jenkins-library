static def call(script) {
    script.sh 'curl -LO https://get.helm.sh/helm-v3.16.3-linux-amd64.tar.gz'
    script.sh 'tar -zxvf helm-v3.16.3-linux-amd64.tar.gz'
    script.sh './linux-amd64/helm list'
}