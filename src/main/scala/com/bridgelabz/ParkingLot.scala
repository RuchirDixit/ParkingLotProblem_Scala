package com.bridgelabz
import java.util.Calendar;
import scala.collection.mutable.Map

/**
 *
 * @param numberPlate : Number of vehicle
 * @param colour : Colour of vehicle
 * @param timeOfPark : Timing of parking the vehicle
 * Class vehicle to store and get information about Vehicle
 */
class Vehicle(numberPlate : String,colour : String,timeOfPark : String)
{
  def getNumberPlateValue = {
    numberPlate
  }
  def getColourValue = {
    colour
  }
  def getTimeOfPark = {
    timeOfPark
  }
}

object ParkingLot {
  // Mutable map to store int as keys and Vehicle objects as values
  var map : Map[Int,Vehicle] = Map()

  /**
   *
   * @param numberPlate : Number of vehicle
   * @param colour : Colour of vehicle
   * @param timeOfPark : Timing of parking the vehicle
   * @return : Messsage to check if car is parked or not
   */
  def addCarToParking(numberPlate : String,colour : String,timeOfPark : String) = {
    try
      {
        // add vehicles to parking lot
      map += (1 -> new Vehicle(numberPlate,colour,timeOfPark))
      "Parked"
    }
    catch {
      case _:Exception => {
        "Incorrect Input"
      }
    }
  }
  // main method with menu driven program
  def main(args: Array[String]): Unit = {
    var choice = 99
    while(choice!=0)
      {
        println("1. Park Car \n 0.Exit")
        val choice = scala.io.StdIn.readInt()
        choice match {
          case 1 => {
            addCarToParking("MH12","White","1215")
          }
          case 0 => {
            System.exit(1)
          }
        }
      }
  }
}

