package basics

class Vect2D(val x: Double, val y:Double) {
  def plus(v: Vect2D) = new Vect2D(x+v.x, y+v.y)
  def minus(v: Vect2D) = new Vect2D(x-v.x, y-v.y)
  def scale(c: Double) = new Vect2D(x*c,y*c)
  def magnitude: Double = math.sqrt(x*x + y*y)

}

//same object and class name, the object is called companion object
object Vect2D extends App {
  override def main(args:Array[String]):Unit = {
    val v1 = new Vect2D(1,2)
    val v2 = new Vect2D(2,2)
    val v3 = v1.plus(v2)
    println(v3.magnitude + "pppp")
  }

}
