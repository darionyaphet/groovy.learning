import groovy.json.*

class example{
    static void main(args){
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John Doe" } /* some comment */')
        println object.name
    }
}
