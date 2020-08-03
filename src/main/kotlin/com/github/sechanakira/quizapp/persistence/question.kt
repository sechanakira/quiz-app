package com.github.sechanakira.quizapp.persistence

import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class Question(val question: String, val answer: String)

class Option(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int,

        @Column(name = "title")
        val title: String,

        @Column(name = "description")
        val description: String)