package controllers

import models.Planet
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val planet = new Planet()
    Ok(views.html.index(planet.display))
  }

}