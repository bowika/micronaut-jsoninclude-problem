## JsonInclude does not work with native image

Expected:
```
➜  ~ curl 'http://localhost:8080'
{"name":null}%
```

Actual:
```
➜  ~ curl 'http://localhost:8080'
{}%
```

I just installed 3.5.0 with sdk and tried the most basic mn `create-app` like:
```
➜  whatever2 git:(main) mn create-app com.whatever2 \
    --features=aws-lambda,graalvm \
    --build=gradle --lang=java
```
And modifying a bit, see in this repo:
https://github.com/bowika/micronaut-jsoninclude-problem

If I run it locally (`./gradlew run`) it works fine, but after native build (`./gradlew buildNativeLambda`) it does not work on lambda.

p.s: 3.4.3-3.4.4 did the same.
