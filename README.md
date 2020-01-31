# Getting Started

Runing with promentheus agent:
	java -javaagent:target/docker/camel-springboot/0.0.1-SNAPSHOT/build/maven/agent/jmx_prometheus_javaagent-0.10.jar=9779:target/docker/camel-springboot/0.0.1-SNAPSHOT/build/maven/agent/config.yml -jar target/camel-springboot-0.0.1-SNAPSHOT.jar

The JMX exporter will open port 9779 (default Prometheus port), and use the YAML configuration file to expose the metrics. To confirm the exporter is active, open a browser and hit the following URL:
	http://localhost:9779

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/maven-plugin/)
* [Camel-Prometheus]https://brunonetid.github.io/2017/11/27/camel-prometheus-openshift.html

### Guides
The following guides illustrate how to use some features concretely:

* [Using Apache Camel with Spring Boot](https://camel.apache.org/spring-boot)

