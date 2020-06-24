package com.saurabh.clientrecords.data

data class Record(val name: String, val email: String) {
    override fun toString(): String {
        return "$name - $email "
    }
}