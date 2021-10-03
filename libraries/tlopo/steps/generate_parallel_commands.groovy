String call(cmd){
    stage('Generating Parallel Commands') {
        echo "Running ${cmd}"
        node {
            sh "${cmd} > parallel_commands.yml"
        }
    }
}
