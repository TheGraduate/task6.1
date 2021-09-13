import java.lang.Exception

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var counterUnicId = 1

    fun add(post: Post): Post {
        val postWithUnicId = post.copy(id = counterUnicId++)
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

    fun createComment (comment: Comment) {
        for (count in posts) {
            if (count.id == comment.postId ) {
                comments += comment
                return
            }
        }
        throw Exception("PostNotFoundException")
    }
}