fun main() {
  var items = listOf(1, 2, 3, 4, 5) // 변경이 불가능한 리스트
  items.forEach { item ->
    print(item)
  }
  println()

  for (i in 0..<items.size) {
    print("${items[i]} ")
  }

  val items2 = mutableListOf(1, 2, 3, 4, 5) // 변경이 가능한 리스트
  items2.add(6)
  items2.remove(3)

  val array = arrayOf(1, 2, 3) // 배열
  array[0] = 1

  try {
    val value = array[4]
  } catch (ex: Exception) {
    print(ex.message)
  }
}