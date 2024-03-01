fun main() {
  var i = 80
  var result: String = when {
    i > 10 -> "10보다 크다"
    i > 5 -> "5보다 크다"
    else -> ""
  }

  var result2: String = if (i > 10) {
    "10보다 크다"
  } else if (i > 5) {
    "5보다 크다"
  } else {
    ""
  }


  // 삼항 연산
  // boolean result = i > 10 ? true: false
  var result3 = if (i > 10) true else false
}