import groovy.json.JsonBuilder
import groovy.json.JsonOutput

def json = new JsonBuilder()
json.state{
    firstName  "darion"
    middleName "Johannes"
    lastName   "Yaphet"
}

println JsonOutput.prettyPrint(json.toString())
