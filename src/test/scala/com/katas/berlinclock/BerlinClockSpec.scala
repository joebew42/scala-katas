package com.katas.berlinclock

import com.katas.util.UnitSpec

class BerlinClockSpec extends UnitSpec {
  it should "blink the yellow top lamp every 2 seconds" in {
    BerlinClock.topLampAtTime(0) shouldBe "O"
    BerlinClock.topLampAtTime(1) shouldBe "Y"
  }
}
