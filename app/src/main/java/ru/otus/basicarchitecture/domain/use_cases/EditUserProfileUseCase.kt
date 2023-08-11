package ru.otus.basicarchitecture.domain.use_cases

import ru.otus.basicarchitecture.domain.entities.User
import ru.otus.basicarchitecture.domain.repositories.UserRepository

class EditUserProfileUseCase(private val userRepository: UserRepository) {

    fun editUserProfile(user:User){
        userRepository.editUserProfile(user)
    }
}