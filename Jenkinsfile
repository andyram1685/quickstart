def source_repo_checkout(){
    stage 'Checkout'
    echo 'git checkout'
    checkout scm    
}

def build_war() {
    stage 'Build war'
    def mvnHome = tool 'M3'
    echo 'mvn clean compile'
    dir ('kitchensink') {
        sh "ls -l"
        //sh "${mvnHome}/bin/mvn clean compile"
    }
}

def build_package() {
    stage 'Package'
    echo 'mvn package'   
}

def build_archive(){
    stage 'Archive'
    echo 'Archive'
    //archiveArtifacts artifacts: 'target/*.war'
}
    
node {
    // checkout source code
    source_repo_checkout()
    build_war()
    build_package()
    build_archive()
}
