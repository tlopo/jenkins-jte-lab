def getParallel(cmds) {
    cmds = readYaml(text: cmds)

    def p = [:]

    cmds.each {
        p[it.name] = { sh it.cmd }
    }

    return p
}

void call(cmds){
    node {
        parallel getParallel(cmds)
    }
}
