to create archetype local in your .m2 folder, run:

```
mvn clean install
```

example to create project from archetype:

```
mvn archetype:generate -DarchetypeGroupId=br.com.felixgilioli \
                       -DarchetypeArtifactId=spring-felix-archetype \
                       -DarchetypeVersion=1.0-SNAPSHOT \
                       -DgroupId=br.com.felixgilioli \
                       -DartifactId=person-service \
                       -Dversion=1.0-SNAPSHOT
```

variable `artifactName` is used to set package, for example:

```
personservice
```

after generated, import like gradle project in your IDE.