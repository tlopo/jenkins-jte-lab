def getParallel(cmds) {
    cmds = readYaml(text: cmds)

    def p = [:]

    var.each {
        p[it.name] = { echo "--> ${it.cmd}" }
    }

    return p
}

void call(cmds){
    node {
        parallel getParallel(cmds)
    }
}
