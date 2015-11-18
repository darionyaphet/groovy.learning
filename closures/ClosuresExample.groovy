
//The simpliest explanation of a closure in Groovy is that it is anonymous function. 
def closure = {println "I'm a Closure"}
closure()


def closureWithParameters = {x, y -> println(x  + " and " + y+" are good friends")}
closureWithParameters("Darion", "Lucien")  
