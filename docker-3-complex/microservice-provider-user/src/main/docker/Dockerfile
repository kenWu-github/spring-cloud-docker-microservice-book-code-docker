# Dockerfile for apollo-portal
# Build with:
# docker build -t itmuch/microservice-provider-user:0.0.1-SNAPSHOT .
# Run with:
# docker run -p 8000:8000 -d --name microservice-provider-user itmuch/microservice-provider-user:0.0.1-SNAPSHOT
FROM openjdk:8-alpine
MAINTAINER KEN

ENV VERSION 0.0.1-SNAPSHOT
ENV FINALNAME microservice-provider-user

RUN echo -e "https://mirrors.aliyun.com/alpine/v3.7/main" > /etc/apk/repositories
RUN apk update \
        && apk upgrade \
        && apk add --no-cache bash \
        bash-doc \
        bash-completion \
        && rm -rf /var/cache/apk/*

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone

ADD ${FINALNAME}-${VERSION}.jar /${FINALNAME}-${VERSION}.jar

EXPOSE 8010

ENTRYPOINT ["java", "-jar", "/microservice-provider-user-0.0.1-SNAPSHOT.jar"]