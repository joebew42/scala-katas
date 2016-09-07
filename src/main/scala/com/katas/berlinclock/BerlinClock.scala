package com.katas.berlinclock

object BerlinClock {
  def topLampAt(seconds: Int) = if(seconds % 2 == 0) "O" else "Y"

  def topFirstRowLampsAt(hours: Int): String = {
    return lightsToLamps(hours / 5)
  }

  def topSecondRowLampsAt(hours: Int): String = {
    return lightsToLamps(hours % 5)
  }

  def lightsToLamps(lights: Int): String = {
    return lights match {
      case 1 => "ROOO"
      case 2 => "RROO"
      case 3 => "RRRO"
      case 4 => "RRRR"
      case _ => "OOOO"
    }
  }
}
