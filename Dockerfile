FROM java:8
VOLUME /tmp
ADD target/Scrum*.jar ScrumTeam.jar
RUN sh -c 'touch /ScrumTeam.jar'
ENV JAVA_OPTS="-Xmx256m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /ScrumTeam.jar"]
