package io.github.gmvalentino8.utils

import java.util.UUID

actual object UUID {
    actual fun randomUUID(): String = UUID.randomUUID().toString()
}
