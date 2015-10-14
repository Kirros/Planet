package models.solid

import play.api.libs.json.{JsValue, Json}

/**
 * Represents one polygon
 * Created by Kirros on 12. 10. 2015.
 */
class Polygon(val a: Vertex, val b: Vertex, val c: Vertex) {
  val toJson: JsValue = Json.obj(
    "vertices" -> Json.arr(a.x, a.y, a.z, b.x, b.y, b.z, c.x, c.y, c.z),
    "colors" -> Json.arr(1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0)
  )
}
