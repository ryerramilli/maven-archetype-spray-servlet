package ${package} 

import akka.actor.Actor
import spray.routing.HttpService

class MyServiceActor extends Actor with MyService {
  
  def actorRefFactory = context // context inherited from Actor
  
  def receive = runRoute(myRoute)
  
}

trait MyService extends HttpService {

  val myRoute = path("") {
    get {
      respondWithMediaType(spray.http.MediaTypes.`text/plain`) {
        complete {
          "Hello, World!!!"
        }
      }
    }
  }
}
