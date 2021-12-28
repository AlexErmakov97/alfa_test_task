FROM amazoncorretto:11
ENV TZ=Europe/Moscow
ENV app.id={your_app_id}
ENV api.key={your_api_key}
ENV base.currency=USD
ENV gif.url=https://media.giphy.com/media
ENV gif.random.url=https://api.giphy.com/v1/gifs
ENV exchange.rates.url=https://openexchangerates.org/api/historical
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]