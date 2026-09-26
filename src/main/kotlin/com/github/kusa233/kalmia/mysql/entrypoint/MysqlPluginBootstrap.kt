package com.github.kusa233.kalmia.mysql.entrypoint

import com.github.kusa233.kalmia.mysql.client.KalmiaMysqlClient
import com.github.kusa233.kalmia.mysql.config.KalmiaMysqlClientConfig
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.io.File

object MysqlPluginBootstrap {
    private val LOGGER: Logger = LogManager.getLogger("RedisPluginBootstrap")

    @JvmStatic
    fun init() {
        LOGGER.info("Initializing mysql client")
        val configFile = File("configs/mysql_client.json")

        KalmiaMysqlClient.init(KalmiaMysqlClientConfig.createConfig(configFile))
    }
}
