package com.bridgelabz
import scala.collection.mutable.Map
class Vehicle(numberPlate : String,colour : String,timeOfPark : String)
{
  def getNumberplatevalue = {
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
  var map : Map[Int,Vehicle] = Map()
  def addCarToParking = {
    val numberPlate = scala.io.StdIn.readLine("")
    map += (1 -> new Vehicle("MH2","White","23:00"))
    println(map.size)
  }
  def main(args: Array[String]): Unit = {
    var choice = 99
    while(choice!=0)
      {
        println("1. Park Car \n 2. Search car \n 3. Unpark car \n 4.Exit (Press 0 )")
        val choice = scala.io.StdIn.readInt()
        choice match {
          case 1 => {
            addCarToParking
          }
          case 0 => {
            System.exit(1)
          }
        }
      }
  }
}

