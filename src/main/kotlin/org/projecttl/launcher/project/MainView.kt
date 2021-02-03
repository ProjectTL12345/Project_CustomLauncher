package org.projecttl.launcher.project

import javafx.scene.Parent
import tornadofx.*

class MainView: View("Launcher Login") { // 265 x 130

    override val root: Parent = vbox {
        text("Username")
        textfield()

        text("Password")
        passwordfield()

        checkbox("Always Login") {
            action {
                if (this.isSelected) {
                    println("clicked check box. Status: ON")
                } else {
                    println("clicked check box. Status: OFF")
                }
            }
        }

        buttonbar {
            button("Login") {
                isDefaultButton = true
                action {
                    println("Clicked Login Button")

                }
            }
        }
    }
}