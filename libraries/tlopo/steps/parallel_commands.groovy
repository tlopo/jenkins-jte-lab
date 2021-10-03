def getParallel(var) {
    var = readYaml(var)

    def p = [:]

    var.each {
        p[it.name] = { echo "--> ${it.cmd}" }
    }

    return p
}

void call(){
    node {
         readFile('parallel_commands.yml')
        //parallel getParallel(var)
    }
}
