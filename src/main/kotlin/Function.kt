fun sum(a: Int, b: Int, c: Int = 0/* default value*/) = a + b + c

// callback paramter (void(kotlin: Unit) return)
fun myFunc(a: Int, callBack: () -> Unit) {
  println("함수 시작")
  callBack()
  println("함수 끝")
}

fun main() {


  println(sum(a = 10, b = 20))
  println(sum(a = 10, c = 20, b = 10))

  myFunc(10) {
    println("callback")
  }
}