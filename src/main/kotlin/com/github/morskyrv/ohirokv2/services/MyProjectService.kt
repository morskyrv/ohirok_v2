package com.github.morskyrv.ohirokv2.services

import com.github.morskyrv.ohirokv2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
