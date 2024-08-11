plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.composeCompiler).apply(false)
    alias(libs.plugins.jetbrainsCompose).apply (false)
    alias(libs.plugins.kotlinxSerialization).apply (false)
    alias(libs.plugins.kmpNativeCoroutines).apply (false)
    alias(libs.plugins.ksp).apply(false)
}