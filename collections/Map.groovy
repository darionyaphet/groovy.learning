def map = ['first-name':'darion',
           'last-name':'yaphet',
           'age':24]

def key = 'city'
map."${key}" = 'BeiJing'

println map.containsKey('city')
println map.get('first-name')
println map.get('country','China')
map.put('country','China')

println map.keySet()
println map.values()

println map.size()

map.each{ pair ->
    println pair.key +' : '+pair.value
}



