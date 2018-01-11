// Groovy code to get repo name

def getRepoName(String giturl) {
    println "${giturl}"
    return giturl.tokenize('/')[3]
    }

return this
   
  
