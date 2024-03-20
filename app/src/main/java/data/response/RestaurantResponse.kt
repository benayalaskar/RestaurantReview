package data.response

import com.google.gson.annotations.SerializedName

class RestaurantResponse(

    @field:SerializedName("restaurant")
    val restaurant: Restaurant,

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String
)

class CustomerReviewsItem(

    @field:SerializedName("date")
    val date: String,

    @field:SerializedName("review")
    val review: String,

    @field:SerializedName("name")
    val name: String
)

class Restaurant(

    @field:SerializedName("customerReviews")
    val customerReviews: List<CustomerReviewsItem>,

    @field:SerializedName("pictureId")
    val pictureId: String,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("rating")
    val rating: Any,

    @field:SerializedName("description")
    val description: String,

    @field:SerializedName("id")
    val id: String
)

data class PostReviewResponse(

    @field:SerializedName("customerReviews")
    val customerReviews: List<CustomerReviewsItem>,

    @field:SerializedName("error")
    val error: Boolean,

    @field:SerializedName("message")
    val message: String
)
