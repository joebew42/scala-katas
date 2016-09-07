package com.katas.berlinclock

object BerlinClock {
  def topLampAt(seconds: Int) = if(seconds % 2 == 0) "O" else "Y"

  def topFirstRowLampsAt(hours: Int): String = {
    hours / 5 match {
      case 1 => return "ROOO"
      case 2 => return "RROO"
      case 3 => return "RRRO"
      case 4 => return "RRRR"
      case _ => return "OOOO"
    }
  }

  def topSecondRowLampsAt(hours: Int): String = {
    return hours % 5 match {
      case 1 => "ROOO"
      case 2 => "RROO"
      case 3 => "RRRO"
      case 4 => "RRRR"
      case _ => "OOOO"
    }
  }
}
