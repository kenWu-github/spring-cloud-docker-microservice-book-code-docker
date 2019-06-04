# Dockerfile for apollo-portal
# Build with:
# docker build -t itmuch/microservice-gateway-zuul:0.0.1-SNAPSHOT .
# Run with:
# docker run -p 8040:8040 -d --name microservice-gateway-zuul itmuch/microservice-gateway-zuul:0.0.1-SNAPSHOT
FROM java:8-jre
MAINTAINER KEN

ENV VERSION 0.0.1-SNAPSHOT
ENV FINALNAME microservice-gateway-zuul

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone

ADD ${FINALNAME}-${VERSION}.jar /${FINALNAME}-${VERSION}.jar

EXPOSE 8010

ENTRYPOINT ["java", "-jar", "/microservice-gateway-zuul-0.0.1-SNAPSHOT.jar"]