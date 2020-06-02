def call() {
    def version = readFile('VERSION').trim()
    def commit = sh(
        script: "printf \$(git rev-parse --short ${GIT_COMMIT})",
        returnStdout: true
    )
    return version + "." + commit
}