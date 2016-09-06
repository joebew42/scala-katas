package com.katas.fizzbuzz

class FizzBuzzSpec extends UnitSpec {
  it should "returns 'Fizz' when the number is a multiple of 3" in {
    FizzBuzz.parse(3) shouldBe "Fizz"
  }

  it should "returns 'Buzz' when the number is a multiple of 5" in {
    FizzBuzz.parse(5) shouldBe "Buzz"
  }

  it should "returns 'FizzBuzz' when the number is a multiple of 15" in {
    FizzBuzz.parse(15) shouldBe "FizzBuzz"
  }

  it should "returns the same number for other cases" in {
    FizzBuzz.parse(1) shouldBe "1"
  }
}
