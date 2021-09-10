data class Audio (
    override val id: Int,
    override val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int
): Attachment (id, ownerId)