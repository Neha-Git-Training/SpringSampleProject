node{
  stage('git checkout'){
    git 'https://github.com/Neha-Git-Training/SpringSampleProject'
  }
  
  stage('compile-maven-jar'){
    //get mav home path
    def mvnHome = tool name: 'maven_home', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
    sh label: '', script: 'ls'
    sh label: '', script: 'pwd'
    sh label: '', script: 'echo $WORKSPACE'
    sh label: '', script: '''temp = $WORKSPACE
echo $temp'''
  }
}
