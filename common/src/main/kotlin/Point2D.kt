data class Point2D(val x: Long, val y: Long) {
    constructor(x: Int, y: Int): this(x.toLong(), y.toLong())
    operator fun plus(other: Point2D) = Point2D(x + other.x, y + other.y)
    operator fun minus(other: Point2D) = Point2D(x - other.x, y - other.y)
    val cardinalNeighbors: List<Point2D>
        get() = listOf(UP, DOWN, LEFT, RIGHT).map { it + this }
    companion object {
        val UP = Point2D(0, -1)
        val DOWN = Point2D(0, 1)
        val LEFT = Point2D(-1, 0)
        val RIGHT = Point2D(1, 0)
    }
}