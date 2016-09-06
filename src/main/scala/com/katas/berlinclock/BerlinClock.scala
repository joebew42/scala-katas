package com.katas.berlinclock

object BerlinClock {
  def topLampAtTime(seconds: Int) = if(seconds % 2 == 0) "O" else "Y"

  def firstTopLampsAtTime(hours: Int) = "OOOO"
}
