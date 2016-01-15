# usage from cli :

* interactive Mode (select io.chaiwala.maven.archetype and response to questions) :

        mvn archetype:generate

* non interactive / batch (change info in the last line) :

        mvn archetype:generate -B \
          -DarchetypeGroupId=io.chaiwala.maven.archetype -DarchetypeArtifactId=spray-servlet -DarchetypeVersion=0.1-SNAPHOT \
          -DgroupId=com.company -DartifactId=project -Dversion=0.1-SNAPSHOT -Dpackage=com.company

* example compile/run :

        mvn war:exploded

        mvn jetty:run 

* Open a browser and browse to http://localhost:9998

# Changes:

## 0.1-SNAPSHOT

* Created

=================================================================
This is a fork of "davidB/scala-archetype-simple" project
