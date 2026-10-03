#!/usr/bin/env kotlin

interface PaymentMethod {
    fun pay(amount: Double)
}