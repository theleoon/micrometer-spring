# Spring Boot Micrometer with Prometheus Example

Docs: https://micrometer.io/docs/ref/spring/1.5#_data_source_monitoring

- `http://localhost:8091/rest/hello`, `http://localhost:8091/rest/hello2` - Different REST endpoints which are collected by Micrometer for Prometheus
- `http://localhost:8091/prometheus` - Endpoint where the Prometheus metrics can be accessed.