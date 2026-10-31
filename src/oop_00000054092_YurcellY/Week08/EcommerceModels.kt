package oop_00000054092_YurcellY.Week08

sealed class Product {
    class Electronic(val id: String, val name: String, val warrantyMonths: Int) : Product()
    class Clothing(val id: String, val name: String, val size: String) : Product()
}