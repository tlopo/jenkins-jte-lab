/*
*  It runs a command and expect the stdout to be a JSON/YAML string with the following schema:
*  [ {"name": "string", "cmd": "string"}...]
*/
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
