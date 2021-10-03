def getParallel(var) {
    echo "Got: ${var}"
    var = readYaml(var)

    def p = [:]

    var.each {
        p[it.name] = { echo "--> ${it.cmd}" }
    }

    return p
}

void call(){
    node {
         def v = readFile('parallel_commands.yml')
         echo "V: ${v}"
         parallel getParallel(v)
    }
}
