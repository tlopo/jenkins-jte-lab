void call(cmd){
    echo "Running ${cmd}"
    sh "${cmd} > parallel_commands.yml"
}
