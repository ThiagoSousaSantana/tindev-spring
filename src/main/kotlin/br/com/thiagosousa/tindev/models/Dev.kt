package br.com.thiagosousa.tindev.models

import br.com.thiagosousa.tindev.controllers.dtos.DevForm
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Dev(
        @Id
        var _id: String? = null,
        val name: String,
        val user: String,
        val bio: String? = null,
        val avatar: String,
        var likes: List<String> = ArrayList(),
        var dislikes: List<String> = ArrayList()
){
        constructor(devForm: DevForm) : this(
                name = devForm.name,
                user = devForm.login,
                avatar = devForm.avatar_url,
                bio = devForm.bio
        )
}