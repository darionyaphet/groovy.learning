
class MOPHandler {
    def invokeMethod(String method, Object params) { 
        println "MOPHandler was asked to invoke ${method}"
        if(params!=null) {
            params.each{ println "\twith parameter ${it}" } 
        }
    }

    def getProperty(String property){ 
        println "MOPHandler was asked for property ${property}"
    }
}

def handler = new MOPHandler() 
handler.helloWorld() 
handler.createUser("Joe", 18, new Date()) 
handler.name
