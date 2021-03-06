package com.hendisantika.oprek.campuran

/**
 * Created by hendisantika on 7/10/17.
 */
enum class UnixFileType {
    D, HYPHEN_MINUS, L
}

sealed class UnixFile {

    abstract fun getFileType(): UnixFileType

    class RegularFile(val content: String) : UnixFile() {
        override fun getFileType(): UnixFileType {
            return UnixFileType.HYPHEN_MINUS
        }
    }

    class Directory(val children: List<UnixFile>) : UnixFile() {
        override fun getFileType(): UnixFileType {
            return UnixFileType.D
        }
    }

    class SymbolicLink(val originalFile: UnixFile) : UnixFile() {
        override fun getFileType(): UnixFileType {
            return UnixFileType.L
        }
    }
}