data class Photo(
     override val id: Int,
     override val ownerId: Int,
     val albumId: Int,
     val text: String,
     val date: Int
): Attachment (id, ownerId)
