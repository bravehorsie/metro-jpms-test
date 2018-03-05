Tests Metro (JAXB,JAXWS,WSIT) loaded as native JPMS (Java Platform Module System) modules.

```
mvn clean install
cd jaxb-runtime-client
mvn exec:exec
cd jaxb-ri-client
mvn exec:exec@runtime
mvn exec:exec@xjc
mvn exec:exec@jxc
```