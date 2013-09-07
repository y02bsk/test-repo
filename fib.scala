def fib(n: Int) = ((0, 1) /: (0 until n)) { case ((a,b),_) => (b, a+b) }._1
println(fib(40))

