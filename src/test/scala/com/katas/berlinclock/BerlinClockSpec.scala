package com.katas.berlinclock

import com.katas.util.UnitSpec

class BerlinClockSpec extends UnitSpec {
  it should "blink the yellow top lamp every 2 seconds" in {
    BerlinClock.topLampAt(0) shouldBe "O"
    BerlinClock.topLampAt(1) shouldBe "Y"
  }

  it should "lights a red lamp each 5 hours in the first top row" in {
    BerlinClock.topFirstRowLampsAt(0) shouldBe "OOOO"
    BerlinClock.topFirstRowLampsAt(5) shouldBe "ROOO"
    BerlinClock.topFirstRowLampsAt(10) shouldBe "RROO"
    BerlinClock.topFirstRowLampsAt(15) shouldBe "RRRO"
    BerlinClock.topFirstRowLampsAt(20) shouldBe "RRRR"
  }

  it should "lights a red lamp each 1 hour in the second top row" in {
    BerlinClock.topSecondRowLampsAt(0) shouldBe "OOOO"
    BerlinClock.topSecondRowLampsAt(1) shouldBe "ROOO"
    BerlinClock.topSecondRowLampsAt(2) shouldBe "RROO"
    BerlinClock.topSecondRowLampsAt(3) shouldBe "RRRO"
    BerlinClock.topSecondRowLampsAt(4) shouldBe "RRRR"
    BerlinClock.topSecondRowLampsAt(5) shouldBe "OOOO"
  }

  it should "lights a yellow lamp each 5 minutes in the first bottom row" in {
    BerlinClock.bottomFirstRowLampsAt(0) shouldBe "OOOOOOOOOOO"
  }
}
