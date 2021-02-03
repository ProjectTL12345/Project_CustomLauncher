package org.projecttl.launcher.project

import javafx.scene.Parent
import tornadofx.View
import tornadofx.label
import tornadofx.vbox

class MainView: View() {
    override val root: Parent = vbox {
        label("Hello, World")
    }
}