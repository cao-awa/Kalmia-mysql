# Kalmia-redis
A MySQL client plugin for Kalmia webserver.

## Usage
Add dependencies firsy:
```groovy
repositories {
    maven {
        url 'https://jitpack.io'
    }
}

dependencies {
    implementation 'com.github.cao-awa:Kalmia-mysql:{version}'
}
```

For the versions, see [JitPack](https://jitpack.io/#cao-awa/Kalmia-mysql).

And use redis client in your code:
```kotlin
import com.github.cao.awa.kalmia.mysql.client.KalmiaMysqlClient

object Test {
    @JvmStatic
    fun entry() {
        val mysqlClient = KalmiaMysqlClient.INSTANCE
        val result = mysqlClient.execute("SELECT User, Host FROM mysql.user;")
        for (column in result.columns) {
            println(": Column: ${column.name}-")
            for (data in result.getValues(column)) {
                println(data)
            }
        }

        val userLine = result.getLine("User", "mysql.sys")
        println(userLine)

        val hostLine = result.getLine("Host", "127.0.0.1")
        println(hostLine)

        val specialLine = result.getLine(1)
        println(specialLine)
    }
}
```

In produce environment, you need put the ``kalmia-mysql`` jar to ``libs/`` directory and declare entrypoint:
```json
{
    "entrypoint": [
        "kalmia-mysql-client",
        "com.yourservice.xxx.ServiceEntrypoint#entry"
    ]
}
```

For entrypoint, please see [Kalmia's document](https://github.com/cao-awa/Kalmia/tree/main/docs/entrypoint)/