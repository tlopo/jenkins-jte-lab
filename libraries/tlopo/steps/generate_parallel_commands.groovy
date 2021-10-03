void call(cmd){
    stage('Generating Parallel Commands') {
        echo "Running ${cmd}"
        sh "${cmd} > parallel_commands.yml"
    }
}
