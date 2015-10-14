package models.solid

/**
 * Represents vector in space
 * Created by Kirros on 14. 10. 2015.
 */
class Vector(val x: Double, val y: Double, val z: Double) {
  val length: Double = Math.sqrt(x*x + y*y + z*z)

  def +(other: Vector) = new Vector(x + other.x, y + other.y, z + other.z)
  def *(scalar: Double) = new Vector(x * scalar, y * scalar, z * scalar)
  def normalize() = new Vector(x / length, y / length, z / length)
}
