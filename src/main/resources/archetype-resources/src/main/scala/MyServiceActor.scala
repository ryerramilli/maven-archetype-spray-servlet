package ${package} 

import akka.actor.Actor
import spray.routing.HttpServiceActor
import spray.json.DefaultJsonProtocol._
import spray.httpx.SprayJsonSupport._

class MyServiceActor extends HttpServiceActor {
  
  def receive = runRoute {

      path("orders" / Segment) {
        orderNumber =>
          get {
            complete(s"Your order(number= $orderNumber) is being processed.")
          } ~
          put {
            complete(s"Your order(number= $orderNumber) is successfully queued.")
          }
      } ~
      path("products" / IntNumber) {
          productId =>
            get {
              complete(s"Product(number= $productId) is available in the catalog.")
            }
      } ~
      get {
        complete(s"Hello World!!!")
      } 
    }
  
}