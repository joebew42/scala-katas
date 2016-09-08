package com.katas.tennis

class TennisGame {
  private var playerOneScoreMessage: String = "Love"
  private var playerTwoScoreMessage: String = "Love"

  def playerOneScore: Unit = {
    playerOneScoreMessage = nextScoreMessage(playerOneScoreMessage)
  }

  def playerTwoScore: Unit = {
    playerTwoScoreMessage = nextScoreMessage(playerTwoScoreMessage)
  }

  def score: String = Tuple2(playerOneScoreMessage, playerTwoScoreMessage) match {
    case Tuple2("Forty", "Forty") => "Duece"
    case _ => s"${playerOneScoreMessage} - ${playerTwoScoreMessage}"
  }

  private def nextScoreMessage(message: String) = message match {
    case "Love" => "Fifteen"
    case "Fifteen" => "Thirty"
    case _ => "Forty"
  }
}

