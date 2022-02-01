package com.example.overview

import com.example.overview.dummy.Review
import com.example.srpsamples.dummy.User

class ReviewsUsersSubPresenter {
    val reviews = arrayListOf<Review>()
    val users = arrayListOf<User>()

    fun clearReviews() =
        reviews.clear()

    fun addReview(review: Review) =
        reviews.add(review)

    fun clearUsers() =
        users.clear()

    fun addUser(user: User) =
        users.add(user)
}