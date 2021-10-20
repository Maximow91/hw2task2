fun main(args: Array<String>) {
    while (true){
    println("Введите количество лайков")
    var likes : Int = readLine()!!.toInt()
    if (likes == 1) {
        println("Понравилось $likes человеку")
    } else if (likes.toString().contains("11")){
        println("Понравилось $likes людям")
    } else if (likes > 20 && likes.toString().contains("1")){
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
    }
}