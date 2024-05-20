package com.github.allonsy.jujutsuintellij.services

import com.intellij.openapi.components.Service
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.github.allonsy.jujutsuintellij.MyBundle

@Service(Service.Level.PROJECT)
class JjLogService(project: Project) {

    fun getJJLog(): String {
        return "here is the log"
    }
}
