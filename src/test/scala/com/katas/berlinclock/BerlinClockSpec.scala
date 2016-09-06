package com.katas.berlinclock

import com.katas.util.UnitSpec

class BerlinClockSpec extends UnitSpec {
  it should "blink the yellow top lamp every 2 seconds" in {
    BerlinClock.topLampAtTime(0) shouldBe "O"
    BerlinClock.topLampAtTime(1) shouldBe "Y"
  }

  it should "lights a red lamp each 5 hours in the first top row" in {
    BerlinClock.firstTopLampsAtTime(0) shouldBe "OOOO"
    BerlinClock.firstTopLampsAtTime(5) shouldBe "ROOO"
    BerlinClock.firstTopLampsAtTime(10) shouldBe "RROO"
    BerlinClock.firstTopLampsAtTime(15) shouldBe "RRRO"
    BerlinClock.firstTopLampsAtTime(20) shouldBe "RRRR"
  }
}
