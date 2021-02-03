package org.projecttl.launcher.project.utils

import com.mysql.cj.Session
import java.io.IOException
import javax.naming.AuthenticationException


class Login {

    private val authUrl = "https://authserver.mojang.com/authenticate"

    @Throws(IOException::class, InterruptedException::class, AuthenticationException::class)
    fun login(agent: String, id: String, password: String): List<Session?> {
        // TODO Create login logic

        return emptyList() // Temporary code
    }
}