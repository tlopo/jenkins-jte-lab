def getParallel(var) {
    var = readYaml(var)

    def p = [:]

    var.each {
        p[it.name] = { echo "--> ${it.cmd}" }
    }

    return p
}

void call(var){

    parallel getParallel(var) 

    stage("I am foo, received ${var}") {
        echo "I am foo and received ${var}"
    }
}
