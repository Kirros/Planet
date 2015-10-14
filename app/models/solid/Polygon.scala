package models.solid

import play.api.libs.json.{JsValue, Json}

/**
 * Represents one polygon
 * Created by Kirros on 12. 10. 2015.
 */
class Polygon(val a: Vector, val b: Vector, val c: Vector) {

  val toJson: JsValue = Json.obj(
    "vertices" -> Json.arr(a.x, a.y, a.z, b.x, b.y, b.z, c.x, c.y, c.z),
    "colors" -> Json.arr(0.5, 0.5, 0.5, 1.0, 0.6, 0.6, 0.6, 1.0, 0.4, 0.4, 0.4, 1.0)
  )

  def getEdgeMiddlePoint(vector1: Vector, vector2: Vector): Vector = {
    val newVector = vector1 + vector2
    newVector.normalize() * vector1.length
  }

  def tessellate(): Seq[Polygon] = {
    val ab = getEdgeMiddlePoint(a, b)
    val bc = getEdgeMiddlePoint(b, c)
    val ac = getEdgeMiddlePoint(a, c)

    Seq(new Polygon(a, ab, ac),
        new Polygon(ab, ac, bc),
        new Polygon(b, bc, ab),
        new Polygon(c, bc, ac))
  }
}
