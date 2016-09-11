# List of Katas done in Scala

The complete list is [here](https://technologyconversations.com/2014/03/10/scala-tutorial-through-katas/)

# Akka HTTP example

You'll find in package `restapp`

**database setup**

```
docker run -it --name postgresql -d -p 5432:5432 kiasaki/alpine-postgres:9.4
docker exec -it postgresql createdb -U postgres db_test
```

stop and remove database

```
docker rm -f postgresql
```

**run application**

```
$ sbt "run-main com.restapp.http.WebServer"
```

**some curls**

```
$ curl http://localhost:8080/values/other/path
$ curl http://localhost:8080/values/im/exists
```
