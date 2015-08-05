
def string = '123456789'

println string[1..3]
println string[1,3,5]
println string.contains('4')

println string - '3'
println string - '234'

def number = '123'
println "IS Integer : " + number.isInteger()
println "To Number  : " + number.toInteger()

// isDouble()、isFloat()、isLong()、isNumber()、isBigDecimal()、isBigInteger()
def floatNumber = '1.23'
println "IS Integer : " + floatNumber.isInteger()



