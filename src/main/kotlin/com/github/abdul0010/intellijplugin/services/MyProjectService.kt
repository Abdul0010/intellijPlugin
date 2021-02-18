package com.github.abdul0010.intellijplugin.services

import com.github.abdul0010.intellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
