package org.projecttl.launcher.project.utils

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import javax.naming.AuthenticationException


class Profile(private var id: String, private var name: String) {

    private val authUrl: URL = URL("https://authserver.mojang.com/authenticate")
    private val version: Int = 1
    private var accessToken: String? = null

    @Throws(IOException::class, InterruptedException::class, AuthenticationException::class)
    fun login(id: String, password: String) {
        val connection: HttpURLConnection = authUrl.openConnection() as HttpURLConnection
        var clientToken = ""

        connection.contentType.equals("application/json", true)
        connection.requestMethod = "POST"

        // TODO Use InputStreamReader and OutputStreamWriter
        val json = "{\"agent\":{\"name\":\"Minecraft\", \"version\":$version}, \"username\":\"$id\", \"password\":\"$password\", \"clientToken\":\"$clientToken\"}"
    }
}