package ${package}

import akka.actor.{ActorSystem, Props}
import spray.servlet.WebBoot

class Bootstrap extends WebBoot {
  
  val system = ActorSystem("$artifactId")
  
  val serviceActor = system.actorOf(Props[MyServiceActor])
  
}
