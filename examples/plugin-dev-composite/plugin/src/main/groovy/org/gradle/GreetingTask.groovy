package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class GreetingTask extends DefaultTask {
    String who = 'mate'

    @TaskAction
    def greet() {
        println "G'day ${who}!!!"
    }
}
