import postComponents.*

fun main() {
    val post1 = Post()
    val post2 = Post()
    val post3 = Post()

    val resultOne = WallService.add(post1)
    println("ID первого поста: ${resultOne.id}")
    val resultTwo = WallService.add(post2)
    println("ID второго поста: ${resultTwo.id}")
    val resultThree = WallService.add(post3)
    println("ID третьего поста: ${resultThree.id}")

    val postOneIsChange = WallService.update(resultOne)
    println("Пост изменен: $postOneIsChange")
    val postTwoIsChange = WallService.update(resultTwo)
    println("Пост изменен: $postTwoIsChange")
    val postThreeIsChange = WallService.update(resultThree)
    println("Пост изменен: $postThreeIsChange")
}