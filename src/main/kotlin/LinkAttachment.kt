data class LinkAttachment(
    override val type: String = "link",
    val link: Link = Link()
): Attachment


