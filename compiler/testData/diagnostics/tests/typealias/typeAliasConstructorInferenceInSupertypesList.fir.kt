open class Ref<T>(var x: T)

typealias R<T> = Ref<T>

// Type inference SHOULD NOT work for type alias constructor in supertypes list
class Test1 : R(0)
class Test2 : R<Int>(0)
