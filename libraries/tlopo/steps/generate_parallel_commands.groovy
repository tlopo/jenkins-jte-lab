String call(cmd){
    def out = ''
    stage('Generating Parallel Commands') {
        echo "Running ${cmd}"
        node {
            out = sh(script: cmd, returnStdout: true)
            echo "OUT: ${out}"
        }
    }
    return out
}
