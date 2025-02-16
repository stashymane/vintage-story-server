import kotlinx.io.files.Path

object JvmNativePlatform : NativePlatform {
    override val targetName: String = "linuxserver"
}

actual fun NativePlatform.Companion.get(): NativePlatform = JvmNativePlatform

actual fun Path.untarTo(destination: Path) {
    TODO("Not yet implemented")
}
