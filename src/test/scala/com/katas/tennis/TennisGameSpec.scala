package com.katas.tennis

import com.katas.util.UnitSpec

class TennisGameSpec extends UnitSpec {
  it should "returns 'Love - Love' as initial score" in {
    val game = new TennisGame()

    game.score shouldBe "Love - Love"
  }

  it should "returns 'Fifteen - Love' when player one makes first point" in {
    val game = new TennisGame()

    game.playerOneScore

    game.score shouldBe "Fifteen - Love"
  }

  it should "returns 'Fifteen - Fifteen' when both players makes one point each" in {
    val game = new TennisGame()

    game.playerTwoScore
    game.playerOneScore

    game.score shouldBe "Fifteen - Fifteen"
  }

  it should "returns 'Thirty - Love' when player one makes two points" in {
    val game = new TennisGame()

    game.playerOneScore
    game.playerOneScore

    game.score shouldBe "Thirty - Love"
  }

  it should "returns 'Thirty - Thirty' when both players makes two points" in {
    val game = new TennisGame()

    game.playerOneScore
    game.playerOneScore
    game.playerTwoScore
    game.playerTwoScore

    game.score shouldBe "Thirty - Thirty"
  }

  it should "returns 'Forty - Love' when player one makes four points" in {
    val game = new TennisGame()

    game.playerOneScore
    game.playerOneScore
    game.playerOneScore
    game.playerOneScore

    game.score shouldBe "Forty - Love"
  }

  it should "returns 'Duece' when both makes four points" in {
    val game = new TennisGame()

    game.playerOneScore
    game.playerOneScore
    game.playerOneScore
    game.playerOneScore
    game.playerTwoScore
    game.playerTwoScore
    game.playerTwoScore
    game.playerTwoScore

    game.score shouldBe "Duece"
  }
}
