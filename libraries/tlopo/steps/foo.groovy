void call(var){

    def jobs = ["JobA", "JobB", "JobC"]
     
    def parallelStagesMap = jobs.collectEntries {
        ["${it}" : generateStage(it)]
    }
     
    def generateStage(job) {
        return {
            stage("stage: ${job}") {
                    echo "This is ${job}."
            }
        }
    }


    stage('parallel stage') {
        steps {
            script {
                parallel parallelStagesMap
            }
        }
    }
}
