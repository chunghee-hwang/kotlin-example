import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
  doWorld()
  println("Done")

  repeat(50_000) {
    launch {
      delay(5000L)
      print(".")
    }
  }
}

// 다른 코루틴에서 실행하는 함수
suspend fun doWorld() = coroutineScope{
  val job = launch {
    delay(2000L)
    println("  World 2")

  }
  val job2 = launch {
    delay(1000L)
    println("  World 1")
  }
  println("Hello")
  job.join() // job이 끝날 때 까지 대기
  job2.join()
  println("World")
}