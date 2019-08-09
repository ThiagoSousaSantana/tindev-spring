FROM openjdk:8-jre-alpine

ENV APP_ROOT /app

RUN mkdir ${APP_ROOT}

WORKDIR ${APP_ROOT}

COPY build/libs/*.jar ${APP_ROOT}/app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]