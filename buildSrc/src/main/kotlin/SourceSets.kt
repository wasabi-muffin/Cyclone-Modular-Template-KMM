import org.gradle.api.NamedDomainObjectContainer
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

typealias SourceSets = NamedDomainObjectContainer<KotlinSourceSet>

private fun SourceSets.getOrCreate(name: String): KotlinSourceSet = findByName(name) ?: create(name)
// common
val SourceSets.commonMain: KotlinSourceSet get() = getOrCreate("commonMain")

fun SourceSets.commonMain(block: KotlinSourceSet.() -> Unit = {}) {
    commonMain.apply(block)
}

val SourceSets.commonTest: KotlinSourceSet get() = getOrCreate("commonTest")

fun SourceSets.commonTest(block: KotlinSourceSet.() -> Unit = {}) {
    commonTest.apply(block)
}
// jsNativeCommon
val SourceSets.jsNativeCommonMain: KotlinSourceSet get() = getOrCreate("jsNativeCommonMain")

fun SourceSets.jsNativeCommonMain(block: KotlinSourceSet.() -> Unit = {}) {
    jsNativeCommonMain.apply(block)
}

val SourceSets.jsNativeCommonTest: KotlinSourceSet get() = getOrCreate("jsNativeCommonTest")

fun SourceSets.jsNativeCommonTest(block: KotlinSourceSet.() -> Unit = {}) {
    jsNativeCommonTest.apply(block)
}
// jvmNativeCommon
val SourceSets.jvmNativeCommonMain: KotlinSourceSet get() = getOrCreate("jvmNativeCommonMain")

fun SourceSets.jvmNativeCommonMain(block: KotlinSourceSet.() -> Unit = {}) {
    jvmNativeCommonMain.apply(block)
}

val SourceSets.jvmNativeCommonTest: KotlinSourceSet get() = getOrCreate("jvmNativeCommonTest")

fun SourceSets.jvmNativeCommonTest(block: KotlinSourceSet.() -> Unit = {}) {
    jvmNativeCommonTest.apply(block)
}
// jvmCommon
val SourceSets.jvmCommonMain: KotlinSourceSet get() = getOrCreate("jvmCommonMain")

fun SourceSets.jvmCommonMain(block: KotlinSourceSet.() -> Unit = {}) {
    jvmCommonMain.apply(block)
}

val SourceSets.jvmCommonTest: KotlinSourceSet get() = getOrCreate("jvmCommonTest")

fun SourceSets.jvmCommonTest(block: KotlinSourceSet.() -> Unit = {}) {
    jvmCommonTest.apply(block)
}
// jvm
val SourceSets.jvmMain: KotlinSourceSet get() = getOrCreate("jvmMain")

fun SourceSets.jvmMain(block: KotlinSourceSet.() -> Unit = {}) {
    jvmMain.apply(block)
}

val SourceSets.jvmTest: KotlinSourceSet get() = getOrCreate("jvmTest")

fun SourceSets.jvmTest(block: KotlinSourceSet.() -> Unit = {}) {
    jvmTest.apply(block)
}
// android
val SourceSets.androidMain: KotlinSourceSet get() = getOrCreate("androidMain")

fun SourceSets.androidMain(block: KotlinSourceSet.() -> Unit = {}) {
    androidMain.apply(block)
}

val SourceSets.androidTest: KotlinSourceSet get() = getOrCreate("androidTest")

fun SourceSets.androidTest(block: KotlinSourceSet.() -> Unit = {}) {
    androidTest.apply(block)
}
// js
val SourceSets.jsMain: KotlinSourceSet get() = getOrCreate("jsMain")

fun SourceSets.jsMain(block: KotlinSourceSet.() -> Unit = {}) {
    jsMain.apply(block)
}

val SourceSets.jsTest: KotlinSourceSet get() = getOrCreate("jsTest")

fun SourceSets.jsTest(block: KotlinSourceSet.() -> Unit = {}) {
    jsTest.apply(block)
}
// nativeCommon
val SourceSets.nativeCommonMain: KotlinSourceSet get() = getOrCreate("nativeCommonMain")

fun SourceSets.nativeCommonMain(block: KotlinSourceSet.() -> Unit = {}) {
    nativeCommonMain.apply(block)
}

val SourceSets.nativeCommonTest: KotlinSourceSet get() = getOrCreate("nativeCommonTest")

fun SourceSets.nativeCommonTest(block: KotlinSourceSet.() -> Unit = {}) {
    nativeCommonTest.apply(block)
}
// linuxX64
val SourceSets.linuxX64Main: KotlinSourceSet get() = getOrCreate("linuxX64Main")

fun SourceSets.linuxX64Main(block: KotlinSourceSet.() -> Unit = {}) {
    linuxX64Main.apply(block)
}

val SourceSets.linuxX64Test: KotlinSourceSet get() = getOrCreate("linuxX64Test")

fun SourceSets.linuxX64Test(block: KotlinSourceSet.() -> Unit = {}) {
    linuxX64Test.apply(block)
}
// darwinCommon
val SourceSets.darwinCommonMain: KotlinSourceSet get() = getOrCreate("darwinCommonMain")

fun SourceSets.darwinCommonMain(block: KotlinSourceSet.() -> Unit = {}) {
    darwinCommonMain.apply(block)
}

val SourceSets.darwinCommonTest: KotlinSourceSet get() = getOrCreate("darwinCommonTest")

fun SourceSets.darwinCommonTest(block: KotlinSourceSet.() -> Unit = {}) {
    darwinCommonTest.apply(block)
}
// ios
val SourceSets.iosMain: KotlinSourceSet get() = getOrCreate("iosMain")

fun SourceSets.iosMain(block: KotlinSourceSet.() -> Unit = {}) {
    iosMain.apply(block)
}

val SourceSets.iosTest: KotlinSourceSet get() = getOrCreate("iosTest")

fun SourceSets.iosTest(block: KotlinSourceSet.() -> Unit = {}) {
    iosTest.apply(block)
}

val SourceSets.iosArm64Main: KotlinSourceSet get() = getOrCreate("iosArm64Main")

fun SourceSets.iosArm64Main(block: KotlinSourceSet.() -> Unit = {}) {
    iosArm64Main.apply(block)
}

val SourceSets.iosArm64Test: KotlinSourceSet get() = getOrCreate("iosArm64Test")

fun SourceSets.iosArm64Test(block: KotlinSourceSet.() -> Unit = {}) {
    iosArm64Test.apply(block)
}

val SourceSets.iosX64Main: KotlinSourceSet get() = getOrCreate("iosX64Main")

fun SourceSets.iosX64Main(block: KotlinSourceSet.() -> Unit = {}) {
    iosX64Main.apply(block)
}

val SourceSets.iosX64Test: KotlinSourceSet get() = getOrCreate("iosX64Test")

fun SourceSets.iosX64Test(block: KotlinSourceSet.() -> Unit = {}) {
    iosX64Test.apply(block)
}
// macosX64
val SourceSets.macosX64Main: KotlinSourceSet get() = getOrCreate("macosX64Main")

fun SourceSets.macosX64Main(block: KotlinSourceSet.() -> Unit = {}) {
    macosX64Main.apply(block)
}

val SourceSets.macosX64Test: KotlinSourceSet get() = getOrCreate("macosX64Test")

fun SourceSets.macosX64Test(block: KotlinSourceSet.() -> Unit = {}) {
    macosX64Test.apply(block)
}
