# Run app

В файле Dockerfile установить значение:
- app.id для работы с API курсов валют https://docs.openexchangerates.org/
- api.key для работы с API гифок https://developers.giphy.com/docs/api#quick-start-guide

1. ./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.0.jar
2. docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/gs-spring-boot-docker .
3. docker run -p 8080:8080 springio/gs-spring-boot-docker