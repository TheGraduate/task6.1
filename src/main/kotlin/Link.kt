data class Link(
    override val id: Int,
    override val ownerId: Int,
    val url: String,
    val title: String,
    val description: String,
): Attachment (id, ownerId)


