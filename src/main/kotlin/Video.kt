data class Video (
    override val id: Int,
    override val ownerId: Int,
    val videoTitle: Int,
    val videoDescription: String,
    val videoDuration: Int,
): Attachment (id, ownerId)