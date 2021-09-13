data class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int,
    val message: String,
    val replyToComment: Int,
    val stickerId: Int,
    val guid: Int
)