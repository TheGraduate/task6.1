
data class Post (
      val id: Int,
      val ownerId: Int,
      val fromId: Int,
      val createdBy: Int,
      val date: Int,
      val text: String,
      val replyOwnerId: Int,
      val replyPostId: Int,
      val friendsOnly: Int,
      val comments: Int = 0,
      val copyright: Int,
      val likes: Int = 0,
      val reposts: Int,
      val views: Int,
      val postType: String,
      val signerId: Int,
      val canPin: Boolean,
      val canDelete: Boolean,
      val canEdit: Boolean,
      val isPinned: Int,
      val markedAsAds: Boolean,
      val isFavorite: Boolean,
      val donut: Int,
      val postponedId: Int
)

object WallService {
    var posts = emptyArray<Post>()
    private var counter = 1

    fun add(post: Post): Post {
        val postWithUnicId = post.copy(id = counter++)
        posts += postWithUnicId
        return posts.last()
    }

    fun update (id: Int): Boolean {
        var flag = false
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(id = post.id,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut,
                    postponedId = post.postponedId,
                    )
                flag = true
            }
        }
        return flag
    }
}

fun main() {

    val post1 =  Post(24,
        5,
        1,
        12,
        1,
        "1",
        1,
        1,
        1,
        2,
        1,
        5,
        1,
        2,
    "1",
        1,
        true,
        true,
        true,
        1,
    true,
        true,
        1,
        1
    )
    val post2 =  Post(240965,
        5654,
        15345,
        1245,
        1754324,
        "1456787654",
        451,
        145,
        154,
        2325,
        4531,
        644,
        143,
        2443,
        "1342",
        1,
        true,
        false,
        false,
        1,
        false,
        true,
        1,
        1
    )
    val post3 =  Post(2436,
        543243,
        1323,
        1234,
        12344634,
        "34534656",
        4,
        3,
        4,
        68,
        3425,
        90,
        45,
        78,
        "4745745",
        6,
        true,
        false,
        true,
        1,
        false,
        true,
        2,
        3
    )

    WallService.add(post1)
    WallService.add(post2)
    WallService.add(post3)

    for (post: Post in WallService.posts) {
        println(post)
    }

    println(WallService.update(1))

}