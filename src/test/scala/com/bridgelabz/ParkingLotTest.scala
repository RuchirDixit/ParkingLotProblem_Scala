package com.bridgelabz

import org.scalatest.FunSuite

class ParkingLotTest extends FunSuite {
  // UC1
  test("givenDetailsDriverShouldBeAbleToParkCar") {
    val status = ParkingLot.addCarToParking("MH12 Al4344","White","0732")
    assert(status == "Parked")
  }
  // UC2
  test("givenDetailsIfCarexistsDriverShouldBeAbleToUnParkCar") {
    ParkingLot.addCarToParking("MH12 Al4344","White","0732")
    val status = ParkingLot.unParkCar("MH12 Al4344")
    assert(status == "Car Unparked")
  }
  // UC3
  test("givenDetailsCheckReturnFalseIfParkingLotNotFull") {
    ParkingLot.addCarToParking("MH12 Al4344","White","0732")
    assert(ParkingLot.checkIfLotFull == false)
  }
  // UC4
  test("givenDetailsReturnRedirectMessageIfParkingLotFull") {
    val message = ParkingLot.moveAirportStaff(true)
    assert(message == "Redirect staff")
  }
  test("givenDetailsReturnStayMessageIfParkingLotNotFull") {
    val message = ParkingLot.moveAirportStaff(false)
    assert(message == "Let staff stay")
  }

}
