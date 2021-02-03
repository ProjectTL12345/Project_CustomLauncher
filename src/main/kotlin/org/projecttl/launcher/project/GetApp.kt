package org.projecttl.launcher.project

import tornadofx.App
import tornadofx.launch

class GetApp: App(MainView::class)

fun guiConfig() {
    launch<GetApp>()
}