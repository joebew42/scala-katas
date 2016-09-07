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
    return List.fill(lights)('R').mkString.padTo(4, 'O')
  }
}
