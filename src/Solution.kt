fun main() {
    val image = listOf(
        listOf(1, 0, 0, 1, 1, 1),
        listOf(1, 0, 0, 1, 1, 1),
        listOf(1, 0, 0, 1, 1, 1)
    )
    println(findRectangle(image))
}
fun findRectangle(image:List<List<Int>>):List<Int> {
    var firstzero= mutableListOf<Int>()
    var lastzero=mutableListOf<Int>(0,0)
    var find=false
    var j=0
    while (!find){
        for (i in image.indices){
            if (image[i][j]==0){
                firstzero.add(i)
                firstzero.add(j)
                find=true
                break
            }
        }
        j++
    }
    for (i in image.indices) {
        for (j in image[i].indices) {
            if (image[i][j]==0){
                lastzero[0]=i
                lastzero[1]=j
            }
        }

    }
    return firstzero+lastzero
}
