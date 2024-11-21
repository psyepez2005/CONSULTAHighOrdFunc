/*
1. El tipo de dato que devolverá la función integracion
  Devuelve un Double, es decir la resolución de la integral definida

2. ¿Cuáles son los parámetros que recibe la función?
  Recibe 3 parametros
  1. una función que pide un Double y devuelve un Double (f)
  2. el límite inferior (a)
  3. el límite superior (b)
*/

// Pedro Yepez
def integracion(f:Double=>Double,a:Double,b:Double):Double={
  val promedio:Double = (a+b)/2
  (b-a)*((f(a)+(4*f(promedio))+f(b))/6)
}

///////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////

val f1: Double=>Double = (x: Double) => -math.pow(x, 2) + 8 * x - 12

val r1: Double= integracion(f1,3,5) //= 7.333333333333333

//--------------------------------
val f2: Double=>Double = (x: Double) => 3*math.pow(x,2)

val r2: Double= integracion(f2,0,2) //= 8.0

//--------------------------------
val f3: Double=>Double = (x: Double) => x+(2*math.pow(x,2))-math.pow(x,3)+(5*math.pow(x,4))

val r3: Double= integracion(f3,-1,1)  //= 4.666666666666667

//--------------------------------
val f4: Double=>Double = (x: Double) => (2*x+1)/(math.pow(x,2)+x)

val r4: Double= integracion(f4,1,2) //= 1.0999999999999999

//--------------------------------
val f5: Double=>Double = (x: Double) => math.exp(x)

val r5: Double= integracion(f5,0,1) //= 1.7188611518765928

//--------------------------------
val f6: Double=>Double = (x: Double) => 1/math.sqrt(x-1)

val r6: Double= integracion(f6,2,3) //= 0.8288488508162422

//--------------------------------
val f7: Double=>Double = (x: Double) => 1/(1+math.pow(x,2))

val r7: Double= integracion(f7,0,1) //= 0.7833333333333333

//--------------------------------


///////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////


def calError(esp:Double,obt:Double):Double = math.abs(esp-obt)

val e1: Double = calError(7.33,r1)      //= 0.0033333333333329662

val e2: Double = calError(8,r2)         //= 0.0

val e3: Double = calError(3.333,r3)     //= 1.3336666666666668

val e4: Double = calError(1.09861,r4)   //= 0.0013899999999997803

val e5: Double = calError(1.71828,r5)   //= 5.811518765928003E-4 (es notación científica)= 0.0005811518765928003

val e6: Double = calError(0.828427,r6)  //= 4.2185081624213083E-4 (es notación científica)= 0.00042185081624213083

val e7: Double = calError(0.785398,r7) 	//= 0.0020646666666667146