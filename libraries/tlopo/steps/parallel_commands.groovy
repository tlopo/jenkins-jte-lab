def getParallel(var) {
    var = readYaml(var)

    def p = [:]

    var.each {
        p[it.name] = { echo "--> ${it.cmd}" }
    }

    return p
}

void call(){
    var = readFile('parallel_commands.yml')
    node {
        parallel getParallel(var)
    }
}