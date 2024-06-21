package com.atiurin.sampleapp.data

class Credentials {
    companion object {
        private const val USERNAME = "joey"
        private const val PASSWORD = "1234"
    }
    fun getUsername(): String {
        return USERNAME
    }

    fun getPassword(): String {
        return PASSWORD
    }
}