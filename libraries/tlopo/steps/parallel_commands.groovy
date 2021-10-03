def getParallel(cmds) {
    cmds = readYaml(text: cmds)

    def p = [:]

    cmds.each {
        p[it.name] = { sh it.cmd }
    }

    return p
}

/*
* It expects a JSON/YAML string wiht the following schema: 
* [{"name","string", "cmd": "string"}..]
*/

void call(cmds){
    node {
        parallel getParallel(cmds)
    }
}
