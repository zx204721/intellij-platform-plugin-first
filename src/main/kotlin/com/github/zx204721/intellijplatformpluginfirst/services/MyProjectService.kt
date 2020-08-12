package com.github.zx204721.intellijplatformpluginfirst.services

import com.intellij.openapi.project.Project
import com.github.zx204721.intellijplatformpluginfirst.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
