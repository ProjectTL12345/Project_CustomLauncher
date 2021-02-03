package org.projecttl.launcher.project

import tornadofx.App
import tornadofx.launch

class MainLauncher {
    companion object {

        @JvmStatic
        fun main(args: Array<out String>) {
            launch<GetView>()
        }
    }
}

class GetView: App(MainView::class)