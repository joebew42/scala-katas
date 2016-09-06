package com.katas.berlinclock

import com.katas.util.UnitSpec

class BerlinClockSpec extends UnitSpec {
  it should "blink the yellow top lamp every 2 seconds" in {
    BerlinClock.topLampAt(0) shouldBe "O"
    BerlinClock.topLampAt(1) shouldBe "Y"
  }

  it should "lights a red lamp each 5 hours in the first top row" in {
    BerlinClock.firstTopLampsAt(0) shouldBe "OOOO"
    BerlinClock.firstTopLampsAt(5) shouldBe "ROOO"
    BerlinClock.firstTopLampsAt(10) shouldBe "RROO"
    BerlinClock.firstTopLampsAt(15) shouldBe "RRRO"
    BerlinClock.firstTopLampsAt(20) shouldBe "RRRR"
  }
}
