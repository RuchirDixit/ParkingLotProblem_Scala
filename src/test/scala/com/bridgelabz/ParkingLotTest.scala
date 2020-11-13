package com.bridgelabz

import org.scalatest.FunSuite

class ParkingLotTest extends FunSuite {
  test("givenDetailsDriverShouldBeAbleToParkCar") {
    val status = ParkingLot.addCarToParking("MH12 Al4344","White","0732")
    assert(status == "Parked")
  }
  test("givenDetailsIfCarexistsDriverShouldBeAbleToUnParkCar") {
    ParkingLot.addCarToParking("MH12 Al4344","White","0732")
    val status = ParkingLot.unParkCar("MH12 Al4344")
    assert(status == "Car Unparked")
  }
}
