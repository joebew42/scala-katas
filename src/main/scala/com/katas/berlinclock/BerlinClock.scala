package com.katas.berlinclock

object BerlinClock {

  def topLampAt(seconds: Int) = if(seconds % 2 == 0) "O" else "Y"

  def topFirstRowLampsAt(hours: Int): String = {
    return redLightsToLamps(hours / 5)
  }

  def topSecondRowLampsAt(hours: Int): String = {
    return redLightsToLamps(hours % 5)
  }

  def bottomFirstRowLampsAt(minutes: Int): String = {
    return yellowLightsToLamps(minutes / 5)
  }

  def redLightsToLamps(lights: Int): String = {
    return List.fill(lights)('R').mkString.padTo(4, 'O')
  }

  def yellowLightsToLamps(lights: Int): String = {
    return List.fill(lights)('Y').mkString.padTo(11, 'O')
  }
}
