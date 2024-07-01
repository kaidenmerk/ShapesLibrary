class Point(private var x: Double, private var y: Double) {

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun clone(): Point {
        return Point(x, y)
    }

    private fun moveX(delta: Double){
        x += delta
    }
    private fun moveY(delta: Double){
        y += delta
    }

    fun move(deltaX: Double, deltaY: Double) {
        moveX(deltaX)
        moveY(deltaY)
    }

    fun printPoint() {
        print("($x, $y)")
    }
}