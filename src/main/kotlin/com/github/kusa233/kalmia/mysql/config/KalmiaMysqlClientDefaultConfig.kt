package com.github.kusa233.kalmia.mysql.config

object KalmiaMysqlClientDefaultConfig: KalmiaMysqlClientConfig() {
    private fun throwWhenSet(): Nothing {
        error("Cannot set config in default server config instance")
    }

    override fun host(host: String): KalmiaMysqlClientConfig {
        throwWhenSet()
    }

    override fun port(port: Int): KalmiaMysqlClientConfig {
        throwWhenSet()
    }

    override fun username(username: String): KalmiaMysqlClientConfig {
        throwWhenSet()
    }

    override fun password(password: String): KalmiaMysqlClientConfig {
        throwWhenSet()
    }

    override fun database(database: String): KalmiaMysqlClientConfig {
        throwWhenSet()
    }

    override fun reconnectTime(reconnectTime: Int): KalmiaMysqlClientConfig {
        throwWhenSet()
    }
}