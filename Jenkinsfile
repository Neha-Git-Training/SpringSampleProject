node{
  stage('git checkout'){
    git 'https://github.com/Neha-Git-Training/SpringSampleProject'
  }
  
  stage('compile-maven-jar'){
    //get mav home path
    def mvnHome = tool name: 'maven_home', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
    sh 'cd $WORKSPACE/target'
    sh label: '', script: 'pwd'
    dir("${WORKSPACE}/target"){
      sh "pwd"
      sh label: '', script: 'ls'
    }
    sh label: '', script: 'ls'
  }
}
