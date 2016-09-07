package com.katas.berlinclock

object BerlinClock {
  def topLampAt(seconds: Int) = if(seconds % 2 == 0) "O" else "Y"

  def firstTopLampsAt(hours: Int): String = {
    hours / 5 match {
      case 1 => return "ROOO"
      case 2 => return "RROO"
      case 3 => return "RRRO"
      case 4 => return "RRRR"
      case _ => return "OOOO"
    }
  }

  def secondTopLampsAt(hours: Int): String = {
    return "OOOO"
  }
}
