package org.projecttl.launcher.project

import javafx.stage.Stage
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

class GetView: App(MainView::class) {

    override fun start(stage: Stage) {
        super.start(stage)

        stage.width = 270.0
        stage.height = 170.0
    }
}