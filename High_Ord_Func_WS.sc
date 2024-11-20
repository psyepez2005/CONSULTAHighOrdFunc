// Pedro Yepez
def integracion(f:Double=>Double,a:Double,b:Double):Double={
  val promedio:Double = (a+b)/2
  (b-a)*((f(a)+(4*f(promedio))+f(b))/6)
}

///////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////

val f1: Double=>Double = (x: Double) => -math.pow(x, 2) + 8 * x - 12

val r1= integracion(f1,3,5)

//--------------------------------
val f2: Double=>Double = (x: Double) => 3*math.pow(x,2)

val r2= integracion(f2,0,2)

//--------------------------------
val f3: Double=>Double = (x: Double) => x+(2*math.pow(x,2))-math.pow(x,3)+(5*math.pow(x,4))

val r3= integracion(f3,-1,1)

//--------------------------------
val f4: Double=>Double = (x: Double) => (2*x+1)/(math.pow(x,2)+x)

val r4= integracion(f4,1,2)

//--------------------------------
val f5: Double=>Double = (x: Double) => math.exp(x)

val r5= integracion(f5,0,1)

//--------------------------------
val f6: Double=>Double = (x: Double) => 1/math.sqrt(x-1)

val r6= integracion(f6,2,3)

//--------------------------------
val f7: Double=>Double = (x: Double) => 1/(1+math.pow(x,2))

val r7= integracion(f7,0,1)

//--------------------------------


///////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////


def calError(esp:Double,obt:Double):Double = math.abs(esp-obt)

val e1 = calError(r1,7.33)

val e2 = calError(r2,8)

val e3 = calError(r3,3.333)

val e4 = calError(r4,1.09861)

val e5 = calError(r5,1.71828)

val e6 = calError(r6,0.828427)

val e7 = calError(r2,0.785398)