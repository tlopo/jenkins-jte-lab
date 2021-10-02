/*def generateStage(job) {
    return {
        stage("stage: ${job}") {
            echo "This is ${job}."
        }
    }
}*/

void call(var){
/*
    def jobs = ["JobA", "JobB", "JobC"]
     
    def parallelStagesMap = jobs.collectEntries {
        ["${it}" : generateStage(it)]
    }
*/     

//    parallel "step1": { echo "step1" }, "step2": { "echo step2" }
  
    def p = [:]

    var.each {
        p[it] = { echo "${it}" }
    }

    parallel p 

    stage("I am foo, received ${var}") {
        echo "I am foo and received ${var}"
    }
}
