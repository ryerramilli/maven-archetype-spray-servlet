# usage from cli :

* interactive Mode (select io.chaiwala.maven.archetype and response to questions) :

        mvn archetype:generate

* non interactive / batch (change info in the last line) :

        mvn archetype:generate -B \
          -DarchetypeGroupId=org.geekolator.maven.archetype -DarchetypeArtifactId=spray-servlet -DarchetypeVersion=0.1-SNAPHOT \
          -DgroupId=com.company -DartifactId=project -Dversion=0.1-SNAPSHOT -Dpackage=com.company

* example compile/run :

        mvn compile war:exploded jetty:run -Dservice.port=8181

* Test:

        curl -v http://localhost:8181
        curl -v http://localhost:8181/products/999
        curl -v -X PUT http://localhost:8181/orders/807

# Changes:

## 0.1-SNAPSHOT

* Created

=================================================================
This is a fork of "davidB/scala-archetype-simple" project
