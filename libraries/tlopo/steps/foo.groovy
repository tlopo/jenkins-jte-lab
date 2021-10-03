def getParallel(var) {
    def p = [:]
    var.each {
        p[it] = { echo "${it}" }
    }
    return p
}

void call(var){

    parallel getParallel(var) 

    stage("I am foo, received ${var}") {
        echo "I am foo and received ${var}"
    }
}
