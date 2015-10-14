package models

import models.solid.Sphere

/**
 * Representing planet in the view
 *
 * Created by Kirros on 11. 10. 2015.
 */
class Planet {
  def display: String = {
    val sphere = new Sphere()
    sphere.toJson.toString()
  }
}
