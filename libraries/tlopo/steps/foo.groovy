void call(var){
    def p = [:]

    var.each {
        p[it] = { echo "${it}" }
    }

    parallel p 

    stage("I am foo, received ${var}") {
        echo "I am foo and received ${var}"
    }
}
