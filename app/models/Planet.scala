package models

import play.api.libs.json.{JsValue, Json}

/**
 * Representing planet in the view
 *
 * Created by Kirros on 11. 10. 2015.
 */
class Planet {
  val json: JsValue = Json.obj( "faces" -> Json.arr(
    Json.obj("vertices" -> Json.arr(0.0, 1.0, 0.0,-1.0,-1.0, 1.0, 1.0,-1.0, 1.0), "colors" -> Json.arr(1.0,0.0,0.0,1.0,0.0,1.0,0.0,1.0,0.0,0.0,1.0,1.0)),
    Json.obj("vertices" -> Json.arr(0.0, 1.0, 0.0, 1.0,-1.0, 1.0, 1.0,-1.0,-1.0), "colors" -> Json.arr(1.0,0.0,0.0,1.0,0.0,0.0,1.0,1.0,0.0,1.0,0.0,1.0)),
    Json.obj("vertices" -> Json.arr(0.0, 1.0, 0.0, 1.0,-1.0,-1.0,-1.0,-1.0,-1.0), "colors" -> Json.arr(1.0,0.0,0.0,1.0,0.0,1.0,0.0,1.0,0.0,0.0,1.0,1.0)),
    Json.obj("vertices" -> Json.arr(0.0, 1.0, 0.0,-1.0,-1.0,-1.0,-1.0,-1.0, 1.0), "colors" -> Json.arr(1.0,0.0,0.0,1.0,0.0,0.0,1.0,1.0,0.0,1.0,0.0,1.0))
  ))

  def display: String = json.toString()
}
