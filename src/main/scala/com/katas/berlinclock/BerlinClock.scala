package com.katas.berlinclock

import scala.annotation.tailrec

object BerlinClock {

  def topLampAt(seconds: Int) = if(seconds % 2 == 0) "O" else "Y"

  def topFirstRowLampsAt(hours: Int): String = {
    return lightsToLamps('R', hours / 5)
  }

  def topSecondRowLampsAt(hours: Int): String = {
    return lightsToLamps('R', hours % 5)
  }

  def bottomFirstRowLampsAt(minutes: Int): String = {
    return alternateLightsToLamps(minutes / 5)
  }

  def bottomSecondRowLampsAt(minutes: Int): String = {
    return lightsToLamps('Y', minutes % 55)
  }

  def lightsToLamps(color: Char, lights: Int): String = {
    return List.fill(lights)(color).mkString.padTo(4, 'O')
  }

  def alternateLightsToLamps(lights: Int): String = {
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
