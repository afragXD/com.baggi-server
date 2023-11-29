package com.BragiServer

import com.BragiServer.plugins.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)
//{
//    embeddedServer(CIO, port = 8080, host = "0.0.0.0", module = Application::module)
//        .start(wait = true)
//}

fun Application.module() {
    configureHTTP()
    configureRouting()
}
