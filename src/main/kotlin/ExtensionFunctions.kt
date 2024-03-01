fun String.isValidPhone(): Boolean {
  return Regex("^[0-9]{3}[-]+[0-9]{4}[-]+[0-9]{4}\$").matches(this)
}

fun main() {
  println("this is not phone".isValidPhone())
}