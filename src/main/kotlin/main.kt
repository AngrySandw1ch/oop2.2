import postComponents.*

fun main() {
    val post1 = Post()
    val post2 = Post()
    val post3 = Post()
    val wallService = WallService()

    val resultOne = wallService.add(post1)
    println("ID первого поста: ${resultOne.id}")
    val resultTwo = wallService.add(post2)
    println("ID второго поста: ${resultTwo.id}")
    val resultThree = wallService.add(post3)
    println("ID третьего поста: ${resultThree.id}")

    val postOneIsChange = wallService.update(resultOne)
    println("Пост изменен: $postOneIsChange")
    val postTwoIsChange = wallService.update(resultTwo)
    println("Пост изменен: $postTwoIsChange")
    val postThreeIsChange = wallService.update(resultThree)
    println("Пост изменен: $postThreeIsChange")
}