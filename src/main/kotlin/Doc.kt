data class Doc (
    override val id: Int,
    override val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String
): Attachment (id, ownerId)