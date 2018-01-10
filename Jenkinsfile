def source_repo_checkout(){
    stage 'Checkout'
    echo 'git checkout'
    checkout scm    
}

def build_war() {
    stage 'Build war'
    def mvnHome = tool 'M3' // Maven installation declared in the Jenkins "Global Tool Configuration"
    echo 'mvn clean compile'
    dir ('kitchensink') {
        sh "ls -l"
        sh "${mvnHome}/bin/mvn clean compile"
    }
}

def build_package() {
    stage 'Package'
    echo 'mvn package' 
    def mvnHome = tool 'M3' // Maven installation declared in the Jenkins "Global Tool Configuration"
    dir ('kitchensink') {
        sh "${mvnHome}/bin/mvn package
}

def build_archive(){
    stage 'Archive'
    echo 'Archiving'
    archiveArtifacts artifacts: 'target/*.war'
}
    
node {
    
    currentBuild.result = "OK"
    try {
        source_repo_checkout()
        build_war()
        build_package()
        build_archive()
    }
    catch (err) {
        currentBuild.result = "FAILED"
        mail body: "Project build FAILED is here: ${env.BUILD_URL}" ,
             from: 'anandaraman85@gmail.com'
             replyTo: 'anandaraman85@gmail.com'
             subject: 'Project build failed',
             to: 'anandaraman85@gmail.com'
        throw err
    }
}
