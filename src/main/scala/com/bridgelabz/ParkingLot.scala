package com.bridgelabz
import java.util.Calendar;
import scala.collection.mutable.Map

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
  var map : Map[Int,Vehicle] = Map()

  def addCarToParking(numberPlate : String,colour : String,timeOfPark : String) = {
    try
      {
      map += (1 -> new Vehicle(numberPlate,colour,timeOfPark))
      "Parked"
    }
    catch {
      case _:Exception => {
        "Incorrect Input"
      }
    }
  }

  def unParkCar(numberPlate : String) = {
    try{
      map.foreach{ i =>
        if (i._2.getNumberPlateValue.equals(numberPlate)){
          map.remove(i._1)
        }
      }
      "Car Unparked"
    }
    catch {
      case _ : NoSuchElementException => "No car found"
      case _ : Exception => "No car found"
    }
  }
  def main(args: Array[String]): Unit = {
    var choice = 99
    while(choice!=0)
      {
        println("1. Park Car \n 2. Search car \n 3. Unpark car \n 0.Exit")
        val choice = scala.io.StdIn.readInt()
        choice match {
          case 1 => {
            addCarToParking("MH12","White","1215")
          }
          case 3 => {
            unParkCar("MH12")
          }
          case 0 => {
            System.exit(1)
          }
        }
      }
  }
}

