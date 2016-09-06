package com.katas.fizzbuzz

object FizzBuzz {
  private val fifteen: Int = 15
  private val three: Int = 3
  private val five: Int = 5

  def parse(number: Int): String = {
    number match {
      case _ if isMultipleOfFifteen(number) => return "FizzBuzz"
      case _ if isMultipleOfThree(number) => return "Fizz"
      case _ if isMultipleOfFive(number) => return "Buzz"
      case _ => return number.toString
    }
  }

  def isMultipleOfFive: (Int) => Boolean = isMultipleOf(five)
  def isMultipleOfThree: (Int) => Boolean = isMultipleOf(three)
  def isMultipleOfFifteen: (Int) => Boolean = isMultipleOf(fifteen)

  def isMultipleOf(number: Int)(otherNumber: Int): Boolean = otherNumber % number == 0
}
