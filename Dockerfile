# 使用 OpenJDK 作为基础镜像
FROM eclipse-temurin:17-jre

# 设置工作目录
WORKDIR /app

# 复制 JAR 文件到容器中
COPY paicoding-web/target/paicoding-web-0.0.1-SNAPSHOT.jar  /app/app.jar

# 暴露 Spring Boot 端口
EXPOSE 8080

# 设置 JVM 参数（可选）
ENV JAVA_OPTS="-Xmx512m -Xms256m"

# 运行 Spring Boot 应用
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
