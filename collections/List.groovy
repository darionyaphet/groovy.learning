def numbers = [0,1,2,3,4,5]

println 'numbers length : '+numbers.size()

println 'Index  0 : '+numbers[0]
println 'Index  2 : '+numbers[2]
println 'Index -2 : '+numbers[-2]

println 'Range 1..3 : '+numbers[1..3]

numbers+=[6,7,8]
println "Append Elements : "+numbers
numbers << 9
println "Append Single Element : "+numbers 

numbers.each{ element ->
  print element+' '
}

def reversed_numbers = numbers.reverse()
println '\nReversed List : '+reversed_numbers
def sorted_numbers = reversed_numbers.sort()
println   'Sorted   List : '+sorted_numbers

