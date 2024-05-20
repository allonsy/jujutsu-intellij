package com.github.allonsy.jujutsuintellij.toolWindow

import com.intellij.openapi.components.service
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBPanel
import com.intellij.openapi.wm.ToolWindow
import com.github.allonsy.jujutsuintellij.MyBundle
import com.github.allonsy.jujutsuintellij.services.JjLogService
import javax.swing.JButton

class Jujutsu(toolWindow: ToolWindow) {

    private val service = toolWindow.project.service<JjLogService>()

    fun getContent() = JBPanel<JBPanel<*>>().apply {
        val label = JBLabel(MyBundle.message("randomLabel", "?"))

        add(label)
        add(JButton(MyBundle.message("shuffle")).apply {
            addActionListener {
                label.text = MyBundle.message("randomLabel", service.getJJLog())
            }
        })
    }
}