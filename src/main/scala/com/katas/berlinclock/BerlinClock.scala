package com.katas.berlinclock

import scala.annotation.tailrec

object BerlinClock {

  def topLampAt(seconds: Int) = if(seconds % 2 == 0) "O" else "Y"

  def topFirstRowLampsAt(hours: Int): String = {
    return redLightsToLamps(hours / 5)
  }

  def topSecondRowLampsAt(hours: Int): String = {
    return redLightsToLamps(hours % 5)
  }

  def bottomFirstRowLampsAt(minutes: Int): String = {
    return lightsToLamps(minutes / 5)
  }

  def bottomSecondRowLampsAt(lights: Int): String = {
    return "OOOO"
  }

  def redLightsToLamps(lights: Int): String = {
    return List.fill(lights)('R').mkString.padTo(4, 'O')
  }

  def lightsToLamps(lights: Int): String = {
    @tailrec
    def lightsToLamps(currentLight: Int, lights: Int, accumulator: String): String = {
      if (currentLight == lights + 1) {
        accumulator
      } else {
        currentLight % 3 match {
          case 0 => lightsToLamps(currentLight + 1, lights, accumulator.concat("R"))
          case _ => lightsToLamps(currentLight + 1, lights, accumulator.concat("Y"))
        }
      }
    }

    return lightsToLamps(1, lights, "").mkString.padTo(11, 'O')
  }
}
