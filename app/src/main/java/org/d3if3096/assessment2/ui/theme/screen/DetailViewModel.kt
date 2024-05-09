package org.d3if3096.assessment2.ui.theme.screen

import androidx.lifecycle.ViewModel
import org.d3if3096.assessment2.model.Motor

class DetailViewModel : ViewModel() {
    fun getMotor(id: Long): Motor {
        return MainViewModel().data.firstOrNull { it.id == id } ?: Motor(0, "","","","")
    }
}