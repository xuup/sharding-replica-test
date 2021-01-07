# sharding-replica-test

### 问题描述

#### 基于jdbc可以实现读写分离，也可以在插入数据时根据路由规则插入到指定数据库表中

#### 基于mybatis可以实现读写分离，但是插入数据会插入到primary节点中t_order_0和t_order_1表中，没有进行规则匹配

### 问题复现代码
```java
sharding-replica:
  - src
    - test
      - java
        - com.xup.example
          - raw
            - ReplicaTest //jdbc test
          ReplicaTest //mybatis test
```


