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
         def v = new File('parallel_commands.yml').getText()
         echo "V: ${v}"
         parallel getParallel(v)
    }
}
