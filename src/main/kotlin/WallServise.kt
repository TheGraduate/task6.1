
object WallService {
    var posts = emptyArray<Post>()
    private var counter = 1

    fun add(post: Post): Post {
        val postWithUnicId = post.copy(id = counter++)
        posts += postWithUnicId
        return posts.last()
    }

    fun update (post: Post): Boolean {
        for ((index, postInArray) in posts.withIndex()) {
            if (post.id == postInArray.id) {
                posts[index] = post.copy(ownerId = postInArray.ownerId, date = postInArray.date)
                return true
            }
        }
        return false
    }
}