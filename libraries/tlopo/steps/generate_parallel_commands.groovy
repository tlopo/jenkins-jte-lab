String call(cmd){
    stage('Generating Parallel Commands') {
        echo "Running ${cmd}"
        node {
            sh "${cmd} > parallel_commands.yml"
            def out = fileRead('parallel_commands.yml')
        }
    }
    return out
}
