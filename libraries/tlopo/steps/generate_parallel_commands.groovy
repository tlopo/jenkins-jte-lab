String call(cmd){
    stage('Generating Parallel Commands') {
        echo "Running ${cmd}"
        node {
            def out = sh(script: cmd, returnStdout: true)
        }
    }
    return out
}
