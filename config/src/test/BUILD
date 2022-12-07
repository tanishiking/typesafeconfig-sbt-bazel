load("@io_bazel_rules_scala//scala:scala.bzl", "scala_test")

scala_test(
    name = "test",
    srcs = glob(["**/*.scala"]),
    resources = glob(["resources/**"]),
    deps = [
        "@maven//:com_typesafe_config",
        "//config/src/main"
    ]
)
