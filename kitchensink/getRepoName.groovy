// Groovy code to get repo name

def getRepoName(String giturl) {
    println "Git url is ${giturl}"
    rep_name=giturl.tokenize('/')[3]
    println "after tokenize ${rep_name}"
    }

return this
   
  
