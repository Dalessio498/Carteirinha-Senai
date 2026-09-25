package com.senai.carteirinha_dalessio.App.di


import com.senai.carteirinha_dalessio.feature.Login.data.repository.LoginRepository

interface AppContainer {

    val loginRepository: LoginRepository

    val unidadeCurricularRepository: UnidadeCurricularRepository

    val authTokenStore: AuthTokenStore
}