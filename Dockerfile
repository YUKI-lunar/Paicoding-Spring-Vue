# 使用官方 JDK 17 镜像作为基础
FROM eclipse-temurin:17-jre

# 工作目录
WORKDIR /app

# 将构建好的 jar 复制到容器
COPY paicoding-web/target/paicoding-web-0.0.1-SNAPSHOT.jar /app/paicoding-web.jar

# 容器启动时执行 jar
ENTRYPOINT ["java","-jar","app.jar"]
