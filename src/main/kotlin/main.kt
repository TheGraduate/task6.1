
fun main() {
    val post1 =  Post(1,
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
        "post",
        postSource = PostSource("1","1","1","1"),
        attachments = PhotoAttachment(),
        geo = Geo("1","1","1"),
        1,
        null,
        true,
        true,
        true,
        1,
        true,
        true,
        donut = Donut(true,2,true,true,"5"),
        1
    )

    val post2 =  Post(2,
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
        "post",
        postSource = PostSource("1","1","1","1"),
        attachments = LinkAttachment(),
        geo = Geo("1","1","1"),
        1,
        null,
        true,
        true,
        true,
        1,
        true,
        true,
        donut = Donut(true,2,true,true,"5"),
        1
    )
    val comment1 = Comment(
        1,
        1,
        3,
        "4",
        4,
        1,
        1
    )

    val comment2 = Comment(
        2,
        2,
        5,
        "3",
        4,
        6,
        4
    )

    //WallService.add(post1)
    //WallService.add(post2)
    //WallService.update(post1)
    //WallService.createComment(comment1)
    //WallService.createComment(comment2)
}

