# Dockerfile for apollo-portal
# Build with:
# docker build -t itmuch/microservice-hystrix-turbine:0.0.1-SNAPSHOT .
# Run with:
# docker run -p 8031:8031 -d --name microservice-hystrix-turbine itmuch/microservice-hystrix-turbine:0.0.1-SNAPSHOT
FROM java:8-jre
MAINTAINER KEN

ENV VERSION 0.0.1-SNAPSHOT
ENV FINALNAME microservice-hystrix-turbine

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone

ADD ${FINALNAME}-${VERSION}.jar /${FINALNAME}-${VERSION}.jar

EXPOSE 8010

ENTRYPOINT ["java", "-jar", "/microservice-hystrix-turbine-0.0.1-SNAPSHOT.jar"]