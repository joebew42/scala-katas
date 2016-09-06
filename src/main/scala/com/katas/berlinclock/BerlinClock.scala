package com.katas.berlinclock

object BerlinClock {
  def topLampAtTime(seconds: Int) = if(seconds % 2 == 0) "O" else "Y"

  def firstTopLampsAtTime(hours: Int): String = {
    hours / 5 match {
      case 1 => return "ROOO"
      case 2 => return "RROO"
      case 3 => return "RRRO"
      case 4 => return "RRRR"
      case _ => return "OOOO"
    }
  }
}
