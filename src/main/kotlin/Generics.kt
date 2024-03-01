class Box<T>(var value: T) {

}

fun main() {
  val box = Box(10)
  val box2 = Box("afa")
  println(box.value)
  println(box2.value)
}