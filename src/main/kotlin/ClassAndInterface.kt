// kotlin은 클래스 없이 사용 가능

const val num = 20 // java final과 동일

fun main() {
  val john = Person("John", 20)
  val john2 = Person("John", 20)
  println(john == john2) // true
  println(john)
  println(john2)
  john.age = 10
//  john.hobby = 0 // 오류
  println(john.hobby)

  val dog: Animal = Dog()
  val cat = Cat()

  if (dog is Animal) {
    println("멍멍이")
  }
}

// data를 붙이면 equals, hashcode를 선언할 필요가 없어짐
open class Person(  // 이게 기본 생성자.
  val name: String, // val로 선언하면 수정이 불가능하므로 getter 가능
  var age: Int,
) {
  var hobby = "축구"
    private set // set 못 하도록 막음
    get() = "취미: $field" // getter는 field로 정의
  init { // 클래스 초기화 할 때 사용
    println("init")
  }

  fun some() {
    hobby = "농구"
  }
}

interface Drawable {
  fun draw()
}

abstract class Animal {
  // open 키워드가 있어야 자식에서 오버라이드 가능
  open fun move() {
    print("이동")
  }
}

class Dog : Animal(), Drawable {
  override fun move() {
    println("개가 이동")
  }

  override fun draw() {
    TODO("Not yet implemented")
  }
}

class Cat: Animal(), Drawable {
  override fun move() {
    println("고양이가 이동")
  }

  override fun draw() {
    TODO("Not yet implemented")
  }
}

// 추상이 아닌 일반 클래스는 상속이 기본적으로 상속을 못하므로 Person에 open을 붙여줘야한다
class Superman(name: String, age: Int) : Person(name, age) {

}