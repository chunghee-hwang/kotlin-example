fun main() {
  var name: String? = null // ?를 쓰면 null 입력 가능
  name = "준석"

  name = null

  var name2: String = ""
//  name2 = name // 불가능
  name?.let {  // name이 null이 아니라면 블록 실행
    name2 = name
  }
  print(name?.length) // js의 optional chaining과 비슷
}

interface PersonRepository {
  fun findByName(name: String): Person?
}

class PersonService(
  val personRepository: PersonRepository
) {
  fun getPerson(name: String): Person {
    // optional 대신 null safe 기능 사용
    return personRepository.findByName(name)?.let {
      it
    } ?: run {
      Person("test", 12)
    }
  }

  fun getPersonAge(name: String): Int? {
    val person = personRepository.findByName(name)
    return person?.age
  }
}