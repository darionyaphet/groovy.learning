def writer = new StringWriter()
def xml = new groovy.xml.MarkupBuilder(writer)

xml.person {
  name "Darion"
  age  24
  addr 'Beijing.Chain'
}

println writer.toString()
