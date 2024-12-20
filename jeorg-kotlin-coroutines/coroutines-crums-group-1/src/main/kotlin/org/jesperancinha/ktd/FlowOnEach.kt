package org.jesperancinha.ktd

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

class FlowOnEach {
    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()): Unit = runBlocking {
            val flow = flow {
                emit(1)
                emit(2)
                emit(3)
            }

            flow
                .onEach { value -> println("Received value: $value") }
                .collect { value -> println("Received collected value: $value") }
        }
    }
}